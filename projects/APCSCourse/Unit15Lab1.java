import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;


public class Unit15Lab1 extends Application
{
	//initializes textfields and string objects
        TextField first = new TextField();
        TextField second = new TextField();
        TextField sum = new TextField();
        String fvalue;
        String svalue;
        String sumInput;

        public void start(Stage myStage)
        {
		//sets up stage
                myStage.setTitle("SImple Calculator");
                GridPane gridPane = new GridPane();
                gridPane.setPadding(new Insets(30));
                gridPane.setHgap(5);
                gridPane.setVgap(5);
                gridPane.setAlignment(Pos.CENTER);

                Scene myScene = new Scene(gridPane, 300, 200);
                myStage.setScene(myScene);
                myStage.show();
		
		//adds the textfields and labels
                gridPane.add(new Label("First Value:"), 0, 0);
                gridPane.add(first, 1, 0);
                gridPane.add(new Label("Second Value:"), 0, 1);
                gridPane.add(second, 1, 1);
                gridPane.add(new Label("Sum is:"), 0, 2);
                gridPane.add(sum, 1, 2);
                sum.setEditable(false);
		//creates the button and sets the on action
                Button aButton = new Button("Calculate");
                aButton.setOnAction(new ButtonHandler());
                gridPane.add(aButton, 1, 3);
                gridPane.setHalignment(aButton, HPos.RIGHT);
        }

	//tells the button what to do when clicked
        class ButtonHandler implements EventHandler<ActionEvent>
        {
                public void handle(ActionEvent e)
                {
			//gets text from the textfields and set them to the strings
                        fvalue = first.getText();
                        svalue = second.getText();
			//turns the strings to ints, add them, and turn that into a string. Then set the text in the third textfield to the sum
                        sumInput = Integer.toString((Integer.parseInt(fvalue) + Integer.parseInt(svalue)));
                        sum.setText(sumInput);

                }
        }

        public static void main(String [] args)
        {
                launch(args);
        }
}

