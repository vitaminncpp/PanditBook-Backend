package com.akshayaap.panditbook.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class ErrorController {

    @GetMapping("/error")
    @ResponseBody
    public String error() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Fuck !</title>\n" +
                "    <link rel=\"stylesheet\" href=\"https://akshayaap.github.io/assets/style.css\">\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "\n" +
                "\n" +
                "\n" +
                "    <div class=\"box\">\n" +
                "        <div class=\"box__ghost\">\n" +
                "            <div class=\"symbol\"></div>\n" +
                "            <div class=\"symbol\"></div>\n" +
                "            <div class=\"symbol\"></div>\n" +
                "            <div class=\"symbol\"></div>\n" +
                "            <div class=\"symbol\"></div>\n" +
                "            <div class=\"symbol\"></div>\n" +
                "\n" +
                "\n" +
                "            <div class=\"box__ghost-container\">\n" +
                "                <div class=\"box__ghost-eyes\">\n" +
                "                    <div class=\"box__eye-left\"></div>\n" +
                "                    <div class=\"box__eye-right\"></div>\n" +
                "                </div>\n" +
                "                <div class=\"box__ghost-bottom\">\n" +
                "                    <div></div>\n" +
                "                    <div></div>\n" +
                "                    <div></div>\n" +
                "                    <div></div>\n" +
                "                    <div></div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"box__ghost-shadow\"></div>\n" +
                "        </div>\n" +
                "\n" +
                "        <div class=\"box__description\">\n" +
                "            <div class=\"box__description-container\">\n" +
                "                <div class=\"box__description-title\">Whoops!</div>\n" +
                "                <div class=\"box__description-text\">It seems like we couldn't find the page you were looking for</div>\n" +
                "            </div>\n" +
                "\n" +
                "            <a href=\"https://codepen.io/diogo_ml_gomes/\" target=\"_blank\" class=\"box__button\">Go back</a>\n" +
                "\n" +
                "        </div>\n" +
                "\n" +
                "    </div>\n" +
                "    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"\n" +
                "        integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\" crossorigin=\"anonymous\"></script>\n" +
                "    <script src=\"https://akshayaap.github.io/assets/script.js\">\n" +
                "\n" +
                "    </script>\n" +
                "</body>\n" +
                "\n" +
                "</html>";
    }
}
