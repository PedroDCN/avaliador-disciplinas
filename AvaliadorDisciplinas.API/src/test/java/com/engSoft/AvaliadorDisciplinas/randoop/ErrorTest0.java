package com.engSoft.AvaliadorDisciplinas.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student5 = new com.engSoft.entities.Student(studentDTO4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Teacher{id=null, name= hi! }");
        java.lang.Long long7 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student9 = new com.engSoft.entities.Student(studentDTO8);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student3 = new com.engSoft.entities.Student(studentDTO2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        com.engSoft.DTO.StudentDTO studentDTO1 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student2 = new com.engSoft.entities.Student(studentDTO1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student5 = new com.engSoft.entities.Student(studentDTO4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        java.lang.Boolean boolean6 = student0.getBanned();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str8 = studentDTO7.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student9 = new com.engSoft.entities.Student(studentDTO7);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO6.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student9 = new com.engSoft.entities.Student(studentDTO6);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setDeletedComments(10);
        java.lang.String str6 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        com.engSoft.DTO.StudentDTO studentDTO10 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student11 = new com.engSoft.entities.Student(studentDTO10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        java.lang.String str7 = student0.getNick();
        java.lang.Long long8 = student0.getId();
        java.lang.String str9 = student0.getName();
        int int10 = student0.getDeletedComments();
        com.engSoft.DTO.StudentDTO studentDTO11 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student12 = new com.engSoft.entities.Student(studentDTO11);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO4.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
        java.lang.String str7 = studentDTO4.getEmail();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student8 = new com.engSoft.entities.Student(studentDTO4);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str3 = student0.getEmail();
        student0.setBanned((java.lang.Boolean) false);
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student7 = new com.engSoft.entities.Student(studentDTO6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str3 = student0.getEmail();
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student5 = new com.engSoft.entities.Student(studentDTO4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str7 = studentDTO6.getEmail();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student8 = new com.engSoft.entities.Student(studentDTO6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.toString();
        java.lang.String str2 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO3 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student4 = new com.engSoft.entities.Student(studentDTO3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Boolean boolean3 = student0.getBanned();
        java.lang.Boolean boolean4 = student0.getBanned();
        student0.setId((java.lang.Long) 1L);
        java.lang.String str7 = student0.getEmail();
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student9 = new com.engSoft.entities.Student(studentDTO8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO6.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=REMOTE}");
        java.lang.String str9 = studentDTO6.getEmail();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student10 = new com.engSoft.entities.Student(studentDTO6);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setDeletedComments(10);
        java.lang.String str6 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        com.engSoft.DTO.StudentDTO studentDTO10 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO10.setName("Student{id=null, name='hi!', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=true, deletedComments=0}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student13 = new com.engSoft.entities.Student(studentDTO10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        java.lang.Boolean boolean2 = student0.getBanned();
        java.lang.String str3 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student5 = new com.engSoft.entities.Student(studentDTO4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        int int9 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 1L);
        com.engSoft.DTO.StudentDTO studentDTO12 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student13 = new com.engSoft.entities.Student(studentDTO12);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setId((java.lang.Long) 100L);
        java.lang.Boolean boolean7 = student0.getBanned();
        java.lang.String str8 = student0.getNick();
        student0.setId((java.lang.Long) 0L);
        java.lang.String str11 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO12 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student13 = new com.engSoft.entities.Student(studentDTO12);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        java.lang.String str6 = student0.getName();
        student0.setId((java.lang.Long) 0L);
        java.lang.String str9 = student0.getEmail();
        com.engSoft.DTO.StudentDTO studentDTO10 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student11 = new com.engSoft.entities.Student(studentDTO10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        student0.setNick("");
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str7 = studentDTO6.getEmail();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student8 = new com.engSoft.entities.Student(studentDTO6);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str7 = student0.getName();
        java.lang.Boolean boolean8 = student0.getBanned();
        student0.setName("Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }");
        com.engSoft.DTO.StudentDTO studentDTO11 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO11.setName("Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null}', isBanned=false, deletedComments=0}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student14 = new com.engSoft.entities.Student(studentDTO11);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO4.setName("Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}");
        studentDTO4.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student9 = new com.engSoft.entities.Student(studentDTO4);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setDeletedComments(10);
        java.lang.String str6 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student8 = new com.engSoft.entities.Student(studentDTO7);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        student0.setName("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = student0.getNick();
        java.lang.String str7 = student0.getNick();
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student9 = new com.engSoft.entities.Student(studentDTO8);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        java.lang.String str7 = student0.getNick();
        student0.setDeletedComments((int) 'a');
        student0.setId((java.lang.Long) 10L);
        com.engSoft.DTO.StudentDTO studentDTO12 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student13 = new com.engSoft.entities.Student(studentDTO12);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        com.engSoft.DTO.StudentDTO studentDTO3 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO3.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student6 = new com.engSoft.entities.Student(studentDTO3);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        java.lang.String str4 = student0.toString();
        java.lang.String str5 = student0.getNick();
        int int6 = student0.getDeletedComments();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student9 = new com.engSoft.entities.Student(studentDTO8);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        java.lang.Boolean boolean6 = student0.getBanned();
        java.lang.String str7 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student9 = new com.engSoft.entities.Student(studentDTO8);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str5 = student0.getEmail();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student7 = new com.engSoft.entities.Student(studentDTO6);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setId((java.lang.Long) 100L);
        java.lang.Boolean boolean7 = student0.getBanned();
        java.lang.String str8 = student0.getNick();
        student0.setBanned((java.lang.Boolean) false);
        com.engSoft.DTO.StudentDTO studentDTO11 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student12 = new com.engSoft.entities.Student(studentDTO11);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str3 = student0.getEmail();
        java.lang.Boolean boolean4 = student0.getBanned();
        com.engSoft.DTO.StudentDTO studentDTO5 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student6 = new com.engSoft.entities.Student(studentDTO5);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(0);
        com.engSoft.DTO.StudentDTO studentDTO9 = new com.engSoft.DTO.StudentDTO(student0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.engSoft.entities.Student student10 = new com.engSoft.entities.Student(studentDTO9);
    }
}

