package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import iub.gulshanmodelthana.common.ProfileChangePasswordcontroller;
import iub.gulshanmodelthana.common.SceneSwitcher;
import iub.gulshanmodelthana.common.Session;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OcBudgetProposalController {

    @FXML
    private ImageView imageUser;

    @FXML
    private TableColumn<OcBudgetProposal_Model, String> itemNameTableColumn;

    @FXML
    private Label labName;

    @FXML
    private TableColumn<OcBudgetProposal_Model, String> purposeTableColumn;

    @FXML
    private TableColumn<OcBudgetProposal_Model, LocalDate> submissionDateTableColumn;

    @FXML
    private TableColumn<OcBudgetProposal_Model, String> amountTableColumn;

    @FXML
    private TableColumn<OcBudgetProposal_Model, String> budgetstatus;

    @FXML
    private Label warninglabel;

    @FXML
    private TableView <OcBudgetProposal_Model>tableview;

    @FXML
    void backMessage(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/oc_dashboard");
    }

    @FXML
    void logClick(MouseEvent event) throws IOException {
        ProfileChangePasswordcontroller.lastscene = "m1_mahmudullah_2230406/oc_budgetproposal";
        SceneSwitcher.switchTo("common/profile_change_password");
    }

    @FXML
    void mailClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("common/contact");
    }

    @FXML
    void notClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("common/notification");
    }

    @FXML
    void approveSelectedBudgetButton(ActionEvent event) {
        OcBudgetProposal_Model selectedBudget = tableview.getSelectionModel().getSelectedItem();

        if (selectedBudget != null) {
            if (selectedBudget.getStatus().equals("Pending")) {
                selectedBudget.setStatus("Approved");
                tableview.refresh();

                warninglabel.setText(" The budget has been approved.");
                warninglabel.setStyle("-fx-border-color: green");
            }
            else {
                warninglabel.setText("This budget has already been " + selectedBudget.getStatus());
                warninglabel.setStyle("-fx-border-color: red");
            }
        }
        else {
            warninglabel.setText(" Please select a budget first.");
            warninglabel.setStyle("-fx-border-color: red");
        }
    }

    @FXML
    void denySelectedBudget(ActionEvent event) {
        OcBudgetProposal_Model selectedBudget = tableview.getSelectionModel().getSelectedItem();

        if (selectedBudget != null) {
            if (selectedBudget.getStatus().equals("Pending")){
                selectedBudget.setStatus("Rejected");
                tableview.refresh();

                warninglabel.setText(" The budget has been rejected.");
                warninglabel.setStyle("-fx-border-color: orange");
            }
            else {
                warninglabel.setText("This budget has already been " + selectedBudget.getStatus());
                warninglabel.setStyle("-fx-border-color: red");
            }
        }
        else {
            warninglabel.setText(" Please select a budget first.");
            warninglabel.setStyle("-fx-border-color: red");
        }
    }

    @FXML
    void initialize(){
        labName.setText(Session.email);

        itemNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("itemname"));
        purposeTableColumn.setCellValueFactory(new PropertyValueFactory<>("purpose"));
        amountTableColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        submissionDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("submissiondate"));
        budgetstatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        tableview.getItems().setAll(messageList);
    }

    public static List<OcBudgetProposal_Model> messageList = new ArrayList<>();
    static {
        messageList.add(new OcBudgetProposal_Model("Chair & Table","For GD Office room","20000",LocalDate.of(2025,4,20), "Pending"));
        messageList.add(new OcBudgetProposal_Model("Desktop Computer","For IT room","60000",LocalDate.of(2025,4,22), "Pending"));
        messageList.add(new OcBudgetProposal_Model("New transportation vehicle","For crminal transport","1500000",LocalDate.of(2025,4,25), "Pending"));
        messageList.add(new OcBudgetProposal_Model("Pistol ammunition ","For Officers","300000",LocalDate.of(2025,4,25), "Pending"));
        messageList.add(new OcBudgetProposal_Model("New Cells ","To hold more criminal","50000",LocalDate.of(2025,4,30), "Pending"));

    }
}

