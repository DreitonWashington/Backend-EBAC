package dao;

public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

	@Override
	public String buscar() {
		return "Contrato encontrado";
	}

	@Override
	public String excluir() {
		return "Contrato Excluido";
	}

	@Override
	public String atualizar() {
		// TODO Auto-generated method stub
		return "Contrato atualizado";
	}
}
