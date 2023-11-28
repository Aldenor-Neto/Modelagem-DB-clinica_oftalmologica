package org.example;

import org.example.dao.*;
import org.example.model.EspecificacaoLente;

import java.sql.SQLException;
import java.util.List;

public class Main {

    static MedicoDAO medicoDao = new MedicoDAO();
    static AtributosEstruturaLenteDAO atributoEstruturaLenteDao = new AtributosEstruturaLenteDAO();
    static EspecialidadeDAO especialidadeDao = new EspecialidadeDAO();
    static PacienteDAO pacienteDao = new PacienteDAO();
    static EspecialidadeMedicaDAO especialidadeMedicaDao = new EspecialidadeMedicaDAO();
    static ConsultaMedicaDAO consultaMedicaDao = new ConsultaMedicaDAO();
    static ReceitaOculosDAO receitaOculosDao = new ReceitaOculosDAO();
    static ObservacaoLaudoDAO observacaoLaudoDao = new ObservacaoLaudoDAO();
    static EstruturaLenteDAO estruturaLenteDao = new EstruturaLenteDAO();
    static EspecificacaoLenteDAO especificacaoLenteDao = new EspecificacaoLenteDAO();

    public static void main(String[] args) throws SQLException {

/* 
        System.out.println(medicoDao.count());

        Medico medico = new Medico(3, "Fabrícia", "05");
        medicoDao.insertMedico(medico);

        medico = medicoDao.selectMedico(5);
        System.out.println(medico);

        medico.setNome("Aldenor Neto");
        medicoDao.updateMedico(medico);
        medico = medicoDao.selectMedico(3);
        System.out.println(medico);

        List<Medico> medicos = medicoDao.selectAllMedico();
        medicos.forEach(System.out::println);

        medicoDao.deleteMedico(5);
        medicos.forEach(System.out::println);

        // Atributos_estrutura_lente

        AtributosEstruturaLente atributoEstruturaLente = new
                AtributosEstruturaLente(1, "lente de resina", "direito");

        //atributoEstruturaLenteDao.insertAtributoEstruturaLente(
        atributoEstruturaLente);
        atributoEstruturaLente =
                atributoEstruturaLenteDao.selectAtributoEstruturaLente(5);
        System.out.println(atributoEstruturaLente);

        atributoEstruturaLente.setDescricao("lente bi-focal com transiction");
        atributoEstruturaLenteDao.updateAtributoEstruturaLente(atributoEstruturaLente
        );
        atributoEstruturaLente =
                atributoEstruturaLenteDao.selectAtributoEstruturaLente(5);
        System.out.println(atributoEstruturaLente);

        List<AtributosEstruturaLente> listaAtributos =
                atributoEstruturaLenteDao.selectAllAtributoEstruturaLente();
        // listaAtributos.forEach(System.out::println);

        atributoEstruturaLenteDao.deleteAtributoEstruturaLente(6);
        listaAtributos = atributoEstruturaLenteDao.selectAllAtributoEstruturaLente();
        listaAtributos.forEach(System.out::println);


        //especialidade
        Especialidade especialidade = new Especialidade(1, "clinico", "COCe");

        //especialidadeDao.insertEspecialidade(especialidade);
        especialidade = especialidadeDao.selectEspecialidade(1);
        System.out.println(especialidade);

        especialidade.setConselho("consenho nacional de oftalmologia pediatrica");
        especialidadeDao.updateEspecialidade(especialidade);
        especialidade = especialidadeDao.selectEspecialidade(1);
        System.out.println(especialidade);

        List<Especialidade> listEspecialidades =
                especialidadeDao.selectAllEspecialidade();
        listEspecialidades.forEach(System.out::println);

        especialidadeDao.deleteEspecialidade(6);
        *listEspecialidades = especialidadeDao.selectAllEspecialidade();
        listEspecialidades.forEach(System.out::println);

        // pacientes
        //Paciente paciente = new Paciente(1, "pedro dias", "00000011111", new java.sql.Date(2023 - 11 - 26));
        //pacienteDao.insertPaciente(paciente);
        Paciente paciente = pacienteDao.selectPaciente(3);
        System.out.println(paciente);

        paciente.setNome("Pedro Cardoso");
        paciente.setCpf("00011100011");
        pacienteDao.updatePaciente(paciente);
        paciente = pacienteDao.selectPaciente(3);
        System.out.println(paciente);

        List<Paciente> listPacientes = pacienteDao.selectAllPaciente();
        listPacientes.forEach(System.out::println);

        pacienteDao.deletePaciente(3);
        listPacientes = pacienteDao.selectAllPaciente();
        listPacientes.forEach(System.out::println);

//EspecialidadeMedica
//    EspecialidadeMedica especialidadeMedica = new EspecialidadeMedica(1, "retinoplastia", new  java.sql.Date(2023-01-20), 1, 1);
//especialidadeMedicaDao.insertEspecialidadeMedica(especialidadeMedica);
        EspecialidadeMedica especialidadeMedica = especialidadeMedicaDao.selectEspecialidadeMedica(3);
        System.out.println(especialidadeMedica);

        especialidadeMedica.setObservacao("retinoplastia com glaucoma severo");
        especialidadeMedicaDao.updateEspecialidadeMedica(especialidadeMedica);
        especialidadeMedica = especialidadeMedicaDao.selectEspecialidadeMedica(3);
        System.out.println(especialidadeMedica);

        List<EspecialidadeMedica> listEspecialidadeMedica = especialidadeMedicaDao.selectAllEspecialidadeMedica();
                listEspecialidadeMedica.forEach(System.out::println);

                especialidadeMedicaDao.deleteEspecialidadeMedica(3);
                listEspecialidadeMedica = especialidadeMedicaDao.selectAllEspecialidadeMedica();
        listEspecialidadeMedica.forEach(System.out::println);
        System.out.println(especialidadeMedicaDao.count());


        //Consulta medica
        //ConsultaMedica consultaMedica = new ConsultaMedica(1, "Aldenor Silva Neto", new java.sql.Date(1987-12-30), 1, 1);
        //consultaMedicaDao.insertConsultaMedica(consultaMedica);
        ConsultaMedica consultaMedica = consultaMedicaDao.selectConsultaMedica(3);
        System.out.println(consultaMedica);

        consultaMedica.setAssinatura("Aldenor");
        consultaMedicaDao.updateConsultaMedica(consultaMedica);
        consultaMedica = consultaMedicaDao.selectConsultaMedica(3);
        System.out.println(consultaMedica);

        List<ConsultaMedica> listaConsultas = consultaMedicaDao.selectAllConsultaMedica();
        listaConsultas.forEach(System.out::println);

        consultaMedicaDao.deleteConsultaMedica(3);
        listaConsultas = consultaMedicaDao.selectAllConsultaMedica();
        listaConsultas.forEach(System.out::println);


        //receita oculos
        //ReceitaOculos receitaOculos = new ReceitaOculos(1, "detalahmento do oculos", new  java.sql.Date(2022-12-20), 1);
//receitaOculosDao.insertReceitaOculos(receitaOculos);
ReceitaOculos receitaOculos = receitaOculosDao.selectReceitaOculos(3);
        System.out.println(receitaOculos);

        receitaOculos.setDetalhamento("update no detalhamento do oculos");
        receitaOculosDao.updateReceitaOculos(receitaOculos);
        System.out.println(receitaOculos);

        List<ReceitaOculos> listReceitaOculos = receitaOculosDao.selectAllReceitaOculos();
        listReceitaOculos.forEach(System.out::println);

        receitaOculosDao.deleteReceitaOculos(3);
        listReceitaOculos = receitaOculosDao.selectAllReceitaOculos();
        listReceitaOculos.forEach(System.out::println);

//Observacao Laudo
        ObservacaoLaudo observacaoLaudo = new ObservacaoLaudo(1, "nova observação", 1);
//        observacaoLaudoDao.insertObservacaoLaudo(observacaoLaudo);
        observacaoLaudo = observacaoLaudoDao.selectObservacaoLaudo(3);
//        System.out.println(observacaoLaudo);

        observacaoLaudo.setDescricao("update na nova observação");
        observacaoLaudoDao.updateObservacaoLaudo(observacaoLaudo);
        System.out.println(observacaoLaudo);

        List<ObservacaoLaudo> listObservacoesLaudos = observacaoLaudoDao.selectAllObservacaoLaudo();
        listObservacoesLaudos.forEach(System.out::println);

        observacaoLaudoDao.deleteObservacaoLaudo(3);
        listObservacoesLaudos = observacaoLaudoDao.selectAllObservacaoLaudo();
        listObservacoesLaudos.forEach(System.out::println);

//Estrutura lente
        EstruturaLente estruturaLente = new EstruturaLente(1, "nova estrutura lente", 1, 1);
//        estruturaLenteDao.insertEstruturaLente(estruturaLente);
        estruturaLente = estruturaLenteDao.selectEstruturaLente(2);
        estruturaLente.setTipoCorrecao("update estrutura lente");
        estruturaLenteDao.updateEstruturaLente(estruturaLente);
        estruturaLente = estruturaLenteDao.selectEstruturaLente(2);
        System.out.println(estruturaLente);

        List<EstruturaLente> listEstruturaLente = estruturaLenteDao.selectAllEstruturaLente();
        listEstruturaLente.forEach(System.out::println);

        estruturaLenteDao.deleteEstruturaLente(3);

        listEstruturaLente = estruturaLenteDao.selectAllEstruturaLente();
        listEstruturaLente.forEach(System.out::println);
 */
//Especificacoes lentes
        EspecificacaoLente especificacaoLente = new EspecificacaoLente(1, 580f, 1, 1);
        //especificacaoLenteDao.insertEspecificacaoLente(especificacaoLente);
        especificacaoLente = especificacaoLenteDao.selectEspecificacaoLente(4);
        System.out.println(especificacaoLente);

        especificacaoLente.setValor(900f);
        especificacaoLenteDao.updateEspecificacaoLente(especificacaoLente);
        especificacaoLente = especificacaoLenteDao.selectEspecificacaoLente(4);
        System.out.println(especificacaoLente);

        List<EspecificacaoLente> listEspecificacoesLente = especificacaoLenteDao.selectAllEspecificacaoLente();
        listEspecificacoesLente.forEach(System.out::println);

        especificacaoLenteDao.deleteEspecificacaoLente(5);
listEspecificacoesLente = especificacaoLenteDao.selectAllEspecificacaoLente();
listEspecificacoesLente.forEach(System.out::println);
    }
}
