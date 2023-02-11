package test;

import org.junit.Assert;
import org.junit.Test;

import dao.ContratoDao;
import dao.IContratoDao;
import dao.mocks.ContratoDaoMock;
import service.ContratoService;
import service.IContratoService;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscar() {
    	IContratoDao dao = new ContratoDao();
    	IContratoService service = new ContratoService(dao);
    	String retorno = service.buscar();
    	Assert.assertEquals("Contrato encontrado", retorno);
    }
    
    @Test
    public void excluir() {
    	IContratoDao dao = new ContratoDao();
    	IContratoService service = new ContratoService(dao);
    	String retorno = service.excluir();
    	Assert.assertEquals("Excluido", retorno);
    }
    
    @Test
    public void atualizar() {
    	IContratoDao dao = new ContratoDao();
    	IContratoService service = new ContratoService(dao);
    	String retorno = service.atualizar();
    	Assert.assertEquals("Atualizado com sucesso", retorno);
    }
    
    //TODO
    //Fazer métodos de buscar, excluir e atualizar
}
