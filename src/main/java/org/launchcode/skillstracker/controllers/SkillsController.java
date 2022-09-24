package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

    @Controller
    public class SkillsController {

        @GetMapping
        @ResponseBody
        public String startSkills() {
            return "<h1>Skills Tracker</h1>" +
                    "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                    "<ol>" +
                    "<li>Java</li>" +
                    "<li>JavaScript</li>" +
                    "<li>Python</li>" +
                    "</ol>";
        }

        @ResponseBody
        @GetMapping(value="form")
        public String formSkills(){
            return "<form method=\"POST\">\n" +
                    "    Name: <br>\n" +
                    "    <input type = \"text\" name='name'/>\n" +
                    "    <br> My favorite language: <br>\n" +
                    "    <select name = 'firstChoice'>\n" +
                    "        <option value = \"Java\">Java</option>\n" +
                    "        <option value = \"JavaScript\">JavaScript</option>\n" +
                    "        <option value = \"Python\">Python</option>\n" +
                    "    </select>\n" +
                    "    <br>My second favorite language:<br>\n" +
                    "    <select name = 'secondChoice'>\n" +
                    "        <option value = \"Java\">Java</option>\n" +
                    "        <option value = \"JavaScript\">JavaScript</option>\n" +
                    "        <option value = \"Python\">Python</option>\n" +
                    "    </select>\n" +
                    "    <br>My third favorite language:<br>\n" +
                    "    <select name = 'thirdChoice'>\n" +
                    "        <option value = \"Java\">Java</option>\n" +
                    "        <option value = \"JavaScript\">JavaScript</option>\n" +
                    "        <option value = \"Python\">Python</option>\n" +
                    "    </select>\n" +
                    "    <br>\n" +
                    "    <input type=\"submit\" value=\"Submit\"/>\n" +
                    "</form>";
        }

        @PostMapping(value="form")
        @ResponseBody
        public String namePage(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice){
            return "<h1>" + name + "</h1>\n" +
                    "<ol>\n" +
                    "<li>" + firstChoice + "</li>\n" +
                    "<li>" + secondChoice + "</li>\n" +
                    "<li>" + thirdChoice + "</li>\n" +
                    "</ol>";
        }
    }
