package fachada;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.common.util.impl.Log;

import EntidadeEnum.HistoricoTipo;
import exception.BusinessException;
import model.Endereco;
import model.Entidade;
import model.Usuario;


public interface IFachada {


//  SuperUsuario	businessSuperUsuario = new BusinessSuperUsuario();
public void createOrUpdatePessoa(Usuario entidade) throws BusinessException;
  public Usuario searchUsuario(int id) throws BusinessException;
  public void removeSuperUsuario(int id) throws BusinessException;
  public List<Usuario> searchAllSuperUsuario() throws BusinessException;    
  public List<Usuario> searchAllSuperUsuario(String search) throws BusinessException;
  public Usuario searchUser(String login, String senha) throws BusinessException;
  
//Endereco	businessEndereco = new BusinessEndereco();
public void createOrUpdateEndereco(Endereco entidade) throws BusinessException;
public Endereco searchEndereco(int id) throws BusinessException;
public void removeEndereco(int id) throws BusinessException;
public List<Endereco> searchAllEndereco() throws BusinessException;
public List<Endereco> searchAllEndereco(String search) throws BusinessException;

  
//Util
public Long searchCont(Class<? extends Entidade> classe) throws BusinessException;
public List<Log> searchLog(LocalDate date, HistoricoTipo tipoHistorico) throws BusinessException;
public Long searchContSelect(Class<? extends Entidade> classe, String sql) throws BusinessException;

}
