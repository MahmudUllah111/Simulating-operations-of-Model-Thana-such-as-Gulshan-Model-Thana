package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AdminFinanceController {

    @FXML
    private TableColumn<AdminFinanceModel, String> amountSpentTableColumn;

    @FXML
    private TableColumn<AdminFinanceModel, String> catagoryTableColumn;

    @FXML
    private TableColumn<AdminFinanceModel, String> dateTableColumn;

    @FXML
    private TableView<AdminFinanceModel> expenditureLogsTableView;

    @FXML
    private TableColumn<AdminFinanceModel, String> itemNameTableColumn;

    @FXML
    private TableColumn<AdminFinanceModel, String> responsibleOfficerTableColumn;

    @FXML
    void backOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/Admin_dashboard.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("dashboard");
        stage.setScene(nextScene);
        stage.show();

    }

    @FXML
    void initialize(){

        itemNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        amountSpentTableColumn.setCellValueFactory(new PropertyValueFactory<>("ammount"));
        catagoryTableColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        responsibleOfficerTableColumn.setCellValueFactory(new PropertyValueFactory<>("officer"));

        expenditureLogsTableView.getItems().setAll(messageList);


    }
    public static List<AdminFinanceModel> messageList = new ArrayList<>();
    static {
        messageList.add(new AdminFinanceModel("files", LocalDate.of(2025,4,16),"100","office works","Mahmudullah"));
        messageList.add(new AdminFinanceModel("screws", LocalDate.of(2025,3,28),"500","vehicle maintainance ","Aumio"));
        messageList.add(new AdminFinanceModel("guns", LocalDate.of(2025,4,1),"10","Inventory","Rifat"));


    }



}
