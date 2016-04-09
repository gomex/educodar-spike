package generator;

import educodar.antlr.EducodarBaseVisitor;
import educodar.antlr.EducodarParser;

public class RubySinatraGenerator extends EducodarBaseVisitor {
    @Override
    public String visitProgram(EducodarParser.ProgramContext ctx) {
        String routesBlock = visitRoutesBlock((EducodarParser.RoutesBlockContext) ctx.getChild(2));

        String program = "require 'sinatra'\n\n";
        program += routesBlock;

        return program;
    }

    @Override
    public String visitRoutesBlock(EducodarParser.RoutesBlockContext ctx) {
        int lastRouteIndex = ctx.getChildCount() - 2;
        String routesBlock = "";
        for(int index = 2; index <= lastRouteIndex; index++) {
            routesBlock += visitRouteDef((EducodarParser.RouteDefContext) ctx.getChild(index)) + "\n";
        }

        return routesBlock;
    }

    @Override
    public String visitRouteDef(EducodarParser.RouteDefContext ctx) {
        String route = ctx.getChild(1).getText();
        String blockContent = visitExpression((EducodarParser.ExpressionContext) ctx.getChild(4));

        String routeDef = "get " + route + " do\n\t" + blockContent + "end\n";
        return routeDef;
    }

    @Override
    public String visitExpression(EducodarParser.ExpressionContext ctx) {
        String returnValue = ctx.getChild(1).getText();
        String compiledString = "return " + returnValue + ";\n";
        return compiledString;
    }
}
