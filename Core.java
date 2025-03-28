package SmartText.Core;

import java.util.ArrayList;
import java.lang.String;

public class Core {
    private String input;

    public Core(String input) {
        this.input = input;
    }

    //###############################################
    //THIS FUNCTION RETURN STRING WITHOUT WHITESPACES
    //###############################################

    public String WithoutWhiteSpace() {
        String resultText = "";
        for(int i = 0; i < this.input.length(); i++) {
            if(this.input.charAt(i) == ' ') {
                continue;
            }
            else {
                resultText += this.input.charAt(i);
            }

        }

        return resultText;
    }

    //##########################################
    //THIS FUNCTION RETURN ARRAY ONLY WITH WORDS
    //##########################################

    public ArrayList<String> wordsOrSentensesFromText(char typeOfResult) {
        ArrayList<String> resultWordsArray = new ArrayList<>();
        if(typeOfResult == 'W') {
            int border = 0;
            for(int i = 0; i < this.input.length(); i++) {
                if(this.input.charAt(i) == ' ' || i == this.input.length()-1) {
                    resultWordsArray.add(this.input.substring(border, i));
                    border = i+1;
                }
                else {
                    continue;
                }
            }
        } else if(typeOfResult == 'S') {
            int border = 0;
            for(int i = 0; i < this.input.length(); i++) {
                if(this.input.charAt(i) == '.' || this.input.charAt(i) == '!' || this.input.charAt(i) == '?' || i == this.input.length()-1) {
                    resultWordsArray.add(this.input.substring(border, i));
                    border = i+1;
                }
                else {
                    continue;
                }
            }
        }
        return resultWordsArray;
    }

    //#####################################
    //THIS FUNCTION RETURN COUNT OF SYMBOLS
    //#####################################

    public int countOfSymbols() {
        return this.input.length();
    }

    //#######################################
    //THIS FUNCTION RETURN COUNT OF SENTENSES
    //#######################################

    public int countOfSentenses() {
        ArrayList<String> resultWordsArray = new ArrayList<>();
         int resultOfCount = 0;
        int border = 0;
        for(int i = 0; i < this.input.length(); i++) {
            if (this.input.charAt(i) == '.' || this.input.charAt(i) == '!' || this.input.charAt(i) == '?' || i == this.input.length() - 1) {
                resultWordsArray.add(this.input.substring(border, i));
                border = i + 1;
                resultOfCount++;
            } else {
                continue;
            }
        }
        return resultOfCount;
    }
}
