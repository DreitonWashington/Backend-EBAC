package service;

import dao.IContratoDao;


public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

	@Override
	public String buscar() {
		return contratoDao.buscar();
		
	}

	@Override
	public String excluir() {
		// TODO Auto-generated method stub
		contratoDao.excluir();
		return "Excluido";
	}

	@Override
	public String atualizar() {
		// TODO Auto-generated method stub
		contratoDao.atualizar();
		return "Atualizado com sucesso";
	}
}
