package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

public class ControleCadastro {

	@FXML
    private AnchorPane AnchoPane;

    @FXML
    private TabPane TabPane;

    @FXML
    private Tab TabListaCadastro;

    @FXML
    private TextField TXbuscarFuncionario;

    @FXML
    private Button JBbuscarCadastro;

    @FXML
    private Button JBnovoCadastro;

    @FXML
    private TableView<?> tabelaFuncionario;

    @FXML
    private TableColumn<?, ?> nomeTabelaFuncionario;

    @FXML
    private TableColumn<?, ?> cpfTabelaFuncionario;

    @FXML
    private TableColumn<?, ?> CargotabelaFuncionario;

    @FXML
    private TableColumn<?, ?> RuaTabFuncionario;

    @FXML
    private TableColumn<?, ?> BairroTabFuncionario;

    @FXML
    private TableColumn<?, ?> SituacaoTabFuncionario;

    @FXML
    private Button JBeditarCadastro;

    @FXML
    private Button JBdesativarCadastro;

    @FXML
    private Tab TabNovoFuncionario;

    @FXML
    private TextField TXnomeFuncionario;

    @FXML
    private TextField TXcpfFuncionario;

    @FXML
    private TextField TXloginFuncionario;

    @FXML
    private TextField TXsenhaFuncionario;

    @FXML
    private TextField TXconfirmarsenhaFuncionario;

    @FXML
    private TextField TXcidadeFuncionario;

    @FXML
    private TextField TXestadoFuncionario;

    @FXML
    private TextField TXcepFuncionario;

    @FXML
    private TextField TXruaFuncionario;

    @FXML
    private TextField TXBairroFuncionario;

    @FXML
    private TextField TXnumeroFuncionario;

    @FXML
    private Button BTcadastrarPessoa;

    @FXML
    private RadioButton RadioSecretaria;

    @FXML
    private ToggleGroup genero;

    @FXML
    private RadioButton RadioPedagogo;

    @FXML
    private RadioButton RadioAdm;

    @FXML
    private RadioButton RadioDirecao;

    @FXML
    private RadioButton RadioProfessor;

    @FXML
    private RadioButton RadioPaiResp;

    @FXML
    private RadioButton RadioAluno;

    @FXML
    private Button JBvoltar;
    
	@FXML
	void action(ActionEvent event) {

		if (event.getSource() ==JBvoltar) {
			System.out.println("oi");
		}

	}

}
