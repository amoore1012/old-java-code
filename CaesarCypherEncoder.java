//Winter break project- Caesar Cypher Encoder
//Written by Audrey Moore due Jan 16, 2017
/* reasoning for idea-- Julius Caesar is most famous for his death and the play written about it, but he also happened to make my
 * favorite encoding technique that my best friend and I used to use to pass notes.  In honor of him, I have written this code that
 * randomly encodes a message with a key shift of the alphabet*/

//import javax.swing and java.awt
import javax.swing.*;
import java.awt.*;

//set up the class
public class CaesarCypherEncoder{
  public static void main (String [] args){
    //input the message
    String inputStr = JOptionPane.showInputDialog("Enter the message","");
    //check to make sure that the original input isn't nothing
    if (inputStr == null)
      return;
    //create some variables
    int index = 0; //counter index to go through each letter in the word
    int key = (int)(Math.random()*25+1); //a random key to shift the message by
    String outputStr=""; //the output string to build off of
    String alphabet = "abcdefghijklmnopqrstuvwxyz";  //an alphabet to prepare the message to
    //while loop for each letter in the message
    while (index<inputStr.length()){
      //see if the character is in the alphabet... if not then it just adds it as is
      if (alphabet.indexOf(inputStr.charAt(index))==-1){
        outputStr+=inputStr.charAt(index);
      }
      //if it is in the alphabet this shifts it by the key then adds it
      else{
        int alphaIndex = alphabet.indexOf(inputStr.charAt(index));
        //without this shift z shifted by 1 would be out of range
        if (((alphaIndex+key)>25) && (alphaIndex+key<52)){
          outputStr+=alphabet.charAt((alphaIndex+key)-26);
        }
        //for something that wouldn't be out of range
        else{
          outputStr+=alphabet.charAt(alphaIndex+key);
        }
      }
      //increment the index
      index++;
    }
    //output the encoded message with the random key that was used
    JOptionPane.showMessageDialog(null, "The encoded message is " + outputStr + " and the key = "+key);
  }
}
