package assignment3;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {

    //instance of the Zoo class, to gain access to the non-static methods for
    //adding, deleting, modifying animals, printing animals of a section, and printing
    //animals of a species
    Zoo zoo = new Zoo();

    //FXML elements of the various XML files
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private RadioButton radioButton1;
    @FXML
    private RadioButton radioButton2;
    @FXML
    private RadioButton radioButton3;
    @FXML
    private RadioButton radioButton4;
    @FXML
    private RadioButton radioButton5;
    @FXML
    private TextField textField1;
    @FXML
    private TextField textField2;
    @FXML
    private TextField textField3;
    @FXML
    private TextField textField4;
    @FXML
    private TextField textField5;
    @FXML
    private TextField textField6;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private TextField textField7;
    @FXML
    private Button button7;
    @FXML
    private TextField textField8;
    @FXML
    private TextField textField9;
    @FXML
    private TextField textField10;
    @FXML
    private TextField textField11;
    @FXML
    private TextField textField12;
    @FXML
    private TextArea textArea1;
    @FXML
    private Button button8;
    @FXML
    private Label label3;
    @FXML
    private Label label4;
    @FXML
    private Label label5;
    @FXML
    private Label label6;
    @FXML
    private Label label7;
    @FXML
    private TextField textField13;
    @FXML
    private Button button9;
    @FXML
    private Label label8;
    @FXML
    private Button button10;
    @FXML
    private RadioButton radioButton6;
    @FXML
    private RadioButton radioButton7;
    @FXML
    private RadioButton radioButton8;
    @FXML
    private RadioButton radioButton9;
    @FXML
    private RadioButton radioButton10;
    @FXML
    private Button button11;
    @FXML
    private TextArea textArea2;
    @FXML
    private Button button12;
    @FXML
    private RadioButton radioButton11;
    @FXML
    private RadioButton radioButton12;
    @FXML
    private RadioButton radioButton13;
    @FXML
    private RadioButton radioButton14;
    @FXML
    private RadioButton radioButton15;
    @FXML
    private Button button13;
    @FXML
    private Button button14;
    @FXML
    private TextArea textArea3;
    @FXML
    private Button button15;

    //method to display the scene with the menu having options for the user to select from
    @FXML
    private void displayMenu(ActionEvent event) throws IOException {
        Parent menu_parent = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Scene menu_scene = new Scene(menu_parent);
        Stage menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        menu_stage.setScene(menu_scene);
        menu_stage.show();
    }

    //method to display the scene with the menu for the user to add an animal
    @FXML
    private void showAddAnimalMenu(ActionEvent event) throws IOException {

        Parent menu_parent = FXMLLoader.load(getClass().getResource("addAnimal.fxml"));
        Scene menu_scene = new Scene(menu_parent);
        Stage menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        menu_stage.setScene(menu_scene);
        menu_stage.show();

    }

    //method to display the scene with the menu for the user to modify an animal
    @FXML
    private void showModifyAnimalMenu(ActionEvent event) throws IOException {
        Parent menu_parent = FXMLLoader.load(getClass().getResource("modifyAnimal.fxml"));
        Scene menu_scene = new Scene(menu_parent);
        Stage menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        menu_stage.setScene(menu_scene);
        menu_stage.show();
    }

    //method to validate selection of an animal by the user
    @FXML
    private void selectAnimal(ActionEvent event) {
        RadioButton rb = (RadioButton) event.getSource();

        if (radioButton1 == rb) {
            radioButton2.selectedProperty().setValue(false);
            radioButton3.selectedProperty().setValue(false);
            radioButton4.selectedProperty().setValue(false);
            radioButton5.selectedProperty().setValue(false);
        } else if (radioButton2 == rb) {
            radioButton1.selectedProperty().setValue(false);
            radioButton3.selectedProperty().setValue(false);
            radioButton4.selectedProperty().setValue(false);
            radioButton5.selectedProperty().setValue(false);
        } else if (radioButton3 == rb) {
            radioButton2.selectedProperty().setValue(false);
            radioButton1.selectedProperty().setValue(false);
            radioButton4.selectedProperty().setValue(false);
            radioButton5.selectedProperty().setValue(false);
        } else if (radioButton4 == rb) {
            radioButton2.selectedProperty().setValue(false);
            radioButton3.selectedProperty().setValue(false);
            radioButton1.selectedProperty().setValue(false);
            radioButton5.selectedProperty().setValue(false);
        } else if (radioButton5 == rb) {
            radioButton2.selectedProperty().setValue(false);
            radioButton3.selectedProperty().setValue(false);
            radioButton4.selectedProperty().setValue(false);
            radioButton1.selectedProperty().setValue(false);
        }
    }

    //method to add an animal to the ArrayList holding references to specialised sub
    //classes of the Animal class, depending on the user's choice and input
    @FXML
    private void addAnimal(ActionEvent event) throws IOException {

        String species;
        if (radioButton1.isSelected()) {
            species = "Bear";
        } else if (radioButton2.isSelected()) {
            species = "Elephant";
        } else if (radioButton3.isSelected()) {
            species = "Giraffe";
        } else if (radioButton4.isSelected()) {
            species = "Lion";
        } else {
            species = "Tiger";
        }

        String name = textField1.getText();
        int age = Integer.parseInt(textField2.getText());
        double height = Double.parseDouble(textField3.getText());
        double weight = Double.parseDouble(textField4.getText());
        int section = Integer.parseInt(textField5.getText());
        String id = textField6.getText();

        zoo.addAnimal(species, name, age, height, weight, section, id);

        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textField6.setText("");

        Parent menu_parent = FXMLLoader.load(getClass().getResource("animalAdded.fxml"));
        Scene menu_scene = new Scene(menu_parent);
        Stage menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        menu_stage.setScene(menu_scene);
        menu_stage.show();
    }

    //method to enable the user to search and modify an animal by ID
    @FXML
    private void searchForAnimalToModify(ActionEvent event) throws IOException {

        String id = textField7.getText();

        if (zoo.animalExists(id)) {

            textField8.visibleProperty().setValue(true);
            textField9.visibleProperty().setValue(true);
            textField10.visibleProperty().setValue(true);
            textField11.visibleProperty().setValue(true);
            textField12.visibleProperty().setValue(true);
            label3.visibleProperty().setValue(true);
            label4.visibleProperty().setValue(true);
            label5.visibleProperty().setValue(true);
            label6.visibleProperty().setValue(true);
            label7.visibleProperty().setValue(true);
            button8.visibleProperty().setValue(true);
            textArea1.visibleProperty().setValue(true);

        } else {
            Parent menu_parent = FXMLLoader.load(getClass().getResource("animalNotFound.fxml"));
            Scene menu_scene = new Scene(menu_parent);
            Stage menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            menu_stage.setScene(menu_scene);
            menu_stage.show();

        }
    }

    //method to modify the details of the specific animal based on the user's choice and input
    @FXML
    private void modifyAnimal(ActionEvent event) throws IOException {

        String name = textField8.getText();
        int age = Integer.parseInt(textField9.getText());
        double height = Double.parseDouble(textField10.getText());
        double weight = Double.parseDouble(textField11.getText());
        int section = Integer.parseInt(textField12.getText());
        String id = textField7.getText();

        zoo.modifyAnimal(id, name, age, height, weight, section);

        Parent menu_parent = FXMLLoader.load(getClass().getResource("animalModified.fxml"));
        Scene menu_scene = new Scene(menu_parent);
        Stage menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        menu_stage.setScene(menu_scene);
        menu_stage.show();

    }

    //method to display the scene with the menu for the user to delete an animal
    @FXML
    private void showDeleteAnimalMenu(ActionEvent event) throws IOException {
        Parent menu_parent = FXMLLoader.load(getClass().getResource("deleteAnimal.fxml"));
        Scene menu_scene = new Scene(menu_parent);
        Stage menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        menu_stage.setScene(menu_scene);
        menu_stage.show();
    }

    //method to enable the user to search and delete an Animal by ID
    @FXML
    private void searchForAnimalToDelete(ActionEvent event) throws IOException {

        String id = textField13.getText();

        if (zoo.animalExists(id)) {
            label8.visibleProperty().setValue(true);
            button10.visibleProperty().setValue(true);
        } else {
            Parent menu_parent = FXMLLoader.load(getClass().getResource("animalNotFound.fxml"));
            Scene menu_scene = new Scene(menu_parent);
            Stage menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            menu_stage.setScene(menu_scene);
            menu_stage.show();

        }

    }

    //method to delete the specific animal based on the user's choice
    @FXML
    private void deleteAnimal(ActionEvent event) throws IOException {
        String id = textField13.getText();

        zoo.deleteAnimal(id);
        Parent menu_parent = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Scene menu_scene = new Scene(menu_parent);
        Stage menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        menu_stage.setScene(menu_scene);
        menu_stage.show();
    }

    //method to display the scene with the menu for the user to select a section
    //to display the list of
    @FXML
    private void showPrintAnimalsOfASectionMenu(ActionEvent event) throws IOException {

        Parent menu_parent = FXMLLoader.load(getClass().getResource("printAnimalsOfASection.fxml"));
        Scene menu_scene = new Scene(menu_parent);
        Stage menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        menu_stage.setScene(menu_scene);
        menu_stage.show();
    }

    //method to validate the user's selection of a section
    @FXML
    private void selectSection(ActionEvent event) {

        RadioButton rb = (RadioButton) event.getSource();

        if (radioButton6 == rb) {
            radioButton7.selectedProperty().setValue(false);
            radioButton8.selectedProperty().setValue(false);
            radioButton9.selectedProperty().setValue(false);
            radioButton10.selectedProperty().setValue(false);
        } else if (radioButton7 == rb) {
            radioButton6.selectedProperty().setValue(false);
            radioButton8.selectedProperty().setValue(false);
            radioButton9.selectedProperty().setValue(false);
            radioButton10.selectedProperty().setValue(false);
        } else if (radioButton8 == rb) {
            radioButton7.selectedProperty().setValue(false);
            radioButton6.selectedProperty().setValue(false);
            radioButton9.selectedProperty().setValue(false);
            radioButton10.selectedProperty().setValue(false);
        } else if (radioButton9 == rb) {
            radioButton7.selectedProperty().setValue(false);
            radioButton8.selectedProperty().setValue(false);
            radioButton6.selectedProperty().setValue(false);
            radioButton10.selectedProperty().setValue(false);
        } else if (radioButton10 == rb) {
            radioButton7.selectedProperty().setValue(false);
            radioButton8.selectedProperty().setValue(false);
            radioButton9.selectedProperty().setValue(false);
            radioButton6.selectedProperty().setValue(false);
        }

    }

    //method to display the animals of a section based on the user's choice and input
    @FXML
    private void displayAnimalsOfASection(ActionEvent event) {

        int sectionNumber = 1;
        if (radioButton6.isSelected()) {
            sectionNumber = 1;
        } else if (radioButton7.isSelected()) {
            sectionNumber = 2;
        } else if (radioButton8.isSelected()) {
            sectionNumber = 3;
        } else if (radioButton9.isSelected()) {
            sectionNumber = 4;
        } else if (radioButton10.isSelected()) {
            sectionNumber = 5;
        }

        String result = zoo.printAnimalsOfASection(sectionNumber);
        textArea2.setText(result);

    }

    //method to change the scene to the original menu
    @FXML
    private void continueToMenu(ActionEvent event) throws IOException {

        Parent menu_parent = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Scene menu_scene = new Scene(menu_parent);
        Stage menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        menu_stage.setScene(menu_scene);
        menu_stage.show();

    }

    //method to display the scene with the menu for the user to select a species
    //to display the list of
    @FXML
    private void showPrintAnimalsOfASpeciesMenu(ActionEvent event) throws IOException {

        Parent menu_parent = FXMLLoader.load(getClass().getResource("printAnimalsOfASpecies.fxml"));
        Scene menu_scene = new Scene(menu_parent);
        Stage menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        menu_stage.setScene(menu_scene);
        menu_stage.show();
    }

    //method to validate the user's choice of the species
    @FXML
    private void selectSpecies(ActionEvent event) {

        RadioButton rb = (RadioButton) event.getSource();

        if (radioButton11 == rb) {
            radioButton12.selectedProperty().setValue(false);
            radioButton13.selectedProperty().setValue(false);
            radioButton14.selectedProperty().setValue(false);
            radioButton15.selectedProperty().setValue(false);
        } else if (radioButton12 == rb) {
            radioButton11.selectedProperty().setValue(false);
            radioButton13.selectedProperty().setValue(false);
            radioButton14.selectedProperty().setValue(false);
            radioButton15.selectedProperty().setValue(false);
        } else if (radioButton13 == rb) {
            radioButton12.selectedProperty().setValue(false);
            radioButton11.selectedProperty().setValue(false);
            radioButton14.selectedProperty().setValue(false);
            radioButton15.selectedProperty().setValue(false);
        } else if (radioButton14 == rb) {
            radioButton12.selectedProperty().setValue(false);
            radioButton13.selectedProperty().setValue(false);
            radioButton11.selectedProperty().setValue(false);
            radioButton15.selectedProperty().setValue(false);
        } else if (radioButton15 == rb) {
            radioButton12.selectedProperty().setValue(false);
            radioButton13.selectedProperty().setValue(false);
            radioButton14.selectedProperty().setValue(false);
            radioButton11.selectedProperty().setValue(false);
        }

    }

    //method to display the animals of a species based on the user's 
    //choice and input
    @FXML
    private void displayAnimalsOfASpecies(ActionEvent event) {

        String species = "Bear";
        if (radioButton11.isSelected()) {
            species = "Bear";
        } else if (radioButton12.isSelected()) {
            species = "Elephant";
        } else if (radioButton13.isSelected()) {
            species = "Giraffe";
        } else if (radioButton14.isSelected()) {
            species = "Lion";
        } else if (radioButton15.isSelected()) {
            species = "Tiger";
        }

        String result = zoo.printAnimalsOfSpecies(species);
        textArea3.setText(result);

    }

    //method to change the scene to enable the user to exit the zoo
    @FXML
    private void exitTheZoo(ActionEvent event) throws IOException {
        Parent menu_parent = FXMLLoader.load(getClass().getResource("exitTheZoo.fxml"));
        Scene menu_scene = new Scene(menu_parent);
        Stage menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        menu_stage.setScene(menu_scene);
        menu_stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
