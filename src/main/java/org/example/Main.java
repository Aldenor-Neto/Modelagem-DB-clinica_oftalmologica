package org.example;

import org.example.dao.*;
import org.example.model.EspecialidadeMedica;

import java.sql.SQLException;
import java.util.List;

public class Main {

    static MedicoDAO medicoDao = new MedicoDAO();
    static AtributosEstruturaLenteDAO atributoEstruturaLenteDao = new AtributosEstruturaLenteDAO();
    static EspecialidadeDAO especialidadeDao = new EspecialidadeDAO();
    static PacienteDAO pacienteDao = new PacienteDAO();
    static EspecialidadeMedicaDAO especialidadeMedicaDao = new EspecialidadeMedicaDAO();

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
*/
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
    }
}
