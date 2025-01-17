package com.danny_jiang.tracingsample;

public class QuestionAnswer1 {
    public static String[][] choices;
    public static String[] correctAnswers = {"Cat", "Dog", "Frog", "Horse", "Lion", "Kola", "Rabbit", "Tiger", "Zebra", "Deer", "Cow", "Crocodile", "Bear", "Wolf", "Monkey", "Elephant"};
    public static String[] question = {"Name The Animal?", "Name The Animal?", "Name The Animal?", "Name The Animal?", "Name The Animal?", "Name The Animal?", "Name The Animal?", "Name The Animal?", "Name The Animal?", "Name The Animal?", "Name The Animal?", "Name The Animal?", "Name The Animal?", "Name The Animal?", "Name The Animal?", "Name The Animal?"};

    static {
        String str = "Frog";
        choices = new String[][]{new String[]{"Monkey", "Cat", "Eagle", "Lion"}, new String[]{"Dog", "Cow", "Zebra", "Horse"}, new String[]{"Rabbit", "Wolf", "Frog", "Deer"}, new String[]{"Crocodile", "Elephant", "Horse", "Tiger"}, new String[]{"Lion", "Frog", "Monkey", "Cat"}, new String[]{"Dog", "Kola", "Tiger", "Zebra"}, new String[]{"Wolf", "Rabbit", "Eagle", "Crocodile"}, new String[]{"Lion", "Apple", "Tiger", "Elephant"}, new String[]{"Dog", "Horse", "Cow", "Zebra"}, new String[]{"Peacock", "Deer", "Bear", "Eagle"}, new String[]{"Elephant", "Monkey", "Cat", "Cow"}, new String[]{"Lion", "Rabbit", "Deer", "Crocodile"}, new String[]{"Zebra", "Eagle", "Crocodile", "Bear"}, new String[]{"Dog", "Wolf", str, "Tiger"}, new String[]{"Monkey", "Elephant", "Horse", "Peacock"}, new String[]{"Tiger", str, "Deer", "Elephant"}};
    }
}
