package parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Stack;

import Log.Log;
import codeGenerator.CodeGeneratorFacade;
import errorHandler.ErrorHandler;
import scanner.lexicalAnalyzer;
import scanner.token.Token;

import java.util.List;

public class Parser {
    List<Rule> rules;
    private Stack<Integer> parsStack;
    private ParseTable parseTable;
    private CodeGeneratorFacade codeGeneratorFacade;

    public Parser() {
        initializeParseStack();
        initializeParseTable();
        initializeRules();
        initializeCodeGenerator();
    }

    public void startParse(java.util.Scanner sc) {
        lexicalAnalyzer lexicalAnalyzer = new lexicalAnalyzer(sc);
        Token lookAhead = lexicalAnalyzer.getNextToken();
        boolean finish = false;
        Action currentAction;
        while (!finish) {
            try {
                Log.print(/*"lookahead : "+*/ lookAhead.toString() + "\t" + parsStack.peek());
                currentAction = parseTable.getActionTable(parsStack.peek(), lookAhead);
                Log.print(currentAction.toString());

                if (currentAction.action == act.shift) {
                    parsStack.push(currentAction.number);
                    lookAhead = lexicalAnalyzer.getNextToken();
                }
                if (currentAction.action == act.reduce) {
                    Rule rule = rules.get(currentAction.number);
                    for (int i = 0; i < rule.RHS.size(); i++) {
                        parsStack.pop();
                    }

                    Log.print(/*"state : " +*/ parsStack.peek() + "\t" + rule.LHS);
                    parsStack.push(parseTable.getGotoTable(parsStack.peek(), rule.LHS));
                    Log.print(/*"new State : " + */parsStack.peek() + "");
                    try {
                        codeGeneratorFacade.semanticFunction(rule.semanticAction, lookAhead);
                    } catch (Exception e) {
                        Log.print("Code Genetator Error");
                    }
                }
                if (currentAction.action == act.accept)
                        finish = true;
                Log.print("");
            } catch (Exception ignored) {
                ignored.printStackTrace();
            }
        }
        if (!ErrorHandler.hasError) {
            codeGeneratorFacade.printMemory();
        }
    }

    private void initializeCodeGenerator() {
        codeGeneratorFacade = new CodeGeneratorFacade();
    }

    private void initializeRules() {
        rules = new ArrayList<Rule>();
        try {
            for (String stringRule : Files.readAllLines(Paths.get("src/main/resources/Rules"))) {
                rules.add(new Rule(stringRule));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initializeParseTable() {
        try {
            parseTable = new ParseTable(Files.readAllLines(Paths.get("src/main/resources/parseTable")).get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initializeParseStack() {
        parsStack = new Stack<Integer>();
        parsStack.push(0);
    }
}
