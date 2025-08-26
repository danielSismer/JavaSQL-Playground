package code.exercises.application.service;

import code.exercises.application.view.ApplicationView;
import code.exercises.objects.student.model.Student;
import code.exercises.objects.student.service.StudentDAO;
import code.exercises.objects.student.view.StudentViewer;

import java.util.List;

public class ApplicationService {


    public void mainMenu(int mainKey, int mainOperation, ApplicationView applicationView){

        switch (mainKey){

            case 1->{

                switch (mainOperation){

                    case 1 ->{
                        String name = StudentViewer.insertName();
                        String registration = StudentViewer.insertRegistration();
                        String course = StudentViewer.insertCourse();
                        StudentDAO.insertStudent(name, registration, course);
                    }

                    case 2 ->{
                        String matricula = StudentViewer.insertRegistration();
                        StudentDAO.deleteStudent(matricula);
                    }

                    case 3 -> {

                        Student student = StudentDAO.selectStudent(StudentViewer.insertRegistration());

                        if (student != null) {

                            System.out.println("\nEstudante encontrado:");
                            System.out.println("Nome: " + student.getNome());
                            System.out.println("Matricula: " + student.getMatricula());
                            System.out.println("Curso: " + student.getCurso());
                        } else {
                            System.out.println("\nNenhum estudante encontrado com a matrícula informada.");
                        }
                    }

                    case 4 ->{

                        List<Student> allStudents = StudentDAO.listAllStudents();

                        if (!allStudents.isEmpty()) {
                            System.out.println("\nLista de Todos os Estudantes:");
                            System.out.println("-----------------------------");

                            for (Student student : allStudents) {
                                System.out.println("Nome: " + student.getNome());
                                System.out.println("Matrícula: " + student.getMatricula());
                                System.out.println("Curso: " + student.getCurso());
                                System.out.println("-----------------------------");
                            }
                        } else {
                            System.out.println("Nenhum estudante encontrado no banco de dados.");
                        }
                    }

                    case 5 -> {
                        int optionUpdate = StudentViewer.updateChoose();

                        switch ((optionUpdate)){
                            case 1 -> {
                                StudentDAO.updateByName(StudentViewer.insertName(), StudentViewer.insertRegistration());
                            }
                            case 2 -> {
                                StudentDAO.updateByCourse(StudentViewer.insertCourse(), StudentViewer.insertRegistration());
                            }
                        }
                    }
                    }
                }

            case 2 -> {
                switch ()
            }
            }


        }
    }

