package genaration;

import AST.program;

import java.util.ArrayList;

public class Generator {

    private static int pageNumber = 1;
    public static Page currentPage;
    private ArrayList<Page> pages = new ArrayList<>();
    private static Class currentClass;
    public void createHTMLPage(String name) {
        Page page = new Page(name + ".html");
        currentPage = page;
        pages.add(page);
        pageNumber++;
    }
    public void createJSPage(String name) {
        Page page = new Page(name + ".js");
        currentPage = page;
        pages.add(page);
    }
    public void startGenerate(program program) {


        this.createJSPage("global");
        String Component1 = program.generateList();
        currentPage.writeOnFile(Component1);
        currentPage.closeFile();
        this.createHTMLPage("ProductPage");

        String bodyString = "";

        String scriptString = "";
        scriptString += "\n\t\t<script src=\" ./global.js \">";
        scriptString += "</script>\n ";
        String classCode = "<!DOCTYPE html>\n";
        classCode += "<html lang=\"en\">\n";
        classCode += "<head>\n";
        classCode+=" \t<meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">";
        classCode +="\n\t <style> \n";
        classCode += getStyle();
        classCode+=  "\t\t</style>\n";
        classCode += "\t </head>\n";
        classCode+="\t\t<body>\n";
        classCode += getBodyString();
        classCode+=bodyString;
        classCode += scriptString;
        classCode+= "</body>\n";
        classCode += "</html>\n";
        ;
        currentPage.writeOnFile(classCode);
        currentPage.closeFile();
    }









public  String getStyle(){
        return
                "        .container {\n" +
                "          display: flex;\n" +
                "          justify-content: space-between;\n" +
                "          padding: 20px;\n" +
                "        }\n" +
                "\n" +
                "        .product-list {\n" +
                "          flex: 1;\n" +
                "          margin-right: 20px;\n" +
                "        }\n" +
                "\n" +
                "        .product-list h2 {\n" +
                "          margin-top: 0;\n" +
                "        }\n" +
                "\n" +
                "        .product-list ul {\n" +
                "          list-style-type: none;\n" +
                "          padding: 0;\n" +
                "        }\n" +
                "\n" +
                "        .product-list li {\n" +
                "          cursor: pointer;\n" +
                "          padding: 10px;\n" +
                "          border-bottom: 1px solid #ccc;\n" +
                "        }\n" +
                "\n" +
                "        .product-list li:hover {\n" +
                "          background-color: #f4f4f4;\n" +
                "        }\n" +
                "\n" +
                "        .product-details {\n" +
                "          flex: 1;\n" +
                "          background-color: #f4f4f4;\n" +
                "          padding: 20px;\n" +
                "          text-align: center;\n" +
                "        }\n" +
                "\n" +
                "        .product-details img {\n" +
                "          max-width: 100%;\n" +
                "          height: auto;\n" +
                "        }\n" ;
}

public  String getBodyString(){
        return "<div class=\"container\">\n" +
                "    <div class=\"product-list\">\n" +
                "        <h2>Product List</h2>\n" +
                "        <ul id=\"product-list\">\n" +
                "        </ul>\n" +
                "    </div>\n" +
                "    <div class=\"product-details\" id=\"product-details\">\n" +
                "        <h3 id=\"product-name\"></h3>\n" +
                "        <img id=\"product-image\" alt=\"Product Image\">\n" +
                "        <p id=\"product-description\"></p>\n" +
                "    </div>\n" +
                "</div>";
}
    public String getHtmlCode(String html) {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Document</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    " + html+
                "    <script src=\"index.js\"></script>\n" +
                "</body>\n" +
                "</html>";
    }


}
