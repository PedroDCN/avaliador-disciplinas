package com.engSoft.AvaliadorDisciplinas.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=0, name='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=null, deletedComments=10}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=0, modality=null}");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Teacher{id=null, name= hi! }");
        java.lang.String str7 = student0.toString();
        java.lang.Long long8 = student0.getId();
        java.lang.Boolean boolean9 = student0.getBanned();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}" + "'", str7, "Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }", "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=-1, courseware=35, modality=null}", "Student{id=null, name='Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=null, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Class<?> wildcardClass6 = courseDTO5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        feedback0.setCourseware((java.lang.Integer) 100);
        java.lang.Long long3 = feedback0.getIdCourse();
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        java.lang.Boolean boolean2 = student0.getBanned();
        java.lang.String str3 = student0.toString();
        student0.setId((java.lang.Long) 10L);
        student0.setEmail("");
        student0.setDeletedComments((int) (byte) -1);
        java.lang.String str10 = student0.getNick();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str3, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Long long2 = feedback0.getId();
        java.lang.String str3 = feedback0.toString();
        java.lang.Long long4 = feedback0.getId();
        java.lang.Integer int5 = feedback0.getWorkload();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback();
        java.lang.Integer int7 = feedback6.getEvaluationSystem();
        feedback6.setIdCourse((java.lang.Long) 1L);
        feedback6.setPlanning((java.lang.Integer) 1);
        feedback6.setMethodology((java.lang.Integer) 1);
        java.lang.Integer int14 = feedback6.getWorkload();
        java.lang.Long long15 = feedback6.getId();
        java.lang.Integer int16 = feedback6.getEvaluationSystem();
        com.engSoft.entities.Feedback feedback17 = new com.engSoft.entities.Feedback();
        java.lang.Integer int18 = feedback17.getEvaluationSystem();
        feedback17.setIdCourse((java.lang.Long) 1L);
        feedback17.setIdCourse((java.lang.Long) 10L);
        com.engSoft.entities.Feedback feedback23 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum24 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback23.setModality(modalityEnum24);
        feedback23.setIdStudent((java.lang.Long) 1L);
        java.lang.String str28 = feedback23.toString();
        feedback23.setIdCourse((java.lang.Long) 0L);
        com.engSoft.entities.types.ModalityEnum modalityEnum31 = com.engSoft.entities.types.ModalityEnum.PRESENTIAL;
        feedback23.setModality(modalityEnum31);
        feedback17.setModality(modalityEnum31);
        feedback6.setModality(modalityEnum31);
        feedback0.setModality(modalityEnum31);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertTrue("'" + modalityEnum24 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum24.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str28, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + modalityEnum31 + "' != '" + com.engSoft.entities.types.ModalityEnum.PRESENTIAL + "'", modalityEnum31.equals(com.engSoft.entities.types.ModalityEnum.PRESENTIAL));
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        java.lang.Integer int3 = feedback0.getCourseware();
        feedback0.setIdStudent((java.lang.Long) 1L);
        feedback0.setWorkload((java.lang.Integer) 0);
        feedback0.setCourseware((java.lang.Integer) 0);
        feedback0.setEvaluationSystem((java.lang.Integer) 100);
        feedback0.setIdCourse((java.lang.Long) 0L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        java.lang.String str7 = student0.getEmail();
        student0.setDeletedComments((int) (byte) 100);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getInitialTime();
        course0.update(courseDTO16, (java.lang.Long) (-1L));
        java.lang.String str20 = courseDTO16.getInitialTime();
        java.lang.String str21 = courseDTO16.getNameTeacher();
        com.engSoft.entities.Course course23 = new com.engSoft.entities.Course(courseDTO16, (java.lang.Long) 10L);
        java.lang.String str24 = course23.getInitialTime();
        com.engSoft.entities.Course course25 = new com.engSoft.entities.Course();
        java.lang.String str26 = course25.getInitialTime();
        java.lang.String str27 = course25.getInitialTime();
        com.engSoft.DTO.CourseDTO courseDTO33 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "", "hi!", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Teacher{id=null, name= null }");
        java.lang.String str34 = courseDTO33.getName();
        course25.update(courseDTO33, (java.lang.Long) (-1L));
        java.lang.String str37 = course25.toString();
        com.engSoft.DTO.CourseDTO courseDTO43 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str44 = courseDTO43.getCode();
        com.engSoft.entities.Course course46 = new com.engSoft.entities.Course(courseDTO43, (java.lang.Long) 10L);
        com.engSoft.entities.Course course48 = new com.engSoft.entities.Course(courseDTO43, (java.lang.Long) 10L);
        java.lang.String str49 = courseDTO43.getName();
        course25.update(courseDTO43, (java.lang.Long) 0L);
        java.lang.String str52 = courseDTO43.getFinalTime();
        java.lang.String str53 = courseDTO43.getName();
        course23.update(courseDTO43, (java.lang.Long) 1L);
        java.lang.String str56 = courseDTO43.getNameTeacher();
        java.lang.String str57 = courseDTO43.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str34, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}" + "'", str37, "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str49, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str52, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str53, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str56, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str57, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str5 = studentDTO2.getEmail();
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        studentDTO2.setName("Teacher{id=null, name= null }");
        studentDTO2.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str12 = studentDTO2.getEmail();
        studentDTO2.setName("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str12, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getName();
        java.lang.String str8 = courseDTO5.getFinalTime();
        com.engSoft.entities.Course course10 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO2);
        java.lang.String str4 = teacherDTO2.getName();
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO2);
        java.lang.String str6 = teacherDTO2.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Teacher{id=null, name= hi! }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        com.engSoft.entities.Course course7 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        java.lang.String str8 = course7.getCode();
        java.lang.String str9 = course7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str8, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}', idTeacher='100', initialTime='Teacher{id=null, name= hi! }', finalTime='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}'}" + "'", str9, "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}', idTeacher='100', initialTime='Teacher{id=null, name= hi! }', finalTime='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}'}");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str7 = studentDTO6.getName();
        studentDTO6.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setId((java.lang.Long) (-1L));
        student0.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setEvaluationSystem((java.lang.Integer) 100);
        java.lang.Integer int6 = feedback0.getPlanning();
        feedback0.setEvaluationSystem((java.lang.Integer) 10);
        feedback0.setIdStudent((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=1, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str7 = student0.toString();
        java.lang.String str8 = student0.getName();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=null}");
        student0.setName("Teacher{id=null, name= Student{id=null, name='null', email='null', nick='', isBanned=null, deletedComments=0} }");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str7, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Long long5 = feedbackDTO0.getIdStudent();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback8 = new com.engSoft.entities.Feedback(feedbackDTO0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str2 = teacher1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }" + "'", str2, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback8 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        java.lang.Long long10 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setName("Teacher{id=null, name= null }");
        student0.setId((java.lang.Long) 10L);
        java.lang.String str11 = student0.getNick();
        student0.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setEvaluationSystem((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedback0.getModality();
        java.lang.Long long9 = feedback0.getId();
        java.lang.Long long10 = feedback0.getIdStudent();
        feedback0.setPlanning((java.lang.Integer) (-1));
        feedback0.setEvaluationSystem((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        java.lang.Boolean boolean2 = student0.getBanned();
        java.lang.String str3 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        java.lang.String str6 = student0.getEmail();
        java.lang.String str7 = student0.getNick();
        student0.setId((java.lang.Long) 100L);
        student0.setBanned((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=-1, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        java.lang.Integer int3 = feedback0.getCourseware();
        feedback0.setIdStudent((java.lang.Long) 1L);
        java.lang.String str6 = feedback0.toString();
        java.lang.Integer int7 = feedback0.getMethodology();
        com.engSoft.entities.Feedback feedback8 = new com.engSoft.entities.Feedback();
        java.lang.Integer int9 = feedback8.getEvaluationSystem();
        feedback8.setIdCourse((java.lang.Long) 1L);
        feedback8.setPlanning((java.lang.Integer) 1);
        feedback8.setPlanning((java.lang.Integer) 10);
        feedback8.setMethodology((java.lang.Integer) 0);
        com.engSoft.entities.Feedback feedback18 = new com.engSoft.entities.Feedback();
        java.lang.Integer int19 = feedback18.getEvaluationSystem();
        feedback18.setIdCourse((java.lang.Long) 1L);
        com.engSoft.entities.Feedback feedback22 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum23 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback22.setModality(modalityEnum23);
        feedback18.setModality(modalityEnum23);
        feedback8.setModality(modalityEnum23);
        feedback0.setModality(modalityEnum23);
        java.lang.Integer int28 = feedback0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertTrue("'" + modalityEnum23 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum23.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(int28);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setNick("Student{id=null, name='null', email='Teacher{id=null, name=  }', nick='Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}");
        com.engSoft.DTO.StudentDTO studentDTO9 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str10 = studentDTO9.getEmail();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        java.lang.String str5 = student0.toString();
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str9 = studentDTO8.getName();
        studentDTO8.setEmail("Student{id=0, name='null', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setBanned((java.lang.Boolean) true);
        student0.setBanned((java.lang.Boolean) true);
        student0.setNick("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
        java.lang.String str9 = student0.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=true, deletedComments=0}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getPlanning();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        java.lang.Integer int7 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int7 = feedback6.getEvaluationSystem();
        feedback6.setIdStudent((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getInitialTime();
        course0.update(courseDTO16, (java.lang.Long) (-1L));
        java.lang.String str20 = course0.toString();
        java.lang.String str21 = course0.getFinalTime();
        java.lang.String str22 = course0.getCode();
        java.lang.String str23 = course0.getCode();
        com.engSoft.DTO.CourseDTO courseDTO29 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str30 = courseDTO29.getName();
        java.lang.String str31 = courseDTO29.getInitialTime();
        java.lang.String str32 = courseDTO29.getCode();
        java.lang.String str33 = courseDTO29.getFinalTime();
        java.lang.String str34 = courseDTO29.getName();
        course0.update(courseDTO29, (java.lang.Long) 0L);
        java.lang.String str37 = courseDTO29.getInitialTime();
        java.lang.String str38 = courseDTO29.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str30, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str33, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str34, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=10, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=false, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long8 = feedbackDTO0.getIdCourse();
        java.lang.Integer int9 = feedbackDTO0.getCourseware();
        java.lang.Long long10 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        java.lang.Boolean boolean2 = student0.getBanned();
        java.lang.String str3 = student0.toString();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str6 = student0.getNick();
        java.lang.Boolean boolean7 = student0.getBanned();
        student0.setDeletedComments(35);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str3, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedback6.getModality();
        java.lang.Integer int8 = feedback6.getWorkload();
        java.lang.Long long9 = feedback6.getIdCourse();
        feedback6.setCourseware((java.lang.Integer) 100);
        feedback6.setIdStudent((java.lang.Long) 0L);
        feedback6.setCourseware((java.lang.Integer) 1);
        java.lang.Integer int16 = feedback6.getWorkload();
        java.lang.Integer int17 = feedback6.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(int17);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getName();
        com.engSoft.entities.Course course12 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        com.engSoft.entities.Course course14 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 1L);
        java.lang.Long long15 = course14.getId();
        java.lang.Long long16 = course14.getId();
        java.lang.String str17 = course14.getInitialTime();
        java.lang.String str18 = course14.getCode();
        java.lang.String str19 = course14.getCode();
        com.engSoft.DTO.CourseDTO courseDTO25 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Teacher{id=null, name=  }", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str26 = courseDTO25.getCode();
        java.lang.String str27 = courseDTO25.getFinalTime();
        course14.update(courseDTO25, (java.lang.Long) 1L);
        java.lang.String str30 = courseDTO25.getNameTeacher();
        java.lang.String str31 = courseDTO25.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str26, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str27, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str30, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str31, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        int int1 = student0.getDeletedComments();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        com.engSoft.DTO.StudentDTO studentDTO3 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=PRESENTIAL}");
        student0.setDeletedComments((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Long long2 = feedback0.getId();
        feedback0.setCourseware((java.lang.Integer) 1);
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedback0.getModality();
        com.engSoft.entities.types.ModalityEnum modalityEnum6 = feedback0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(modalityEnum6);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        java.lang.String str7 = student0.getNick();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.String str12 = student0.getEmail();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        java.lang.Long long11 = course0.getId();
        java.lang.String str12 = course0.getName();
        java.lang.String str13 = course0.getCode();
        com.engSoft.entities.Course course14 = new com.engSoft.entities.Course();
        java.lang.String str15 = course14.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO21 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str22 = courseDTO21.getName();
        java.lang.String str23 = courseDTO21.getInitialTime();
        java.lang.String str24 = courseDTO21.getCode();
        java.lang.String str25 = courseDTO21.getFinalTime();
        java.lang.String str26 = courseDTO21.getInitialTime();
        course14.update(courseDTO21, (java.lang.Long) 10L);
        java.lang.String str29 = courseDTO21.getFinalTime();
        course0.update(courseDTO21, (java.lang.Long) 10L);
        com.engSoft.DTO.CourseDTO courseDTO37 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str38 = courseDTO37.getCode();
        com.engSoft.entities.Course course40 = new com.engSoft.entities.Course(courseDTO37, (java.lang.Long) 100L);
        course0.update(courseDTO37, (java.lang.Long) 100L);
        com.engSoft.entities.Course course43 = new com.engSoft.entities.Course();
        java.lang.String str44 = course43.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO50 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str51 = courseDTO50.getCode();
        course43.update(courseDTO50, (java.lang.Long) 1L);
        java.lang.Long long54 = course43.getId();
        java.lang.String str55 = course43.getName();
        java.lang.String str56 = course43.getCode();
        com.engSoft.DTO.CourseDTO courseDTO62 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str63 = courseDTO62.getCode();
        com.engSoft.entities.Course course65 = new com.engSoft.entities.Course(courseDTO62, (java.lang.Long) 10L);
        course43.update(courseDTO62, (java.lang.Long) 1L);
        course0.update(courseDTO62, (java.lang.Long) 1L);
        com.engSoft.entities.Course course70 = new com.engSoft.entities.Course();
        java.lang.String str71 = course70.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO77 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str78 = courseDTO77.getCode();
        course70.update(courseDTO77, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO86 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str87 = courseDTO86.getInitialTime();
        course70.update(courseDTO86, (java.lang.Long) (-1L));
        java.lang.String str90 = courseDTO86.getInitialTime();
        java.lang.String str91 = courseDTO86.getNameTeacher();
        java.lang.String str92 = courseDTO86.getFinalTime();
        course0.update(courseDTO86, (java.lang.Long) 0L);
        java.lang.String str95 = courseDTO86.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str22, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str25, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str29, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNull(long54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str55, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str91, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str92, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=null, name='null', email='null', nick='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='null', email='null', nick='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}', isBanned=true, deletedComments=0}");
        teacher1.setName("Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        java.lang.String str7 = student0.getNick();
        student0.setNick("Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null}', isBanned=false, deletedComments=0}");
        student0.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=-1, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("");
        java.lang.String str2 = teacher1.getName();
        java.lang.String str3 = teacher1.toString();
        teacher1.setName("Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}");
        java.lang.Long long6 = teacher1.getId();
        teacher1.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=-1, planning=null, evaluationSystem=1, courseware=1, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name=  }" + "'", str3, "Teacher{id=null, name=  }");
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setEvaluationSystem((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedback0.getModality();
        java.lang.Long long9 = feedback0.getId();
        java.lang.Long long10 = feedback0.getIdStudent();
        feedback0.setPlanning((java.lang.Integer) (-1));
        feedback0.setIdStudent((java.lang.Long) 0L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("");
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher1);
        teacherDTO2.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
        teacherDTO2.setName("Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        com.engSoft.entities.Teacher teacher7 = new com.engSoft.entities.Teacher(teacherDTO2);
        java.lang.String str8 = teacher7.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO9 = new com.engSoft.DTO.TeacherDTO(teacher7);
        java.lang.String str10 = teacherDTO9.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str8, "Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str10, "Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacher0.getName();
        java.lang.String str5 = teacher0.toString();
        java.lang.String str6 = teacher0.toString();
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str9 = teacher0.toString();
        java.lang.Long long10 = teacher0.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }" + "'", str9, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }");
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback6.setEvaluationSystem((java.lang.Integer) 0);
        java.lang.Integer int9 = feedback6.getWorkload();
        java.lang.Integer int10 = feedback6.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
        teacher1.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=10, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Teacher{id=null, name=  }");
        studentDTO2.setEmail("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        studentDTO2.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        studentDTO2.setEmail("Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
        studentDTO2.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=null, deletedComments=32}");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        java.lang.Long long8 = feedbackDTO0.getIdCourse();
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        java.lang.Long long10 = feedbackDTO0.getIdCourse();
        java.lang.Integer int11 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        java.lang.String str7 = student0.getNick();
        student0.setDeletedComments((int) 'a');
        student0.setId((java.lang.Long) 10L);
        com.engSoft.DTO.StudentDTO studentDTO12 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str13 = student0.getNick();
        student0.setName("Feedback{id=null, idCourse=1, idStudent=-1, workload=null, methodology=1, planning=0, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        teacherDTO1.setName("Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}", "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        java.lang.String str3 = studentDTO2.getName();
        studentDTO2.setEmail("Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        studentDTO2.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str8 = studentDTO2.getEmail();
        java.lang.String str9 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str3, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}" + "'", str8, "Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.String str2 = student0.toString();
        student0.setId((java.lang.Long) 1L);
        student0.setBanned((java.lang.Boolean) false);
        student0.setNick("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str2, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        feedback0.setIdStudent((java.lang.Long) 1L);
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback();
        java.lang.Integer int6 = feedback5.getEvaluationSystem();
        feedback5.setIdCourse((java.lang.Long) 1L);
        feedback5.setEvaluationSystem((java.lang.Integer) 100);
        java.lang.Integer int11 = feedback5.getPlanning();
        feedback5.setIdStudent((java.lang.Long) 100L);
        feedback5.setMethodology((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum16 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback5.setModality(modalityEnum16);
        feedback0.setModality(modalityEnum16);
        feedback0.setEvaluationSystem((java.lang.Integer) 0);
        feedback0.setPlanning((java.lang.Integer) 100);
        java.lang.Integer int23 = feedback0.getWorkload();
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + modalityEnum16 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum16.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(int23);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        teacher4.setName("Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean7 = student0.getBanned();
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student9 = new com.engSoft.entities.Student(studentDTO8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        studentDTO2.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
        studentDTO2.setName("Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}");
        studentDTO2.setEmail("Student{id=1, name='null', email='null', nick='hi!', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        student0.setEmail("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        student0.setDeletedComments((int) 'a');
        student0.setId((java.lang.Long) 100L);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.String str5 = student0.getName();
        student0.setBanned((java.lang.Boolean) true);
        student0.setEmail("");
        java.lang.Long long10 = student0.getId();
        student0.setEmail("Teacher{id=null, name= Student{id=null, name='null', email='null', nick='', isBanned=null, deletedComments=0} }");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("hi!");
        java.lang.String str2 = teacher1.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher1);
        java.lang.String str4 = teacherDTO3.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str2, "Teacher{id=null, name= hi! }");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        java.lang.String str9 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO10 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setNick("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
        java.lang.String str13 = student0.getEmail();
        java.lang.Long long14 = student0.getId();
        student0.setDeletedComments(97);
        student0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getInitialTime();
        course0.update(courseDTO16, (java.lang.Long) (-1L));
        java.lang.String str20 = course0.toString();
        java.lang.String str21 = course0.getFinalTime();
        java.lang.String str22 = course0.getCode();
        java.lang.String str23 = course0.getCode();
        java.lang.String str24 = course0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str24, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setId((java.lang.Long) (-1L));
        student0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getName();
        java.lang.String str10 = courseDTO5.getNameTeacher();
        java.lang.String str11 = courseDTO5.getName();
        java.lang.String str12 = courseDTO5.getInitialTime();
        java.lang.String str13 = courseDTO5.getName();
        java.lang.String str14 = courseDTO5.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        java.lang.String str7 = student0.getNick();
        java.lang.String str8 = student0.getName();
        java.lang.String str9 = student0.getEmail();
        int int10 = student0.getDeletedComments();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedback3.getCourseware();
        feedback3.setMethodology((java.lang.Integer) 100);
        java.lang.Integer int7 = feedback3.getPlanning();
        java.lang.Integer int8 = feedback3.getEvaluationSystem();
        com.engSoft.entities.Feedback feedback9 = new com.engSoft.entities.Feedback();
        java.lang.Integer int10 = feedback9.getEvaluationSystem();
        feedback9.setIdCourse((java.lang.Long) 1L);
        feedback9.setIdCourse((java.lang.Long) 10L);
        feedback9.setEvaluationSystem((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum17 = feedback9.getModality();
        feedback9.setMethodology((java.lang.Integer) 100);
        com.engSoft.entities.Feedback feedback20 = new com.engSoft.entities.Feedback();
        java.lang.Integer int21 = feedback20.getEvaluationSystem();
        java.lang.String str22 = feedback20.toString();
        java.lang.Long long23 = feedback20.getId();
        com.engSoft.entities.Feedback feedback24 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum25 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback24.setModality(modalityEnum25);
        feedback20.setModality(modalityEnum25);
        feedback9.setModality(modalityEnum25);
        feedback3.setModality(modalityEnum25);
        feedback3.setPlanning((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(modalityEnum17);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str22, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long23);
        org.junit.Assert.assertTrue("'" + modalityEnum25 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum25.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        java.lang.String str3 = studentDTO2.getName();
        studentDTO2.setName("hi!");
        java.lang.String str6 = studentDTO2.getName();
        java.lang.String str7 = studentDTO2.getName();
        java.lang.String str8 = studentDTO2.getEmail();
        java.lang.String str9 = studentDTO2.getName();
        java.lang.String str10 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        feedback0.setIdStudent((java.lang.Long) 100L);
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedback0.getModality();
        feedback0.setIdStudent((java.lang.Long) 10L);
        feedback0.setIdCourse((java.lang.Long) 0L);
        java.lang.String str9 = feedback0.toString();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=0, idStudent=10, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str9, "Feedback{id=null, idCourse=0, idStudent=10, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', nick='null', isBanned=null, deletedComments=10}", "Student{id=null, name='null', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=false, deletedComments=-1}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Integer int4 = feedbackDTO0.getWorkload();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        java.lang.Long long8 = feedbackDTO0.getIdCourse();
        java.lang.Long long9 = feedbackDTO0.getIdCourse();
        java.lang.Integer int10 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int11 = feedbackDTO0.getWorkload();
        java.lang.Integer int12 = feedbackDTO0.getCourseware();
        java.lang.Integer int13 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getMethodology();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments((int) (byte) -1);
        student0.setBanned((java.lang.Boolean) false);
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.Long long11 = student0.getId();
        student0.setNick("Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
        student0.setBanned((java.lang.Boolean) false);
        student0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        com.engSoft.entities.Course course9 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        com.engSoft.entities.Course course10 = new com.engSoft.entities.Course();
        java.lang.String str11 = course10.getFinalTime();
        java.lang.Long long12 = course10.getId();
        com.engSoft.DTO.CourseDTO courseDTO18 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str19 = courseDTO18.getCode();
        course10.update(courseDTO18, (java.lang.Long) 0L);
        com.engSoft.entities.Course course23 = new com.engSoft.entities.Course(courseDTO18, (java.lang.Long) 0L);
        course9.update(courseDTO18, (java.lang.Long) 10L);
        java.lang.Long long26 = course9.getId();
        java.lang.String str27 = course9.getCode();
        java.lang.Long long28 = course9.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str6, "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str7, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(long26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(long28);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.String str4 = student0.toString();
        java.lang.String str5 = student0.getEmail();
        java.lang.String str6 = student0.getEmail();
        student0.setDeletedComments(0);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str4, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str7 = student0.getName();
        java.lang.Boolean boolean8 = student0.getBanned();
        student0.setDeletedComments((int) (short) -1);
        student0.setId((java.lang.Long) 1L);
        java.lang.String str13 = student0.getEmail();
        java.lang.String str14 = student0.getNick();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getInitialTime();
        course0.update(courseDTO16, (java.lang.Long) (-1L));
        java.lang.String str20 = courseDTO16.getInitialTime();
        com.engSoft.entities.Course course22 = new com.engSoft.entities.Course(courseDTO16, (java.lang.Long) 10L);
        com.engSoft.entities.Course course24 = new com.engSoft.entities.Course(courseDTO16, (java.lang.Long) 100L);
        java.lang.Long long25 = course24.getId();
        com.engSoft.entities.Course course26 = new com.engSoft.entities.Course();
        java.lang.String str27 = course26.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO33 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str34 = courseDTO33.getCode();
        course26.update(courseDTO33, (java.lang.Long) 1L);
        java.lang.Long long37 = course26.getId();
        java.lang.String str38 = course26.getName();
        java.lang.String str39 = course26.getCode();
        com.engSoft.DTO.CourseDTO courseDTO45 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str46 = courseDTO45.getCode();
        com.engSoft.entities.Course course48 = new com.engSoft.entities.Course(courseDTO45, (java.lang.Long) 10L);
        course26.update(courseDTO45, (java.lang.Long) 1L);
        java.lang.String str51 = courseDTO45.getInitialTime();
        java.lang.String str52 = courseDTO45.getCode();
        course24.update(courseDTO45, (java.lang.Long) (-1L));
        java.lang.String str55 = course24.getName();
        java.lang.Long long56 = course24.getId();
        java.lang.String str57 = course24.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(long37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str38, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str55, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str57, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("");
        teacherDTO1.setName("");
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str5 = teacherDTO1.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=0, name='null', email='null', nick='null', isBanned=false, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=1, courseware=0, modality=null}", "Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='Teacher{id=null, name= hi! }', idTeacher='100', initialTime='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', finalTime='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}'}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null} }");
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Long long1 = feedback0.getIdStudent();
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setCourseware((java.lang.Integer) (-1));
        feedback0.setWorkload((java.lang.Integer) 100);
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        java.lang.String str7 = student0.getNick();
        java.lang.Long long8 = student0.getId();
        java.lang.String str9 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO10 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=0}" + "'", str9, "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        feedback0.setIdStudent((java.lang.Long) 1L);
        java.lang.String str5 = feedback0.toString();
        java.lang.Long long6 = feedback0.getId();
        feedback0.setEvaluationSystem((java.lang.Integer) 10);
        java.lang.Integer int9 = feedback0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum10 = feedback0.getModality();
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + modalityEnum10 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum10.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        com.engSoft.entities.types.ModalityEnum modalityEnum6 = feedbackDTO0.getModality();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(modalityEnum6);
        org.junit.Assert.assertNull(modalityEnum7);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setId((java.lang.Long) 100L);
        java.lang.String str7 = student0.getName();
        student0.setName("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedbackDTO0.getModality();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Integer int4 = feedbackDTO0.getPlanning();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum6 = feedbackDTO0.getModality();
        java.lang.Integer int7 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str7 = student0.getName();
        java.lang.Boolean boolean8 = student0.getBanned();
        student0.setDeletedComments((int) (short) -1);
        int int11 = student0.getDeletedComments();
        student0.setDeletedComments((int) 'a');
        java.lang.String str14 = student0.getNick();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum10 = feedbackDTO0.getModality();
        java.lang.Integer int11 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(modalityEnum10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long9 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback10 = new com.engSoft.entities.Feedback(feedbackDTO0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setMethodology((java.lang.Integer) 1);
        java.lang.Integer int8 = feedback0.getWorkload();
        java.lang.Long long9 = feedback0.getId();
        java.lang.Integer int10 = feedback0.getEvaluationSystem();
        java.lang.Integer int11 = feedback0.getCourseware();
        feedback0.setIdStudent((java.lang.Long) 10L);
        feedback0.setCourseware((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Integer int2 = feedback0.getWorkload();
        java.lang.Integer int3 = feedback0.getWorkload();
        java.lang.Integer int4 = feedback0.getWorkload();
        feedback0.setPlanning((java.lang.Integer) 10);
        java.lang.Long long7 = feedback0.getIdStudent();
        feedback0.setIdCourse((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Integer int8 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback9 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int10 = feedbackDTO0.getWorkload();
        java.lang.Long long11 = feedbackDTO0.getIdCourse();
        java.lang.Integer int12 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Long long1 = feedback0.getIdStudent();
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setCourseware((java.lang.Integer) (-1));
        java.lang.Integer int8 = feedback0.getEvaluationSystem();
        feedback0.setWorkload((java.lang.Integer) 0);
        com.engSoft.entities.Feedback feedback11 = new com.engSoft.entities.Feedback();
        java.lang.Integer int12 = feedback11.getEvaluationSystem();
        feedback11.setIdCourse((java.lang.Long) 1L);
        feedback11.setEvaluationSystem((java.lang.Integer) 10);
        java.lang.Long long17 = feedback11.getIdStudent();
        com.engSoft.entities.Feedback feedback18 = new com.engSoft.entities.Feedback();
        java.lang.Integer int19 = feedback18.getEvaluationSystem();
        feedback18.setIdCourse((java.lang.Long) 1L);
        feedback18.setIdCourse((java.lang.Long) 10L);
        com.engSoft.entities.Feedback feedback24 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum25 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback24.setModality(modalityEnum25);
        feedback24.setIdStudent((java.lang.Long) 1L);
        java.lang.String str29 = feedback24.toString();
        feedback24.setIdCourse((java.lang.Long) 0L);
        com.engSoft.entities.types.ModalityEnum modalityEnum32 = com.engSoft.entities.types.ModalityEnum.PRESENTIAL;
        feedback24.setModality(modalityEnum32);
        feedback18.setModality(modalityEnum32);
        feedback11.setModality(modalityEnum32);
        feedback0.setModality(modalityEnum32);
        java.lang.Integer int37 = feedback0.getMethodology();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertTrue("'" + modalityEnum25 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum25.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str29, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + modalityEnum32 + "' != '" + com.engSoft.entities.types.ModalityEnum.PRESENTIAL + "'", modalityEnum32.equals(com.engSoft.entities.types.ModalityEnum.PRESENTIAL));
        org.junit.Assert.assertNull(int37);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getInitialTime();
        course0.update(courseDTO16, (java.lang.Long) (-1L));
        java.lang.String str20 = course0.toString();
        java.lang.String str21 = course0.getFinalTime();
        java.lang.String str22 = course0.getCode();
        java.lang.String str23 = course0.getCode();
        com.engSoft.DTO.CourseDTO courseDTO29 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str30 = courseDTO29.getName();
        java.lang.String str31 = courseDTO29.getInitialTime();
        java.lang.String str32 = courseDTO29.getCode();
        java.lang.String str33 = courseDTO29.getFinalTime();
        java.lang.String str34 = courseDTO29.getName();
        course0.update(courseDTO29, (java.lang.Long) 0L);
        java.lang.String str37 = course0.getCode();
        java.lang.String str38 = course0.getFinalTime();
        java.lang.Class<?> wildcardClass39 = course0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str30, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str33, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str34, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str38, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.toString();
        java.lang.Long long5 = course0.getIdTeacher();
        java.lang.Long long6 = course0.getId();
        java.lang.String str7 = course0.getName();
        com.engSoft.DTO.CourseDTO courseDTO13 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str14 = courseDTO13.getName();
        java.lang.String str15 = courseDTO13.getInitialTime();
        java.lang.String str16 = courseDTO13.getCode();
        java.lang.String str17 = courseDTO13.getName();
        java.lang.String str18 = courseDTO13.getNameTeacher();
        java.lang.String str19 = courseDTO13.getFinalTime();
        java.lang.String str20 = courseDTO13.getFinalTime();
        java.lang.String str21 = courseDTO13.getFinalTime();
        course0.update(courseDTO13, (java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str4, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str17, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str18, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str19, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str20, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=true, deletedComments=0}", "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        student0.setEmail("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        student0.setName("Teacher{id=null, name= Teacher{id=null, name=  } }");
        java.lang.String str11 = student0.toString();
        student0.setNick("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=null, name='Teacher{id=null, name= Teacher{id=null, name=  } }', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}" + "'", str11, "Student{id=null, name='Teacher{id=null, name= Teacher{id=null, name=  } }', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='Teacher{id=null, name= hi! }', idTeacher='1', initialTime='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', finalTime='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}'}", "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}", "Student{id=null, name='hi!', email='Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}', nick='', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getFinalTime();
        java.lang.String str5 = course0.getFinalTime();
        java.lang.Long long6 = course0.getId();
        java.lang.String str7 = course0.getCode();
        java.lang.Long long8 = course0.getIdTeacher();
        java.lang.String str9 = course0.getCode();
        java.lang.String str10 = course0.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.getName();
        teacher0.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO4);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str7 = student0.getName();
        java.lang.Boolean boolean8 = student0.getBanned();
        java.lang.Long long9 = student0.getId();
        student0.setNick("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}");
        int int12 = student0.getDeletedComments();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        java.lang.String str7 = student0.getNick();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        com.engSoft.DTO.StudentDTO studentDTO10 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str13 = student0.getNick();
        java.lang.String str14 = student0.getEmail();
        java.lang.Long long15 = student0.getId();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long15);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setId((java.lang.Long) 100L);
        java.lang.Boolean boolean7 = student0.getBanned();
        java.lang.String str8 = student0.getNick();
        student0.setId((java.lang.Long) 0L);
        com.engSoft.DTO.StudentDTO studentDTO11 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str12 = student0.getName();
        java.lang.String str13 = student0.getNick();
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        teacher4.setName("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        teacher4.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}");
        java.lang.Long long9 = teacher4.getId();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        student0.setNick("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=100, modality=null}");
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=10, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.String str7 = student0.getName();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        java.lang.Boolean boolean2 = student0.getBanned();
        java.lang.String str3 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        java.lang.String str6 = student0.getEmail();
        java.lang.String str7 = student0.getNick();
        java.lang.Long long8 = student0.getId();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        int int11 = student0.getDeletedComments();
        student0.setName("Student{id=null, name='null', email='null', nick='', isBanned=null, deletedComments=0}");
        student0.setId((java.lang.Long) 10L);
        student0.setBanned((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        java.lang.Long long4 = feedback0.getIdStudent();
        feedback0.setMethodology((java.lang.Integer) (-1));
        java.lang.Long long7 = feedback0.getId();
        feedback0.setMethodology((java.lang.Integer) 1);
        java.lang.Long long10 = feedback0.getIdStudent();
        feedback0.setEvaluationSystem((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        java.lang.Integer int8 = feedbackDTO0.getMethodology();
        java.lang.Integer int9 = feedbackDTO0.getMethodology();
        java.lang.Integer int10 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Feedback{id=null, idCourse=10, idStudent=null, workload=0, methodology=null, planning=null, evaluationSystem=null, courseware=-1, modality=null}");
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.String str2 = course0.toString();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str9 = courseDTO8.getName();
        java.lang.String str10 = courseDTO8.getInitialTime();
        java.lang.String str11 = courseDTO8.getCode();
        java.lang.String str12 = courseDTO8.getFinalTime();
        course0.update(courseDTO8, (java.lang.Long) 10L);
        java.lang.Long long15 = course0.getId();
        java.lang.String str16 = course0.getInitialTime();
        java.lang.String str17 = course0.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("");
        teacher0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = teacher0.toString();
        java.lang.Long long7 = teacher0.getId();
        java.lang.String str8 = teacher0.toString();
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }" + "'", str6, "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }");
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }" + "'", str8, "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=0}", "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        java.lang.String str3 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=0}" + "'", str3, "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getName();
        java.lang.String str10 = courseDTO5.getNameTeacher();
        java.lang.String str11 = courseDTO5.getFinalTime();
        java.lang.String str12 = courseDTO5.getNameTeacher();
        com.engSoft.entities.Course course14 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        com.engSoft.entities.Course course16 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        com.engSoft.entities.Course course18 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 1L);
        java.lang.String str19 = course18.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str19, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getInitialTime();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "", "hi!", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Teacher{id=null, name= null }");
        java.lang.String str9 = courseDTO8.getName();
        course0.update(courseDTO8, (java.lang.Long) (-1L));
        java.lang.String str12 = course0.getFinalTime();
        java.lang.String str13 = course0.getName();
        java.lang.String str14 = course0.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str9, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Teacher{id=null, name= null }" + "'", str12, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str13, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str14, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=10, planning=null, evaluationSystem=35, courseware=10, modality=null}");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=0, modality=null}");
        studentDTO2.setEmail("Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }");
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=0, modality=null}");
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student3 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str7 = student0.getName();
        java.lang.Boolean boolean8 = student0.getBanned();
        java.lang.Long long9 = student0.getId();
        student0.setNick("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}");
        student0.setNick("Teacher{id=null, name= Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0} }");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.toString();
        java.lang.String str2 = teacher0.getName();
        java.lang.Long long3 = teacher0.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO5 = new com.engSoft.DTO.TeacherDTO(teacher0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Teacher{id=null, name= null }" + "'", str1, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        java.lang.Integer int2 = feedback0.getPlanning();
        java.lang.Long long3 = feedback0.getId();
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedback0.getModality();
        feedback0.setPlanning((java.lang.Integer) 35);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(modalityEnum4);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        java.lang.Integer int8 = feedbackDTO0.getPlanning();
        java.lang.Integer int9 = feedbackDTO0.getPlanning();
        java.lang.Integer int10 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int11 = feedbackDTO0.getMethodology();
        java.lang.Integer int12 = feedbackDTO0.getCourseware();
        java.lang.Integer int13 = feedbackDTO0.getCourseware();
        java.lang.Integer int14 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        student0.setName("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = student0.getName();
        java.lang.String str7 = student0.getName();
        student0.setId((java.lang.Long) 10L);
        com.engSoft.DTO.StudentDTO studentDTO10 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO10.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str6, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int8 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        java.lang.String str2 = teacher1.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}" + "'", str2, "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Integer int8 = feedbackDTO0.getMethodology();
        java.lang.Integer int9 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum10 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(modalityEnum10);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        java.lang.String str7 = student0.getNick();
        java.lang.Long long8 = student0.getId();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str11 = student0.toString();
        student0.setEmail("Teacher{id=null, name= Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} } }");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}" + "'", str11, "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long4 = teacher0.getId();
        java.lang.String str5 = teacher0.toString();
        teacher0.setName("Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}");
        java.lang.String str8 = teacher0.toString();
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0} }" + "'", str8, "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0} }");
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.Feedback feedback2 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int3 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getPlanning();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(modalityEnum7);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        int int2 = student0.getDeletedComments();
        java.lang.Boolean boolean3 = student0.getBanned();
        student0.setNick("");
        student0.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        java.lang.Class<?> wildcardClass9 = feedbackDTO0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        java.lang.String str2 = teacher1.toString();
        java.lang.String str3 = teacher1.toString();
        java.lang.String str4 = teacher1.toString();
        java.lang.String str5 = teacher1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0} }" + "'", str2, "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0} }");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0} }" + "'", str3, "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0} }");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0} }" + "'", str4, "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0} }");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        java.lang.Long long3 = feedback0.getId();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback4.setModality(modalityEnum5);
        feedback0.setModality(modalityEnum5);
        java.lang.Integer int8 = feedback0.getMethodology();
        feedback0.setMethodology((java.lang.Integer) 0);
        java.lang.Integer int11 = feedback0.getPlanning();
        feedback0.setPlanning((java.lang.Integer) 35);
        feedback0.setWorkload((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertTrue("'" + modalityEnum5 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum5.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Integer int7 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Long long2 = feedbackDTO0.getIdStudent();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Integer int4 = feedbackDTO0.getMethodology();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        feedback0.setCourseware((java.lang.Integer) 100);
        feedback0.setPlanning((java.lang.Integer) 10);
        java.lang.Long long5 = feedback0.getIdCourse();
        java.lang.Integer int6 = feedback0.getWorkload();
        java.lang.Long long7 = feedback0.getIdCourse();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=0, modality=null}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}", "Feedback{id=null, idCourse=1, idStudent=null, workload=1, methodology=0, planning=10, evaluationSystem=null, courseware=null, modality=null}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}", "Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=0, modality=null}");
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=-1, planning=null, evaluationSystem=100, courseware=null, modality=REMOTE}");
        java.lang.String str2 = teacher1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=-1, planning=null, evaluationSystem=100, courseware=null, modality=REMOTE}" + "'", str2, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=-1, planning=null, evaluationSystem=100, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setName("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        student0.setName("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.String str11 = student0.toString();
        java.lang.String str12 = student0.getName();
        java.lang.String str13 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO14 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str11, "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str12, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str13, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        java.lang.String str7 = student0.getNick();
        java.lang.Long long8 = student0.getId();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str11 = student0.getName();
        student0.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getCode();
        java.lang.String str5 = course0.getCode();
        java.lang.String str6 = course0.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=1, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}", "Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}", "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null}", "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=PRESENTIAL}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=1, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}" + "'", str6, "Student{id=1, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setEvaluationSystem((java.lang.Integer) 10);
        feedback0.setIdStudent((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedback6.getModality();
        java.lang.Integer int8 = feedback6.getWorkload();
        java.lang.Long long9 = feedback6.getIdCourse();
        feedback6.setCourseware((java.lang.Integer) 100);
        feedback6.setCourseware((java.lang.Integer) 10);
        feedback6.setEvaluationSystem((java.lang.Integer) 0);
        feedback6.setPlanning((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        java.lang.String str11 = courseDTO7.getName();
        com.engSoft.entities.Course course13 = new com.engSoft.entities.Course(courseDTO7, (java.lang.Long) 100L);
        java.lang.String str14 = courseDTO7.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        java.lang.String str7 = student0.getNick();
        student0.setDeletedComments((int) 'a');
        student0.setId((java.lang.Long) 10L);
        java.lang.String str12 = student0.getEmail();
        student0.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getInitialTime();
        course0.update(courseDTO16, (java.lang.Long) (-1L));
        java.lang.String str20 = courseDTO16.getInitialTime();
        java.lang.String str21 = courseDTO16.getFinalTime();
        java.lang.String str22 = courseDTO16.getName();
        java.lang.String str23 = courseDTO16.getName();
        java.lang.String str24 = courseDTO16.getName();
        java.lang.String str25 = courseDTO16.getInitialTime();
        java.lang.String str26 = courseDTO16.getFinalTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str22, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str23, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str24, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str26, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(0);
        student0.setDeletedComments(1);
        java.lang.Boolean boolean11 = student0.getBanned();
        java.lang.String str12 = student0.getNick();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        teacherDTO1.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}");
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        teacherDTO1.setName("Student{id=0, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Integer int3 = feedbackDTO0.getPlanning();
        java.lang.Integer int4 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long5 = feedbackDTO0.getIdStudent();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        java.lang.Integer int8 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Long long1 = feedback0.getIdStudent();
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setCourseware((java.lang.Integer) (-1));
        feedback0.setIdCourse((java.lang.Long) (-1L));
        java.lang.Integer int10 = feedback0.getPlanning();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.Long long3 = teacher2.getId();
        java.lang.String str4 = teacher2.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO5 = new com.engSoft.DTO.TeacherDTO(teacher2);
        teacherDTO5.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='1', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        com.engSoft.entities.Teacher teacher8 = new com.engSoft.entities.Teacher(teacherDTO5);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}" + "'", str4, "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str7 = student0.toString();
        student0.setNick("Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=0, modality=null}");
        int int10 = student0.getDeletedComments();
        java.lang.String str11 = student0.getNick();
        java.lang.String str12 = student0.getEmail();
        student0.setName("Course{id=null, name='Teacher{id=null, name= null }', code='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', idTeacher='10', initialTime='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', finalTime='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}'}");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str7, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=0, modality=null}" + "'", str11, "Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=0, modality=null}");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int7 = feedback6.getWorkload();
        java.lang.Integer int8 = feedback6.getCourseware();
        java.lang.Integer int9 = feedback6.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.String str2 = course0.toString();
        java.lang.String str3 = course0.getInitialTime();
        java.lang.Long long4 = course0.getIdTeacher();
        java.lang.String str5 = course0.getInitialTime();
        java.lang.String str6 = course0.getName();
        com.engSoft.DTO.CourseDTO courseDTO12 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Teacher{id=null, name= hi! }", "hi!", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str13 = courseDTO12.getCode();
        course0.update(courseDTO12, (java.lang.Long) 1L);
        java.lang.String str16 = course0.getFinalTime();
        java.lang.String str17 = course0.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str13, "Teacher{id=null, name= hi! }");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str16, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str17, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Long long2 = feedbackDTO0.getIdStudent();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedbackDTO0.getModality();
        java.lang.Long long5 = feedbackDTO0.getIdStudent();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(modalityEnum4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getInitialTime();
        course0.update(courseDTO16, (java.lang.Long) (-1L));
        java.lang.String str20 = course0.toString();
        java.lang.Long long21 = course0.getId();
        com.engSoft.DTO.CourseDTO courseDTO27 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Teacher{id=null, name= hi! }", "hi!", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        course0.update(courseDTO27, (java.lang.Long) 100L);
        java.lang.String str30 = courseDTO27.getName();
        java.lang.String str31 = courseDTO27.getInitialTime();
        java.lang.String str32 = courseDTO27.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str30, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str31, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str32, "Teacher{id=null, name= hi! }");
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Teacher{id=null, name= hi! }");
        student0.setId((java.lang.Long) 1L);
        java.lang.String str9 = student0.getName();
        student0.setName("Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }");
        student0.setDeletedComments(35);
        java.lang.String str14 = student0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str9, "Teacher{id=null, name= hi! }");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student{id=1, name='Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }', email='null', nick='hi!', isBanned=null, deletedComments=35}" + "'", str14, "Student{id=1, name='Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }', email='null', nick='hi!', isBanned=null, deletedComments=35}");
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        java.lang.Boolean boolean6 = student0.getBanned();
        java.lang.String str7 = student0.getEmail();
        java.lang.String str8 = student0.getName();
        java.lang.String str9 = student0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Integer int8 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback9 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int10 = feedbackDTO0.getWorkload();
        java.lang.Long long11 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback12 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int13 = feedback12.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        teacherDTO1.setName("Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setBanned((java.lang.Boolean) true);
        student0.setBanned((java.lang.Boolean) true);
        com.engSoft.DTO.StudentDTO studentDTO13 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=10, idStudent=1, workload=null, methodology=0, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean16 = student0.getBanned();
        student0.setId((java.lang.Long) 100L);
        student0.setDeletedComments((int) (short) 1);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + true + "'", boolean16, true);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Integer int3 = feedbackDTO0.getPlanning();
        java.lang.Integer int4 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        java.lang.String str11 = courseDTO7.getInitialTime();
        com.engSoft.entities.Course course13 = new com.engSoft.entities.Course(courseDTO7, (java.lang.Long) 1L);
        java.lang.Long long14 = course13.getId();
        java.lang.String str15 = course13.getInitialTime();
        java.lang.String str16 = course13.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str16, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setDeletedComments((int) '#');
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        teacher3.setName("Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str2, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setName("Teacher{id=null, name=  }");
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=PRESENTIAL}");
        java.lang.String str9 = student0.getNick();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=0, planning=1, evaluationSystem=null, courseware=null, modality=null}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        java.lang.String str3 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str3, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.Boolean boolean2 = student0.getBanned();
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        java.lang.String str5 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.Long long7 = student0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str3 = student0.getNick();
        java.lang.Long long4 = student0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 1L);
        int int6 = student0.getDeletedComments();
        student0.setDeletedComments((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("");
        java.lang.String str2 = teacher1.getName();
        teacher1.setName("Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=null, deletedComments=32} }");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getInitialTime();
        course0.update(courseDTO16, (java.lang.Long) (-1L));
        java.lang.String str20 = courseDTO16.getCode();
        java.lang.String str21 = courseDTO16.getCode();
        java.lang.String str22 = courseDTO16.getNameTeacher();
        java.lang.String str23 = courseDTO16.getInitialTime();
        com.engSoft.entities.Course course25 = new com.engSoft.entities.Course(courseDTO16, (java.lang.Long) 0L);
        com.engSoft.entities.Course course26 = new com.engSoft.entities.Course();
        java.lang.String str27 = course26.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO33 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str34 = courseDTO33.getCode();
        course26.update(courseDTO33, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO42 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str43 = courseDTO42.getInitialTime();
        course26.update(courseDTO42, (java.lang.Long) (-1L));
        java.lang.String str46 = course26.toString();
        java.lang.Long long47 = course26.getId();
        com.engSoft.DTO.CourseDTO courseDTO53 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Teacher{id=null, name= hi! }", "hi!", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        course26.update(courseDTO53, (java.lang.Long) 100L);
        java.lang.String str56 = courseDTO53.getName();
        java.lang.String str57 = courseDTO53.getNameTeacher();
        java.lang.String str58 = courseDTO53.getCode();
        course25.update(courseDTO53, (java.lang.Long) 10L);
        java.lang.String str61 = courseDTO53.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str22, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str46, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long47);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str56, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str58, "Teacher{id=null, name= hi! }");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str61, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}', isBanned=true, deletedComments=10}", "Teacher{id=null, name= Teacher{id=null, name=  } }");
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setNick("Teacher{id=null, name= Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null}', isBanned=false, deletedComments=0} }");
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.String str6 = courseDTO5.getNameTeacher();
        java.lang.String str7 = courseDTO5.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str7, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        java.lang.String str9 = student0.toString();
        java.lang.String str10 = student0.getEmail();
        int int11 = student0.getDeletedComments();
        java.lang.Long long12 = student0.getId();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedback6.getModality();
        java.lang.Integer int8 = feedback6.getPlanning();
        feedback6.setEvaluationSystem((java.lang.Integer) (-1));
        java.lang.Long long11 = feedback6.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Long long1 = feedback0.getIdStudent();
        feedback0.setIdCourse((java.lang.Long) 10L);
        java.lang.String str4 = feedback0.toString();
        feedback0.setEvaluationSystem((java.lang.Integer) 1);
        java.lang.Integer int7 = feedback0.getCourseware();
        feedback0.setPlanning((java.lang.Integer) 35);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Long long2 = feedbackDTO0.getIdStudent();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str3 = student0.getNick();
        java.lang.String str4 = student0.getNick();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        java.lang.Long long3 = feedback0.getId();
        java.lang.Integer int4 = feedback0.getCourseware();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setEvaluationSystem((java.lang.Integer) 1);
        feedback0.setCourseware((java.lang.Integer) 35);
        java.lang.Integer int11 = feedback0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        java.lang.String str7 = student0.getNick();
        java.lang.Long long8 = student0.getId();
        java.lang.String str9 = student0.getNick();
        student0.setBanned((java.lang.Boolean) false);
        student0.setDeletedComments(0);
        java.lang.String str14 = student0.getNick();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str9, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str14, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str7 = student0.getName();
        java.lang.Boolean boolean8 = student0.getBanned();
        student0.setDeletedComments((int) (short) -1);
        java.lang.String str11 = student0.getName();
        student0.setDeletedComments(35);
        int int14 = student0.getDeletedComments();
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getInitialTime();
        course0.update(courseDTO16, (java.lang.Long) (-1L));
        java.lang.String str20 = course0.toString();
        java.lang.Long long21 = course0.getId();
        com.engSoft.DTO.CourseDTO courseDTO27 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Teacher{id=null, name= hi! }", "hi!", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        course0.update(courseDTO27, (java.lang.Long) 100L);
        java.lang.Long long30 = course0.getId();
        com.engSoft.DTO.CourseDTO courseDTO36 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}", "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=100, modality=null}");
        java.lang.String str37 = courseDTO36.getCode();
        course0.update(courseDTO36, (java.lang.Long) 10L);
        java.lang.String str40 = course0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str37, "Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str40, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Long long1 = feedback0.getIdStudent();
        feedback0.setIdCourse((java.lang.Long) 100L);
        java.lang.Integer int4 = feedback0.getMethodology();
        java.lang.Long long5 = feedback0.getId();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getInitialTime();
        course0.update(courseDTO16, (java.lang.Long) (-1L));
        java.lang.String str20 = course0.toString();
        java.lang.Long long21 = course0.getId();
        com.engSoft.DTO.CourseDTO courseDTO27 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Teacher{id=null, name= hi! }", "hi!", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        course0.update(courseDTO27, (java.lang.Long) 100L);
        java.lang.String str30 = courseDTO27.getFinalTime();
        java.lang.String str31 = courseDTO27.getNameTeacher();
        java.lang.String str32 = courseDTO27.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str30, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str32, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=null, name='Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Teacher{id=null, name=  }");
        studentDTO2.setEmail("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        java.lang.String str5 = studentDTO2.getName();
        studentDTO2.setName("Teacher{id=null, name= Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0} }");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Integer int2 = feedback0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedback0.getModality();
        java.lang.String str4 = feedback0.toString();
        feedback0.setMethodology((java.lang.Integer) 1);
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedback0.getModality();
        java.lang.Integer int8 = feedback0.getCourseware();
        com.engSoft.entities.types.ModalityEnum modalityEnum9 = null;
        feedback0.setModality(modalityEnum9);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = courseDTO5.getFinalTime();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        com.engSoft.entities.Course course13 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        com.engSoft.entities.Course course14 = new com.engSoft.entities.Course();
        java.lang.String str15 = course14.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO21 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str22 = courseDTO21.getCode();
        course14.update(courseDTO21, (java.lang.Long) 1L);
        java.lang.String str25 = courseDTO21.getNameTeacher();
        java.lang.String str26 = courseDTO21.getNameTeacher();
        java.lang.String str27 = courseDTO21.getName();
        course13.update(courseDTO21, (java.lang.Long) (-1L));
        java.lang.String str30 = courseDTO21.getFinalTime();
        java.lang.String str31 = courseDTO21.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str25, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str26, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str27, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str30, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(0);
        student0.setDeletedComments(1);
        student0.setId((java.lang.Long) (-1L));
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int9 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback10 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback10.setIdCourse((java.lang.Long) 100L);
        feedback10.setWorkload((java.lang.Integer) 10);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        java.lang.String str11 = courseDTO7.getName();
        com.engSoft.entities.Course course13 = new com.engSoft.entities.Course(courseDTO7, (java.lang.Long) 100L);
        java.lang.String str14 = course13.getFinalTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        int int5 = student0.getDeletedComments();
        java.lang.Long long6 = student0.getId();
        java.lang.Boolean boolean7 = student0.getBanned();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        com.engSoft.DTO.StudentDTO studentDTO9 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO9.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}");
        studentDTO9.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=0, evaluationSystem=97, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        student0.setEmail("Teacher{id=null, name= hi! }");
        java.lang.String str11 = student0.toString();
        java.lang.String str12 = student0.getName();
        student0.setName("Student{id=-1, name='null', email='null', nick='Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=35}");
        int int15 = student0.getDeletedComments();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}" + "'", str11, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher3);
        java.lang.String str5 = teacherDTO4.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str3 = studentDTO2.getEmail();
        studentDTO2.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str6 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str3, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str6, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getInitialTime();
        com.engSoft.entities.Course course9 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        java.lang.String str10 = course9.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str7, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str10, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        student0.setNick("");
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str7 = studentDTO6.getEmail();
        java.lang.String str8 = studentDTO6.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.Long long2 = course0.getId();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str9 = courseDTO8.getCode();
        course0.update(courseDTO8, (java.lang.Long) 0L);
        java.lang.String str12 = courseDTO8.getName();
        com.engSoft.entities.Course course14 = new com.engSoft.entities.Course(courseDTO8, (java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name=  }");
        java.lang.Long long2 = teacher1.getId();
        teacher1.setName("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.Long long5 = teacher1.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO6 = new com.engSoft.DTO.TeacherDTO(teacher1);
        java.lang.Long long7 = teacher1.getId();
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str3 = teacher0.toString();
        java.lang.String str4 = teacher0.toString();
        java.lang.String str5 = teacher0.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO6 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str7 = teacherDTO6.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name= null }" + "'", str3, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= null }" + "'", str4, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.String str5 = student0.toString();
        java.lang.String str6 = student0.getNick();
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
        student0.setEmail("Teacher{id=null, name= Student{id=null, name='null', email='null', nick='', isBanned=null, deletedComments=0} }");
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}" + "'", str5, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Teacher{id=null, name= hi! }");
        java.lang.Long long7 = student0.getId();
        student0.setId((java.lang.Long) 0L);
        java.lang.String str10 = student0.getName();
        java.lang.String str11 = student0.getNick();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str10, "Teacher{id=null, name= hi! }");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}");
        java.lang.Long long11 = student0.getId();
        student0.setNick("Teacher{id=null, name= Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=100, modality=null} }");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Integer int4 = feedbackDTO0.getPlanning();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback6.setCourseware((java.lang.Integer) (-1));
        feedback6.setPlanning((java.lang.Integer) 35);
        feedback6.setIdStudent((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Teacher{id=null, name= hi! }");
        java.lang.Long long7 = student0.getId();
        java.lang.String str8 = student0.getName();
        java.lang.String str9 = student0.getName();
        student0.setDeletedComments(10);
        student0.setEmail("Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}");
        student0.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str8, "Teacher{id=null, name= hi! }");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str9, "Teacher{id=null, name= hi! }");
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        student0.setEmail("Teacher{id=null, name= hi! }");
        java.lang.String str11 = student0.toString();
        java.lang.String str12 = student0.getName();
        java.lang.String str13 = student0.getName();
        java.lang.Boolean boolean14 = student0.getBanned();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}" + "'", str11, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(boolean14);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setMethodology((java.lang.Integer) 1);
        java.lang.Integer int8 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) (-1L));
        feedback0.setPlanning((java.lang.Integer) 0);
        feedback0.setMethodology((java.lang.Integer) 97);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Boolean boolean5 = student0.getBanned();
        int int6 = student0.getDeletedComments();
        java.lang.Long long7 = student0.getId();
        student0.setEmail("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.String str10 = student0.getNick();
        java.lang.String str11 = student0.getName();
        student0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 1L);
        java.lang.String str9 = courseDTO5.getNameTeacher();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str12 = course11.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Integer int4 = feedbackDTO0.getPlanning();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name=  }");
        java.lang.String str2 = teacher1.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher1);
        teacher1.setName("Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=0}");
        java.lang.Long long6 = teacher1.getId();
        java.lang.Long long7 = teacher1.getId();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name=  } }" + "'", str2, "Teacher{id=null, name= Teacher{id=null, name=  } }");
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='null', email='Teacher{id=null, name=  }', nick='Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}", "Student{id=null, name='null', email='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', nick='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', isBanned=true, deletedComments=0}", "Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=null}", "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }", "Feedback{id=null, idCourse=null, idStudent=10, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getMethodology();
        java.lang.Integer int2 = feedbackDTO0.getCourseware();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        java.lang.String str7 = student0.getEmail();
        int int8 = student0.getDeletedComments();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str2 = teacherDTO1.getName();
        teacherDTO1.setName("Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
        teacherDTO1.setName("Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.Long long2 = course0.getId();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str9 = courseDTO8.getCode();
        course0.update(courseDTO8, (java.lang.Long) 0L);
        com.engSoft.entities.Course course13 = new com.engSoft.entities.Course(courseDTO8, (java.lang.Long) 0L);
        com.engSoft.DTO.CourseDTO courseDTO19 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str20 = courseDTO19.getName();
        java.lang.String str21 = courseDTO19.getInitialTime();
        com.engSoft.entities.Course course23 = new com.engSoft.entities.Course(courseDTO19, (java.lang.Long) 0L);
        course13.update(courseDTO19, (java.lang.Long) (-1L));
        java.lang.String str26 = courseDTO19.getCode();
        com.engSoft.entities.Course course28 = new com.engSoft.entities.Course(courseDTO19, (java.lang.Long) 1L);
        java.lang.Long long29 = course28.getId();
        java.lang.String str30 = course28.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str20, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(long29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str30, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0} }");
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher1);
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher1);
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher1);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10} }");
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher1);
        java.lang.String str3 = teacher1.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10} }" + "'", str3, "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10} }");
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        com.engSoft.entities.Course course9 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        java.lang.String str10 = courseDTO5.getCode();
        com.engSoft.entities.Course course12 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str13 = course12.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        java.lang.Boolean boolean2 = student0.getBanned();
        java.lang.String str3 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        java.lang.String str6 = student0.getEmail();
        java.lang.String str7 = student0.getNick();
        java.lang.Long long8 = student0.getId();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.String str11 = student0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getFinalTime();
        java.lang.String str5 = course0.getFinalTime();
        java.lang.String str6 = course0.getFinalTime();
        java.lang.String str7 = course0.getInitialTime();
        com.engSoft.DTO.CourseDTO courseDTO13 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=0, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }", "Student{id=100, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}", "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=0}");
        course0.update(courseDTO13, (java.lang.Long) 10L);
        com.engSoft.entities.Course course17 = new com.engSoft.entities.Course(courseDTO13, (java.lang.Long) (-1L));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 100);
        java.lang.Integer int8 = feedback0.getMethodology();
        feedback0.setCourseware((java.lang.Integer) 10);
        feedback0.setCourseware((java.lang.Integer) 0);
        feedback0.setIdCourse((java.lang.Long) 0L);
        java.lang.Long long15 = feedback0.getIdStudent();
        java.lang.Integer int16 = feedback0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(int16);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.Long long1 = course0.getId();
        java.lang.String str2 = course0.getCode();
        java.lang.String str3 = course0.getName();
        java.lang.String str4 = course0.getCode();
        java.lang.Long long5 = course0.getId();
        java.lang.String str6 = course0.getName();
        java.lang.String str7 = course0.getName();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
        java.lang.String str2 = teacher1.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher1);
        java.lang.Long long4 = teacher1.getId();
        java.lang.String str5 = teacher1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE} }");
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean9 = student0.getBanned();
        java.lang.Long long10 = student0.getId();
        java.lang.String str11 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO12 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str13 = student0.getEmail();
        java.lang.String str14 = student0.getName();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        java.lang.String str7 = student0.getNick();
        java.lang.Long long8 = student0.getId();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.String str13 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO14 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.Long long15 = student0.getId();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}" + "'", str13, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(long15);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int5 = feedback4.getCourseware();
        java.lang.Integer int6 = feedback4.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str2 = teacherDTO1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setEmail("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.String str7 = student0.getEmail();
        student0.setNick("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setBanned((java.lang.Boolean) true);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str14 = student0.getEmail();
        student0.setEmail("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str14, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        student0.setEmail("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        student0.setName("Teacher{id=null, name= Teacher{id=null, name=  } }");
        student0.setEmail("Student{id=null, name='hi!', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=true, deletedComments=0}");
        student0.setDeletedComments((int) (short) 0);
        java.lang.String str15 = student0.getEmail();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student{id=null, name='hi!', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=true, deletedComments=0}" + "'", str15, "Student{id=null, name='hi!', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        student0.setName("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = student0.getNick();
        java.lang.String str7 = student0.getNick();
        student0.setId((java.lang.Long) (-1L));
        java.lang.String str10 = student0.getNick();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        java.lang.Long long4 = feedback0.getIdStudent();
        java.lang.Integer int5 = feedback0.getWorkload();
        java.lang.Integer int6 = feedback0.getCourseware();
        java.lang.Integer int7 = feedback0.getWorkload();
        feedback0.setMethodology((java.lang.Integer) 35);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Long long1 = feedback0.getIdStudent();
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setCourseware((java.lang.Integer) (-1));
        feedback0.setWorkload((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass10 = feedback0.getClass();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setEmail("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.String str7 = student0.getEmail();
        student0.setNick("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setBanned((java.lang.Boolean) true);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean14 = student0.getBanned();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + false + "'", boolean14, false);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.Long long4 = student0.getId();
        student0.setDeletedComments(0);
        student0.setId((java.lang.Long) 0L);
        java.lang.String str9 = student0.getName();
        java.lang.String str10 = student0.toString();
        student0.setNick("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}");
        int int13 = student0.getDeletedComments();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str10, "Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        student0.setEmail("Teacher{id=null, name= hi! }");
        student0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}");
        student0.setEmail("Teacher{id=null, name= Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} } }");
        java.lang.String str15 = student0.getName();
        java.lang.String str16 = student0.getName();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}" + "'", str15, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}" + "'", str16, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setEvaluationSystem((java.lang.Integer) 100);
        java.lang.Integer int6 = feedback0.getPlanning();
        feedback0.setIdStudent((java.lang.Long) 100L);
        feedback0.setMethodology((java.lang.Integer) 10);
        com.engSoft.entities.Feedback feedback11 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum12 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback11.setModality(modalityEnum12);
        feedback0.setModality(modalityEnum12);
        feedback0.setMethodology((java.lang.Integer) 97);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + modalityEnum12 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum12.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=100, modality=null}", "Student{id=null, name='null', email='null', nick='Teacher{id=null, name=  }', isBanned=true, deletedComments=0}");
        studentDTO2.setEmail("Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=10, evaluationSystem=1, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        java.lang.String str4 = student0.getNick();
        student0.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setId((java.lang.Long) (-1L));
        student0.setNick("Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setId((java.lang.Long) 100L);
        java.lang.Boolean boolean7 = student0.getBanned();
        java.lang.String str8 = student0.getNick();
        student0.setBanned((java.lang.Boolean) false);
        com.engSoft.DTO.StudentDTO studentDTO11 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO11.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=null, deletedComments=35}");
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback8 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int9 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getName();
        java.lang.String str9 = courseDTO7.getInitialTime();
        java.lang.String str10 = courseDTO7.getCode();
        java.lang.String str11 = courseDTO7.getFinalTime();
        java.lang.String str12 = courseDTO7.getInitialTime();
        course0.update(courseDTO7, (java.lang.Long) 10L);
        java.lang.String str15 = courseDTO7.getFinalTime();
        java.lang.String str16 = courseDTO7.getName();
        java.lang.String str17 = courseDTO7.getInitialTime();
        java.lang.String str18 = courseDTO7.getNameTeacher();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str16, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str18, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedback5.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=10, methodology=null, planning=0, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null}', isBanned=false, deletedComments=0} }", "", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE} }", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=null}");
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getPlanning();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getInitialTime();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "", "hi!", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Teacher{id=null, name= null }");
        java.lang.String str9 = courseDTO8.getName();
        course0.update(courseDTO8, (java.lang.Long) (-1L));
        java.lang.String str12 = course0.getName();
        com.engSoft.entities.Course course13 = new com.engSoft.entities.Course();
        java.lang.String str14 = course13.getFinalTime();
        java.lang.String str15 = course13.toString();
        java.lang.String str16 = course13.getInitialTime();
        java.lang.Long long17 = course13.getIdTeacher();
        com.engSoft.DTO.CourseDTO courseDTO23 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str24 = courseDTO23.getName();
        java.lang.String str25 = courseDTO23.getInitialTime();
        java.lang.String str26 = courseDTO23.getCode();
        java.lang.String str27 = courseDTO23.getName();
        course13.update(courseDTO23, (java.lang.Long) 0L);
        course0.update(courseDTO23, (java.lang.Long) 100L);
        java.lang.String str32 = courseDTO23.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str9, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str12, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str15, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(long17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str24, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str27, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str32, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedback0.getModality();
        java.lang.Long long3 = feedback0.getIdCourse();
        java.lang.Integer int4 = feedback0.getWorkload();
        feedback0.setCourseware((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str3 = student0.getEmail();
        java.lang.Boolean boolean4 = student0.getBanned();
        java.lang.String str5 = student0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str5, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=10, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=false, deletedComments=0}", "Teacher{id=null, name= hi! }");
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getMethodology();
        java.lang.Integer int2 = feedbackDTO0.getCourseware();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int9 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int10 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Long long5 = feedbackDTO0.getIdStudent();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getName();
        java.lang.String str11 = courseDTO5.getName();
        java.lang.String str12 = courseDTO5.getInitialTime();
        java.lang.String str13 = courseDTO5.getNameTeacher();
        java.lang.String str14 = courseDTO5.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=REMOTE}");
        java.lang.String str2 = teacher1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=REMOTE}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=REMOTE}");
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.String str4 = student0.toString();
        java.lang.String str5 = student0.toString();
        student0.setEmail("Teacher{id=null, name= hi! }");
        java.lang.Boolean boolean8 = student0.getBanned();
        student0.setBanned((java.lang.Boolean) true);
        student0.setEmail("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str4, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str5, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.toString();
        java.lang.String str5 = course0.getFinalTime();
        java.lang.String str6 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO12 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}", "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
        course0.update(courseDTO12, (java.lang.Long) (-1L));
        com.engSoft.entities.Course course15 = new com.engSoft.entities.Course();
        java.lang.String str16 = course15.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO22 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str23 = courseDTO22.getCode();
        course15.update(courseDTO22, (java.lang.Long) 1L);
        java.lang.String str26 = courseDTO22.getNameTeacher();
        java.lang.String str27 = courseDTO22.getNameTeacher();
        java.lang.String str28 = courseDTO22.getName();
        course0.update(courseDTO22, (java.lang.Long) 10L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str4, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str26, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str27, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str28, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getName();
        com.engSoft.entities.Course course12 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str13 = courseDTO5.getInitialTime();
        com.engSoft.entities.Course course15 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str16 = courseDTO5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str16, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setCourseware((java.lang.Integer) 1);
        feedback0.setEvaluationSystem((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str7 = student0.toString();
        java.lang.String str8 = student0.getEmail();
        student0.setDeletedComments((int) (short) 100);
        student0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=0, modality=null}");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str7, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.String str7 = feedback6.toString();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(modalityEnum4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str5 = teacher4.toString();
        teacher4.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        com.engSoft.DTO.TeacherDTO teacherDTO8 = new com.engSoft.DTO.TeacherDTO(teacher4);
        com.engSoft.DTO.TeacherDTO teacherDTO9 = new com.engSoft.DTO.TeacherDTO(teacher4);
        com.engSoft.entities.Teacher teacher10 = new com.engSoft.entities.Teacher(teacherDTO9);
        java.lang.String str11 = teacherDTO9.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str11, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long9 = feedbackDTO0.getIdStudent();
        java.lang.Integer int10 = feedbackDTO0.getCourseware();
        java.lang.Class<?> wildcardClass11 = feedbackDTO0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.getName();
        teacher0.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str4 = teacher0.toString();
        java.lang.String str5 = teacher0.toString();
        java.lang.String str6 = teacher0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }" + "'", str4, "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }" + "'", str5, "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }" + "'", str6, "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getFinalTime();
        java.lang.String str8 = courseDTO5.getNameTeacher();
        java.lang.String str9 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum6 = feedbackDTO0.getModality();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.String str5 = student0.toString();
        student0.setDeletedComments((int) (short) -1);
        student0.setEmail("Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }");
        java.lang.String str10 = student0.getEmail();
        com.engSoft.DTO.StudentDTO studentDTO11 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}" + "'", str5, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }" + "'", str10, "Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }");
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0} }");
        java.lang.String str2 = teacher1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0} }" + "'", str2, "Teacher{id=null, name= Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0} }");
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(0);
        student0.setEmail("Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}");
        student0.setDeletedComments((int) (byte) 100);
        int int13 = student0.getDeletedComments();
        student0.setDeletedComments((int) '#');
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        java.lang.Integer int2 = feedback0.getPlanning();
        java.lang.String str3 = feedback0.toString();
        java.lang.Integer int4 = feedback0.getCourseware();
        feedback0.setEvaluationSystem((java.lang.Integer) 1);
        feedback0.setCourseware((java.lang.Integer) 0);
        java.lang.Integer int9 = feedback0.getWorkload();
        feedback0.setIdStudent((java.lang.Long) 0L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.String str3 = studentDTO2.getEmail();
        studentDTO2.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student6 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str3, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("");
        teacher1.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str4 = teacher1.toString();
        java.lang.Long long5 = teacher1.getId();
        teacher1.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=-1, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }" + "'", str4, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }");
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        java.lang.Long long11 = course0.getId();
        java.lang.String str12 = course0.getName();
        com.engSoft.DTO.CourseDTO courseDTO18 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str19 = courseDTO18.getName();
        java.lang.String str20 = courseDTO18.getInitialTime();
        java.lang.String str21 = courseDTO18.getCode();
        course0.update(courseDTO18, (java.lang.Long) 0L);
        java.lang.String str24 = course0.toString();
        java.lang.Long long25 = course0.getId();
        java.lang.Long long26 = course0.getId();
        java.lang.String str27 = course0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str19, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str24, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNull(long26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str27, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback7.setPlanning((java.lang.Integer) 1);
        feedback7.setCourseware((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum12 = feedback7.getModality();
        feedback7.setWorkload((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(modalityEnum12);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacher0.getName();
        java.lang.Long long5 = teacher0.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO6 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacherDTO6.setName("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Teacher{id=null, name= null }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str3 = studentDTO2.getEmail();
        studentDTO2.setName("Student{id=null, name='hi!', email='null', nick='Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}', isBanned=true, deletedComments=-1}");
        java.lang.String str6 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str3, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str6, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getPlanning();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback7.setPlanning((java.lang.Integer) 10);
        java.lang.Integer int10 = feedback7.getMethodology();
        feedback7.setIdStudent((java.lang.Long) 1L);
        feedback7.setEvaluationSystem((java.lang.Integer) 10);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=100, planning=10, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO2);
        teacher3.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        java.lang.String str6 = teacher3.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher3);
        teacherDTO7.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}");
        com.engSoft.entities.Teacher teacher10 = new com.engSoft.entities.Teacher(teacherDTO7);
        java.lang.String str11 = teacherDTO7.getName();
        com.engSoft.entities.Teacher teacher12 = new com.engSoft.entities.Teacher(teacherDTO7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }" + "'", str6, "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}" + "'", str11, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Long long2 = feedback0.getId();
        feedback0.setCourseware((java.lang.Integer) 1);
        feedback0.setWorkload((java.lang.Integer) (-1));
        java.lang.Integer int7 = feedback0.getPlanning();
        com.engSoft.DTO.FeedbackDTO feedbackDTO8 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int9 = feedbackDTO8.getWorkload();
        java.lang.Integer int10 = feedbackDTO8.getMethodology();
        com.engSoft.entities.Feedback feedback11 = new com.engSoft.entities.Feedback(feedbackDTO8);
        java.lang.Integer int12 = feedback11.getCourseware();
        feedback11.setMethodology((java.lang.Integer) 100);
        java.lang.Integer int15 = feedback11.getPlanning();
        java.lang.Integer int16 = feedback11.getEvaluationSystem();
        com.engSoft.entities.Feedback feedback17 = new com.engSoft.entities.Feedback();
        java.lang.Integer int18 = feedback17.getEvaluationSystem();
        feedback17.setIdCourse((java.lang.Long) 1L);
        feedback17.setIdCourse((java.lang.Long) 10L);
        feedback17.setEvaluationSystem((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum25 = feedback17.getModality();
        feedback17.setMethodology((java.lang.Integer) 100);
        com.engSoft.entities.Feedback feedback28 = new com.engSoft.entities.Feedback();
        java.lang.Integer int29 = feedback28.getEvaluationSystem();
        java.lang.String str30 = feedback28.toString();
        java.lang.Long long31 = feedback28.getId();
        com.engSoft.entities.Feedback feedback32 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum33 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback32.setModality(modalityEnum33);
        feedback28.setModality(modalityEnum33);
        feedback17.setModality(modalityEnum33);
        feedback11.setModality(modalityEnum33);
        feedback0.setModality(modalityEnum33);
        java.lang.Integer int39 = feedback0.getEvaluationSystem();
        feedback0.setPlanning((java.lang.Integer) 35);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(modalityEnum25);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str30, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertTrue("'" + modalityEnum33 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum33.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(int39);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("", "Teacher{id=null, name= Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Teacher{id=null, name= Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0} }", "Student{id=0, name='null', email='null', nick='null', isBanned=false, deletedComments=0}", "Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str6 = courseDTO5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Integer int3 = feedbackDTO0.getPlanning();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int8 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=PRESENTIAL}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=10}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=0, evaluationSystem=97, courseware=null, modality=REMOTE}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }");
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long4 = teacher0.getId();
        java.lang.String str5 = teacher0.toString();
        teacher0.setName("");
        com.engSoft.DTO.TeacherDTO teacherDTO8 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.entities.Teacher teacher9 = new com.engSoft.entities.Teacher(teacherDTO8);
        java.lang.Long long10 = teacher9.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO11 = new com.engSoft.DTO.TeacherDTO(teacher9);
        java.lang.String str12 = teacherDTO11.getName();
        com.engSoft.entities.Teacher teacher13 = new com.engSoft.entities.Teacher(teacherDTO11);
        java.lang.Long long14 = teacher13.getId();
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}");
        java.lang.String str11 = student0.getEmail();
        student0.setId((java.lang.Long) 0L);
        student0.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}" + "'", str11, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}");
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setId((java.lang.Long) 100L);
        java.lang.Boolean boolean7 = student0.getBanned();
        student0.setId((java.lang.Long) 10L);
        student0.setId((java.lang.Long) 0L);
        student0.setBanned((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Teacher{id=null, name=  }", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name=  }" + "'", str7, "Teacher{id=null, name=  }");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getInitialTime();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "", "hi!", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Teacher{id=null, name= null }");
        java.lang.String str9 = courseDTO8.getName();
        course0.update(courseDTO8, (java.lang.Long) (-1L));
        java.lang.String str12 = course0.toString();
        java.lang.Long long13 = course0.getId();
        java.lang.String str14 = course0.getInitialTime();
        com.engSoft.DTO.CourseDTO courseDTO20 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=10}");
        course0.update(courseDTO20, (java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str9, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}" + "'", str12, "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str14, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getPlanning();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        teacherDTO1.setName("");
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.Long long6 = teacher5.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        java.lang.Long long11 = course0.getId();
        java.lang.String str12 = course0.getName();
        java.lang.String str13 = course0.getCode();
        com.engSoft.DTO.CourseDTO courseDTO19 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str20 = courseDTO19.getCode();
        com.engSoft.entities.Course course22 = new com.engSoft.entities.Course(courseDTO19, (java.lang.Long) 10L);
        course0.update(courseDTO19, (java.lang.Long) 1L);
        java.lang.String str25 = courseDTO19.getInitialTime();
        java.lang.String str26 = courseDTO19.getCode();
        java.lang.String str27 = courseDTO19.getCode();
        java.lang.String str28 = courseDTO19.getNameTeacher();
        java.lang.String str29 = courseDTO19.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str28, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}");
        java.lang.String str2 = teacher1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}" + "'", str2, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}");
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("");
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher1);
        teacherDTO2.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str5 = teacherDTO2.getName();
        com.engSoft.entities.Teacher teacher6 = new com.engSoft.entities.Teacher(teacherDTO2);
        java.lang.String str7 = teacher6.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }" + "'", str7, "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }");
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setDeletedComments(10);
        java.lang.String str6 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        student0.setDeletedComments(0);
        student0.setName("Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        java.lang.String str14 = student0.getEmail();
        student0.setNick("Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str6, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = courseDTO5.getFinalTime();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        com.engSoft.entities.Course course13 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        java.lang.String str14 = course13.getFinalTime();
        java.lang.String str15 = course13.getCode();
        java.lang.String str16 = course13.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.String str4 = student0.toString();
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.toString();
        java.lang.String str7 = student0.getEmail();
        java.lang.String str8 = student0.toString();
        student0.setNick("Student{id=null, name='null', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str4, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str6, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str8, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        student0.setEmail("Teacher{id=null, name= hi! }");
        java.lang.String str11 = student0.toString();
        java.lang.Boolean boolean12 = student0.getBanned();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}" + "'", str11, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long4 = teacher0.getId();
        java.lang.String str5 = teacher0.toString();
        teacher0.setName("");
        com.engSoft.DTO.TeacherDTO teacherDTO8 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str9 = teacherDTO8.getName();
        com.engSoft.entities.Teacher teacher10 = new com.engSoft.entities.Teacher(teacherDTO8);
        teacherDTO8.setName("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }");
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=-1, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35} }");
        java.lang.String str2 = customErrorType1.getErrorMessage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35} }" + "'", str2, "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35} }");
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str3 = studentDTO2.getEmail();
        studentDTO2.setName("Student{id=1, name='Teacher{id=null, name= hi! }', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str3, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long9 = feedbackDTO0.getIdStudent();
        java.lang.Long long10 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        java.lang.Integer int2 = feedback0.getPlanning();
        java.lang.String str3 = feedback0.toString();
        java.lang.Integer int4 = feedback0.getCourseware();
        java.lang.Integer int5 = feedback0.getMethodology();
        java.lang.Integer int6 = feedback0.getEvaluationSystem();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedback0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getName();
        com.engSoft.entities.Course course12 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        com.engSoft.entities.Course course14 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 1L);
        java.lang.String str15 = courseDTO5.getFinalTime();
        java.lang.String str16 = courseDTO5.getNameTeacher();
        com.engSoft.entities.Course course18 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        java.lang.String str19 = course18.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str16, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Integer int4 = feedbackDTO0.getWorkload();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        java.lang.Integer int8 = feedbackDTO0.getCourseware();
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        java.lang.Long long10 = feedbackDTO0.getIdStudent();
        java.lang.Integer int11 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}", "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student3 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        java.lang.Long long6 = feedback0.getId();
        feedback0.setEvaluationSystem((java.lang.Integer) 10);
        java.lang.Long long9 = feedback0.getId();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getMethodology();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setMethodology((java.lang.Integer) 1);
        java.lang.Integer int8 = feedback0.getWorkload();
        java.lang.Long long9 = feedback0.getId();
        java.lang.Integer int10 = feedback0.getEvaluationSystem();
        feedback0.setCourseware((java.lang.Integer) 100);
        java.lang.String str13 = feedback0.toString();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=100, modality=null}" + "'", str13, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=100, modality=null}");
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Teacher{id=null, name=  }", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        java.lang.String str3 = studentDTO2.getEmail();
        studentDTO2.setName("Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=null}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str3, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setMethodology((java.lang.Integer) 1);
        feedback0.setIdCourse((java.lang.Long) 1L);
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        studentDTO2.setName("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        studentDTO2.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        studentDTO2.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getPlanning();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int8 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        java.lang.Long long9 = feedbackDTO0.getIdStudent();
        java.lang.Integer int10 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Long long5 = feedbackDTO0.getIdStudent();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback8 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback8.setIdStudent((java.lang.Long) 1L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        java.lang.Long long3 = feedback0.getId();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback4.setModality(modalityEnum5);
        feedback0.setModality(modalityEnum5);
        java.lang.Integer int8 = feedback0.getMethodology();
        feedback0.setWorkload((java.lang.Integer) 1);
        feedback0.setIdStudent((java.lang.Long) 10L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertTrue("'" + modalityEnum5 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum5.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name=  }");
        java.lang.Long long2 = teacher1.getId();
        teacher1.setName("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.Long long5 = teacher1.getId();
        java.lang.String str6 = teacher1.getName();
        java.lang.String str7 = teacher1.getName();
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str6, "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str7, "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getInitialTime();
        course0.update(courseDTO16, (java.lang.Long) (-1L));
        java.lang.String str20 = course0.toString();
        java.lang.String str21 = course0.getFinalTime();
        java.lang.String str22 = course0.getCode();
        java.lang.String str23 = course0.getFinalTime();
        java.lang.String str24 = course0.getCode();
        com.engSoft.entities.Course course25 = new com.engSoft.entities.Course();
        java.lang.String str26 = course25.getInitialTime();
        com.engSoft.entities.Course course27 = new com.engSoft.entities.Course();
        java.lang.String str28 = course27.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO34 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str35 = courseDTO34.getCode();
        course27.update(courseDTO34, (java.lang.Long) 1L);
        java.lang.Long long38 = course27.getId();
        java.lang.String str39 = course27.getName();
        java.lang.String str40 = course27.getCode();
        com.engSoft.entities.Course course41 = new com.engSoft.entities.Course();
        java.lang.String str42 = course41.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO48 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str49 = courseDTO48.getName();
        java.lang.String str50 = courseDTO48.getInitialTime();
        java.lang.String str51 = courseDTO48.getCode();
        java.lang.String str52 = courseDTO48.getFinalTime();
        java.lang.String str53 = courseDTO48.getInitialTime();
        course41.update(courseDTO48, (java.lang.Long) 10L);
        java.lang.String str56 = courseDTO48.getFinalTime();
        course27.update(courseDTO48, (java.lang.Long) 10L);
        course25.update(courseDTO48, (java.lang.Long) (-1L));
        com.engSoft.entities.Course course61 = new com.engSoft.entities.Course();
        java.lang.String str62 = course61.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO68 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str69 = courseDTO68.getCode();
        course61.update(courseDTO68, (java.lang.Long) 1L);
        java.lang.Long long72 = course61.getId();
        java.lang.String str73 = course61.getName();
        com.engSoft.DTO.CourseDTO courseDTO79 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str80 = courseDTO79.getName();
        java.lang.String str81 = courseDTO79.getInitialTime();
        java.lang.String str82 = courseDTO79.getCode();
        course61.update(courseDTO79, (java.lang.Long) 0L);
        course25.update(courseDTO79, (java.lang.Long) (-1L));
        course0.update(courseDTO79, (java.lang.Long) 0L);
        java.lang.String str89 = courseDTO79.getNameTeacher();
        java.lang.String str90 = courseDTO79.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str23, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(long38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str39, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str49, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str52, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str56, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNull(long72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str73, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str80, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str89, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str90, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        int int2 = student0.getDeletedComments();
        java.lang.Boolean boolean3 = student0.getBanned();
        student0.setName("Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
        java.lang.String str6 = student0.getEmail();
        student0.setId((java.lang.Long) 10L);
        student0.setEmail("Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("hi!");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str3 = teacher2.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher2);
        com.engSoft.DTO.TeacherDTO teacherDTO5 = new com.engSoft.DTO.TeacherDTO(teacher2);
        java.lang.String str6 = teacher2.toString();
        java.lang.String str7 = teacher2.getName();
        java.lang.Long long8 = teacher2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str6, "Teacher{id=null, name= hi! }");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.Long long9 = course8.getId();
        java.lang.String str10 = course8.getInitialTime();
        java.lang.String str11 = course8.getName();
        java.lang.String str12 = course8.toString();
        java.lang.String str13 = course8.getFinalTime();
        com.engSoft.entities.Course course14 = new com.engSoft.entities.Course();
        java.lang.String str15 = course14.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO21 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str22 = courseDTO21.getCode();
        course14.update(courseDTO21, (java.lang.Long) 1L);
        java.lang.Long long25 = course14.getId();
        java.lang.String str26 = course14.getName();
        java.lang.String str27 = course14.getCode();
        com.engSoft.DTO.CourseDTO courseDTO33 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str34 = courseDTO33.getCode();
        com.engSoft.entities.Course course36 = new com.engSoft.entities.Course(courseDTO33, (java.lang.Long) 10L);
        course14.update(courseDTO33, (java.lang.Long) 1L);
        java.lang.String str39 = courseDTO33.getFinalTime();
        java.lang.String str40 = courseDTO33.getInitialTime();
        course8.update(courseDTO33, (java.lang.Long) 10L);
        java.lang.String str43 = course8.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str12, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str26, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str39, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str43, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setEvaluationSystem((java.lang.Integer) (-1));
        java.lang.Integer int4 = feedback0.getMethodology();
        feedback0.setMethodology((java.lang.Integer) 0);
        feedback0.setPlanning((java.lang.Integer) 100);
        feedback0.setCourseware((java.lang.Integer) 10);
        java.lang.Long long11 = feedback0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getFinalTime();
        java.lang.Class<?> wildcardClass8 = courseDTO5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        com.engSoft.entities.types.ModalityEnum modalityEnum6 = feedbackDTO0.getModality();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setName("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        student0.setName("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.String str11 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO12 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO12.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=0, modality=null}");
        java.lang.String str15 = studentDTO12.getEmail();
        java.lang.String str16 = studentDTO12.getEmail();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str11, "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=0, modality=null}" + "'", str15, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=0, modality=null}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=0, modality=null}" + "'", str16, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=0, modality=null}");
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedback6.getModality();
        java.lang.Integer int8 = feedback6.getPlanning();
        java.lang.Integer int9 = feedback6.getPlanning();
        java.lang.Integer int10 = feedback6.getPlanning();
        java.lang.Long long11 = feedback6.getIdCourse();
        java.lang.Long long12 = feedback6.getIdCourse();
        java.lang.String str13 = feedback6.toString();
        feedback6.setIdCourse((java.lang.Long) 10L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=1, planning=null, evaluationSystem=10, courseware=1, modality=REMOTE}");
        java.lang.String str2 = customErrorType1.getErrorMessage();
        java.lang.String str3 = customErrorType1.getErrorMessage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=1, planning=null, evaluationSystem=10, courseware=1, modality=REMOTE}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=1, planning=null, evaluationSystem=10, courseware=1, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=1, planning=null, evaluationSystem=10, courseware=1, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=1, planning=null, evaluationSystem=10, courseware=1, modality=REMOTE}");
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setCourseware((java.lang.Integer) 1);
        java.lang.Integer int4 = feedback0.getWorkload();
        java.lang.String str5 = feedback0.toString();
        java.lang.Long long6 = feedback0.getIdStudent();
        java.lang.Long long7 = feedback0.getIdStudent();
        feedback0.setCourseware((java.lang.Integer) 100);
        java.lang.Integer int10 = feedback0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        java.lang.Boolean boolean6 = student0.getBanned();
        java.lang.String str7 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.Boolean boolean9 = student0.getBanned();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str7, "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        java.lang.String str7 = student0.getNick();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        com.engSoft.DTO.StudentDTO studentDTO10 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setNick("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=0, planning=1, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Boolean boolean13 = student0.getBanned();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.DTO.TeacherDTO teacherDTO5 = new com.engSoft.DTO.TeacherDTO(teacher4);
        teacherDTO5.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}");
        teacherDTO5.setName("Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=-1, planning=null, evaluationSystem=1, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        studentDTO2.setEmail("Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}', idTeacher='100', initialTime='Teacher{id=null, name= hi! }', finalTime='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}'}");
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getInitialTime();
        course0.update(courseDTO16, (java.lang.Long) (-1L));
        java.lang.Long long20 = course0.getId();
        java.lang.String str21 = course0.toString();
        java.lang.String str22 = course0.getFinalTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(long20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str21, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str22, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Teacher{id=null, name= null }", "hi!");
        java.lang.String str3 = studentDTO2.getEmail();
        studentDTO2.setName("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        studentDTO2.setName("Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=1, planning=null, evaluationSystem=10, courseware=1, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        java.lang.String str5 = student0.toString();
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO8.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=-1, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}", "Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=-1, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=-1, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str7 = student0.getName();
        java.lang.Boolean boolean8 = student0.getBanned();
        student0.setDeletedComments((int) (short) -1);
        java.lang.String str11 = student0.getName();
        java.lang.String str12 = student0.getNick();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=0, modality=null}", "Student{id=1, name='null', email='null', nick='null', isBanned=true, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=null, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str3 = student0.getEmail();
        student0.setBanned((java.lang.Boolean) false);
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO6.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
        java.lang.String str9 = studentDTO6.getName();
        java.lang.String str10 = studentDTO6.getEmail();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        teacherDTO1.setName("Teacher{id=null, name= null }");
        teacherDTO1.setName("Teacher{id=null, name= Teacher{id=null, name= Teacher{id=null, name= null } } }");
        java.lang.String str6 = teacherDTO1.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name= Teacher{id=null, name= null } } }" + "'", str6, "Teacher{id=null, name= Teacher{id=null, name= Teacher{id=null, name= null } } }");
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Long long2 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback3.setEvaluationSystem((java.lang.Integer) 0);
        feedback3.setIdStudent((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacherDTO3.setName("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = teacherDTO3.getName();
        com.engSoft.entities.Teacher teacher7 = new com.engSoft.entities.Teacher(teacherDTO3);
        com.engSoft.entities.Teacher teacher8 = new com.engSoft.entities.Teacher(teacherDTO3);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Teacher{id=null, name=  }", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getNameTeacher();
        java.lang.String str8 = courseDTO5.getFinalTime();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getNameTeacher();
        java.lang.String str11 = courseDTO5.getFinalTime();
        java.lang.String str12 = courseDTO5.getCode();
        java.lang.String str13 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str7, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str10, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str13, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
        java.lang.String str2 = teacherDTO1.getName();
        java.lang.String str3 = teacherDTO1.getName();
        teacherDTO1.setName("Student{id=null, name='Teacher{id=null, name= hi! }', email='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}', nick='hi!', isBanned=true, deletedComments=0}");
        com.engSoft.entities.Teacher teacher6 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str3 = studentDTO2.getEmail();
        java.lang.String str4 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str3, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str4, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("");
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher1);
        java.lang.String str3 = teacher1.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        int int9 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 1L);
        com.engSoft.DTO.StudentDTO studentDTO12 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO12.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=100, planning=10, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 100);
        java.lang.Integer int8 = feedback0.getMethodology();
        feedback0.setMethodology((java.lang.Integer) (-1));
        com.engSoft.entities.Feedback feedback11 = new com.engSoft.entities.Feedback();
        java.lang.Integer int12 = feedback11.getEvaluationSystem();
        feedback11.setIdCourse((java.lang.Long) 1L);
        feedback11.setEvaluationSystem((java.lang.Integer) 100);
        java.lang.Integer int17 = feedback11.getPlanning();
        feedback11.setIdStudent((java.lang.Long) 100L);
        feedback11.setMethodology((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum22 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback11.setModality(modalityEnum22);
        feedback0.setModality(modalityEnum22);
        feedback0.setEvaluationSystem((java.lang.Integer) 0);
        feedback0.setMethodology((java.lang.Integer) 35);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertTrue("'" + modalityEnum22 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum22.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback6.setIdStudent((java.lang.Long) 0L);
        com.engSoft.entities.types.ModalityEnum modalityEnum9 = feedback6.getModality();
        java.lang.Long long10 = feedback6.getId();
        feedback6.setWorkload((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(modalityEnum9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='Teacher{id=null, name=  }', email='null', nick='null', isBanned=true, deletedComments=10}", "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=0, planning=1, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("");
        java.lang.String str2 = teacher1.getName();
        teacher1.setName("");
        com.engSoft.DTO.TeacherDTO teacherDTO5 = new com.engSoft.DTO.TeacherDTO(teacher1);
        java.lang.String str6 = teacher1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name=  }" + "'", str6, "Teacher{id=null, name=  }");
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.Long long2 = course0.getId();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str9 = courseDTO8.getCode();
        course0.update(courseDTO8, (java.lang.Long) 0L);
        java.lang.String str12 = courseDTO8.getCode();
        com.engSoft.entities.Course course14 = new com.engSoft.entities.Course(courseDTO8, (java.lang.Long) 0L);
        java.lang.Long long15 = course14.getId();
        java.lang.String str16 = course14.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str16, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='null', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=true, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=100, planning=10, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str3 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=100, planning=10, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=100, planning=10, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=-1, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=1, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=REMOTE}");
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setId((java.lang.Long) (-1L));
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str8 = student0.toString();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=-1, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str8, "Student{id=-1, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.toString();
        java.lang.String str2 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO3 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments((int) (short) 1);
        student0.setId((java.lang.Long) (-1L));
        student0.setNick("Student{id=null, name='hi!', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str1, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setName("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        student0.setName("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.String str11 = student0.toString();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean14 = student0.getBanned();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str11, "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + false + "'", boolean14, false);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Boolean boolean5 = student0.getBanned();
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = student0.getEmail();
        student0.setEmail("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=PRESENTIAL}");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback6.setEvaluationSystem((java.lang.Integer) 0);
        java.lang.Integer int9 = feedback6.getWorkload();
        java.lang.String str10 = feedback6.toString();
        com.engSoft.entities.types.ModalityEnum modalityEnum11 = feedback6.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=null}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=null}");
        org.junit.Assert.assertNull(modalityEnum11);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.String str4 = student0.toString();
        java.lang.String str5 = student0.toString();
        student0.setEmail("Teacher{id=null, name= hi! }");
        java.lang.Long long8 = student0.getId();
        student0.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str4, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str5, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str6 = teacher5.toString();
        java.lang.String str7 = teacher5.getName();
        java.lang.Long long8 = teacher5.getId();
        java.lang.String str9 = teacher5.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= null }" + "'", str6, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setCourseware((java.lang.Integer) 1);
        java.lang.Integer int4 = feedback0.getWorkload();
        java.lang.String str5 = feedback0.toString();
        feedback0.setPlanning((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        java.lang.Integer int3 = feedback0.getCourseware();
        feedback0.setIdStudent((java.lang.Long) 1L);
        feedback0.setEvaluationSystem((java.lang.Integer) 1);
        feedback0.setEvaluationSystem((java.lang.Integer) 10);
        feedback0.setWorkload((java.lang.Integer) 1);
        java.lang.String str12 = feedback0.toString();
        java.lang.Long long13 = feedback0.getId();
        feedback0.setIdStudent((java.lang.Long) 10L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long13);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        java.lang.String str7 = student0.getNick();
        java.lang.Long long8 = student0.getId();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.String str13 = student0.toString();
        java.lang.String str14 = student0.getEmail();
        student0.setId((java.lang.Long) 0L);
        student0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}" + "'", str13, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        java.lang.Long long6 = feedback0.getId();
        feedback0.setPlanning((java.lang.Integer) 10);
        feedback0.setMethodology((java.lang.Integer) (-1));
        feedback0.setPlanning((java.lang.Integer) 97);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setId((java.lang.Long) 100L);
        student0.setName("Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str7 = student0.getName();
        java.lang.Boolean boolean8 = student0.getBanned();
        java.lang.Long long9 = student0.getId();
        student0.setEmail("Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        student0.setBanned((java.lang.Boolean) false);
        student0.setBanned((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback8 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int9 = feedbackDTO0.getCourseware();
        java.lang.Class<?> wildcardClass10 = feedbackDTO0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        java.lang.String str4 = student0.getNick();
        int int5 = student0.getDeletedComments();
        student0.setDeletedComments((int) '#');
        int int8 = student0.getDeletedComments();
        java.lang.String str9 = student0.getNick();
        java.lang.String str10 = student0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long4 = teacher0.getId();
        java.lang.String str5 = teacher0.toString();
        teacher0.setName("");
        com.engSoft.DTO.TeacherDTO teacherDTO8 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.entities.Teacher teacher9 = new com.engSoft.entities.Teacher(teacherDTO8);
        java.lang.String str10 = teacher9.getName();
        java.lang.String str11 = teacher9.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO12 = new com.engSoft.DTO.TeacherDTO(teacher9);
        teacher9.setName("Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=10, evaluationSystem=1, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        student0.setName("");
        java.lang.Boolean boolean7 = student0.getBanned();
        java.lang.String str8 = student0.toString();
        java.lang.String str9 = student0.getNick();
        student0.setName("Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        com.engSoft.DTO.StudentDTO studentDTO12 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO12.setName("Student{id=null, name='Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str15 = studentDTO12.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str8, "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedback6.getModality();
        java.lang.Integer int8 = feedback6.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int9 = feedbackDTO0.getPlanning();
        java.lang.Integer int10 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum11 = feedbackDTO0.getModality();
        java.lang.Integer int12 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(modalityEnum11);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', nick='hi!', isBanned=null, deletedComments=0}");
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', nick='hi!', isBanned=null, deletedComments=0}" + "'", str2, "Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', nick='hi!', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Integer int4 = feedbackDTO0.getPlanning();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.types.ModalityEnum modalityEnum6 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.String str8 = feedback7.toString();
        feedback7.setWorkload((java.lang.Integer) 97);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Integer int2 = feedback0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = null;
        feedback0.setModality(modalityEnum3);
        feedback0.setMethodology((java.lang.Integer) (-1));
        feedback0.setMethodology((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        int int5 = student0.getDeletedComments();
        int int6 = student0.getDeletedComments();
        java.lang.String str7 = student0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}" + "'", str7, "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setDeletedComments(100);
        java.lang.String str9 = student0.getNick();
        student0.setId((java.lang.Long) 10L);
        student0.setDeletedComments((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        java.lang.Long long9 = feedbackDTO0.getIdStudent();
        java.lang.Integer int10 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum6 = feedbackDTO0.getModality();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        java.lang.Integer int8 = feedbackDTO0.getMethodology();
        java.lang.Integer int9 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= hi! }");
        teacher1.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=0, planning=1, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacher1.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=0, planning=1, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=0, planning=1, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=true, deletedComments=0}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=35}");
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback9 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback9.setIdCourse((java.lang.Long) 100L);
        java.lang.Long long12 = feedback9.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        java.lang.Boolean boolean2 = student0.getBanned();
        java.lang.Boolean boolean3 = student0.getBanned();
        java.lang.String str4 = student0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = courseDTO5.getFinalTime();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        com.engSoft.entities.Course course13 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        com.engSoft.entities.Course course14 = new com.engSoft.entities.Course();
        java.lang.String str15 = course14.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO21 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str22 = courseDTO21.getCode();
        course14.update(courseDTO21, (java.lang.Long) 1L);
        java.lang.String str25 = courseDTO21.getNameTeacher();
        java.lang.String str26 = courseDTO21.getNameTeacher();
        java.lang.String str27 = courseDTO21.getName();
        course13.update(courseDTO21, (java.lang.Long) (-1L));
        java.lang.String str30 = courseDTO21.getFinalTime();
        java.lang.String str31 = courseDTO21.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str25, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str26, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str27, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str30, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback5.setEvaluationSystem((java.lang.Integer) 10);
        feedback5.setIdStudent((java.lang.Long) (-1L));
        feedback5.setCourseware((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=PRESENTIAL}", "Student{id=null, name='null', email='null', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=null}", "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.String str6 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=null}");
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getName();
        com.engSoft.entities.Course course12 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        com.engSoft.entities.Course course14 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 1L);
        java.lang.Long long15 = course14.getId();
        java.lang.Long long16 = course14.getId();
        java.lang.String str17 = course14.getInitialTime();
        com.engSoft.entities.Course course18 = new com.engSoft.entities.Course();
        java.lang.String str19 = course18.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO25 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str26 = courseDTO25.getCode();
        course18.update(courseDTO25, (java.lang.Long) 1L);
        java.lang.String str29 = courseDTO25.getInitialTime();
        course14.update(courseDTO25, (java.lang.Long) 1L);
        java.lang.String str32 = course14.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str32, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.toString();
        java.lang.String str2 = student0.getName();
        student0.setDeletedComments(0);
        int int5 = student0.getDeletedComments();
        java.lang.String str6 = student0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str1, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str6, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name=  }");
        java.lang.Long long2 = teacher1.getId();
        teacher1.setName("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.Long long5 = teacher1.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO6 = new com.engSoft.DTO.TeacherDTO(teacher1);
        java.lang.String str7 = teacher1.getName();
        java.lang.String str8 = teacher1.toString();
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str7, "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0} }" + "'", str8, "Teacher{id=null, name= Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0} }");
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=null, name='Teacher{id=null, name= Teacher{id=null, name=  } }', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}");
        teacherDTO1.setName("Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}', code='Student{id=null, name='null', email='null', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}', idTeacher='0', initialTime='Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}', finalTime='Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}'}");
        java.lang.String str4 = teacherDTO1.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}', code='Student{id=null, name='null', email='null', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}', idTeacher='0', initialTime='Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}', finalTime='Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}'}" + "'", str4, "Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}', code='Student{id=null, name='null', email='null', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}', idTeacher='0', initialTime='Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}', finalTime='Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}'}");
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getInitialTime();
        course0.update(courseDTO16, (java.lang.Long) (-1L));
        java.lang.String str20 = course0.getFinalTime();
        java.lang.Long long21 = course0.getId();
        java.lang.String str22 = course0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str20, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str22, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getInitialTime();
        course0.update(courseDTO16, (java.lang.Long) (-1L));
        java.lang.String str20 = courseDTO16.getInitialTime();
        com.engSoft.entities.Course course22 = new com.engSoft.entities.Course(courseDTO16, (java.lang.Long) 10L);
        com.engSoft.entities.Course course24 = new com.engSoft.entities.Course(courseDTO16, (java.lang.Long) 100L);
        java.lang.Long long25 = course24.getId();
        java.lang.String str26 = course24.toString();
        java.lang.Long long27 = course24.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str26, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long27);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Integer int4 = feedbackDTO0.getPlanning();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.Long long2 = course0.getIdTeacher();
        java.lang.String str3 = course0.getInitialTime();
        java.lang.String str4 = course0.toString();
        java.lang.String str5 = course0.toString();
        java.lang.Long long6 = course0.getIdTeacher();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str4, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str5, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.Long long4 = student0.getId();
        student0.setDeletedComments(0);
        student0.setId((java.lang.Long) 0L);
        java.lang.String str9 = student0.getName();
        java.lang.String str10 = student0.getEmail();
        student0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}");
        java.lang.String str13 = student0.getEmail();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.String str2 = course0.getCode();
        java.lang.String str3 = course0.getCode();
        java.lang.String str4 = course0.getInitialTime();
        java.lang.String str5 = course0.getFinalTime();
        java.lang.String str6 = course0.getInitialTime();
        java.lang.Long long7 = course0.getIdTeacher();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        java.lang.String str6 = student0.getNick();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str8 = student0.getNick();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=-1, name='null', email='null', nick='null', isBanned=true, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=100, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = courseDTO5.getNameTeacher();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        com.engSoft.entities.Course course9 = new com.engSoft.entities.Course();
        java.lang.String str10 = course9.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getCode();
        course9.update(courseDTO16, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO25 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str26 = courseDTO25.getInitialTime();
        course9.update(courseDTO25, (java.lang.Long) (-1L));
        java.lang.String str29 = courseDTO25.getCode();
        java.lang.String str30 = courseDTO25.getCode();
        java.lang.String str31 = courseDTO25.getNameTeacher();
        java.lang.String str32 = courseDTO25.getInitialTime();
        java.lang.String str33 = courseDTO25.getName();
        course8.update(courseDTO25, (java.lang.Long) 100L);
        java.lang.String str36 = courseDTO25.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}" + "'", str6, "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str31, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str33, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str36, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getNick();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=-1, courseware=35, modality=null}");
        student0.setNick("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str3 = teacher2.toString();
        java.lang.Long long4 = teacher2.getId();
        teacher2.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=100, evaluationSystem=null, courseware=-1, modality=null}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }" + "'", str3, "Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }");
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getNick();
        java.lang.String str7 = student0.getNick();
        student0.setDeletedComments(100);
        java.lang.String str10 = student0.getName();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Teacher{id=null, name= hi! }");
        student0.setId((java.lang.Long) 1L);
        java.lang.String str9 = student0.getName();
        java.lang.String str10 = student0.getName();
        java.lang.Boolean boolean11 = student0.getBanned();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str9, "Teacher{id=null, name= hi! }");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str10, "Teacher{id=null, name= hi! }");
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= null }");
        teacher1.setName("");
        java.lang.String str4 = teacher1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name=  }" + "'", str4, "Teacher{id=null, name=  }");
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        com.engSoft.entities.Course course7 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) (-1L));
        java.lang.String str8 = courseDTO5.getNameTeacher();
        java.lang.String str9 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str8, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str9, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setId((java.lang.Long) 100L);
        student0.setBanned((java.lang.Boolean) true);
        com.engSoft.DTO.StudentDTO studentDTO9 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO9.setEmail("Student{id=null, name='Teacher{id=null, name= hi! }', email='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}', nick='hi!', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback9 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int10 = feedbackDTO0.getMethodology();
        java.lang.Long long11 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum12 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(modalityEnum12);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name=  }");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher3);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        java.lang.String str7 = student0.getNick();
        student0.setNick("Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null}', isBanned=false, deletedComments=0}");
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=0, evaluationSystem=10, courseware=1, modality=null}");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getInitialTime();
        course0.update(courseDTO16, (java.lang.Long) (-1L));
        java.lang.String str20 = course0.toString();
        java.lang.Long long21 = course0.getId();
        com.engSoft.DTO.CourseDTO courseDTO27 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Teacher{id=null, name= hi! }", "hi!", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        course0.update(courseDTO27, (java.lang.Long) 100L);
        java.lang.String str30 = courseDTO27.getName();
        java.lang.String str31 = courseDTO27.getNameTeacher();
        java.lang.String str32 = courseDTO27.getInitialTime();
        java.lang.String str33 = courseDTO27.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str30, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str32, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str33, "Teacher{id=null, name= hi! }");
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.getName();
        java.lang.String str2 = teacher0.toString();
        java.lang.String str3 = teacher0.getName();
        java.lang.String str4 = teacher0.getName();
        java.lang.String str5 = teacher0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= null }" + "'", str2, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        feedback0.setCourseware((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedback0.getModality();
        java.lang.Integer int5 = feedback0.getPlanning();
        java.lang.Integer int6 = feedback0.getEvaluationSystem();
        feedback0.setWorkload((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum9 = feedback0.getModality();
        java.lang.Long long10 = feedback0.getId();
        java.lang.Integer int11 = feedback0.getEvaluationSystem();
        feedback0.setPlanning((java.lang.Integer) 97);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int8 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=10, methodology=null, planning=0, evaluationSystem=null, courseware=null, modality=null}", "", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=null}", "", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=-1}");
        java.lang.String str6 = courseDTO5.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str3 = teacher0.getName();
        java.lang.Long long4 = teacher0.getId();
        java.lang.String str5 = teacher0.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO6 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getCode();
        java.lang.Long long5 = course0.getIdTeacher();
        com.engSoft.DTO.CourseDTO courseDTO11 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str12 = courseDTO11.getName();
        java.lang.String str13 = courseDTO11.getInitialTime();
        java.lang.String str14 = courseDTO11.getCode();
        java.lang.String str15 = courseDTO11.getFinalTime();
        java.lang.String str16 = courseDTO11.getName();
        java.lang.String str17 = courseDTO11.getName();
        java.lang.String str18 = courseDTO11.getInitialTime();
        course0.update(courseDTO11, (java.lang.Long) 10L);
        java.lang.String str21 = course0.getFinalTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str16, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str17, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.Long long1 = course0.getId();
        java.lang.String str2 = course0.getInitialTime();
        java.lang.String str3 = course0.toString();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str3, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        teacherDTO1.setName("Teacher{id=null, name= null }");
        java.lang.String str4 = teacherDTO1.getName();
        java.lang.String str5 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher6 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher7 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str8 = teacher7.getName();
        java.lang.String str9 = teacher7.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= null }" + "'", str4, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= null }" + "'", str8, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Teacher{id=null, name= null }" + "'", str9, "Teacher{id=null, name= null }");
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=0}");
        java.lang.String str2 = customErrorType1.getErrorMessage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=0}" + "'", str2, "Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        java.lang.Integer int9 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        int int5 = student0.getDeletedComments();
        int int6 = student0.getDeletedComments();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str8 = student0.getName();
        student0.setName("Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=0}");
        java.lang.String str11 = student0.getNick();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        java.lang.Long long4 = feedback0.getIdStudent();
        feedback0.setMethodology((java.lang.Integer) (-1));
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback();
        java.lang.Integer int8 = feedback7.getEvaluationSystem();
        feedback7.setIdCourse((java.lang.Long) 1L);
        feedback7.setPlanning((java.lang.Integer) 1);
        feedback7.setPlanning((java.lang.Integer) 10);
        feedback7.setMethodology((java.lang.Integer) 0);
        com.engSoft.entities.Feedback feedback17 = new com.engSoft.entities.Feedback();
        java.lang.Integer int18 = feedback17.getEvaluationSystem();
        feedback17.setIdCourse((java.lang.Long) 1L);
        com.engSoft.entities.Feedback feedback21 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum22 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback21.setModality(modalityEnum22);
        feedback17.setModality(modalityEnum22);
        feedback7.setModality(modalityEnum22);
        feedback0.setModality(modalityEnum22);
        feedback0.setWorkload((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertTrue("'" + modalityEnum22 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum22.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}");
        java.lang.Long long2 = teacher1.getId();
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        java.lang.Long long9 = feedbackDTO0.getIdStudent();
        java.lang.Integer int10 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.Feedback feedback11 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback11.setIdCourse((java.lang.Long) 100L);
        feedback11.setIdStudent((java.lang.Long) 10L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO2);
        teacher3.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        java.lang.String str6 = teacher3.getName();
        java.lang.String str7 = teacher3.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO8 = new com.engSoft.DTO.TeacherDTO(teacher3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str6, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }" + "'", str7, "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getInitialTime();
        java.lang.String str7 = courseDTO5.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Long long1 = feedbackDTO0.getIdCourse();
        java.lang.Long long2 = feedbackDTO0.getIdCourse();
        java.lang.Integer int3 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        feedback0.setIdStudent((java.lang.Long) 100L);
        java.lang.Integer int5 = feedback0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name=  }");
        java.lang.String str2 = teacher1.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher1);
        java.lang.String str4 = teacher1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name=  } }" + "'", str2, "Teacher{id=null, name= Teacher{id=null, name=  } }");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name=  }" + "'", str4, "Teacher{id=null, name=  }");
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        java.lang.String str5 = student0.toString();
        student0.setId((java.lang.Long) 100L);
        int int8 = student0.getDeletedComments();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=-1, planning=null, evaluationSystem=100, courseware=null, modality=REMOTE}", "Teacher{id=null, name= Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null}', isBanned=false, deletedComments=0} }");
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.String str4 = student0.toString();
        java.lang.Long long5 = student0.getId();
        int int6 = student0.getDeletedComments();
        java.lang.String str7 = student0.getNick();
        java.lang.String str8 = student0.getEmail();
        student0.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str4, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("", "Feedback{id=null, idCourse=null, idStudent=-1, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', isBanned=true, deletedComments=100}", "Teacher{id=null, name= Teacher{id=null, name= Teacher{id=null, name= null } } }", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long4 = teacher0.getId();
        java.lang.String str5 = teacher0.toString();
        teacher0.setName("");
        com.engSoft.DTO.TeacherDTO teacherDTO8 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.entities.Teacher teacher9 = new com.engSoft.entities.Teacher(teacherDTO8);
        java.lang.String str10 = teacher9.toString();
        teacher9.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
        java.lang.String str13 = teacher9.toString();
        teacher9.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Teacher{id=null, name=  }" + "'", str10, "Teacher{id=null, name=  }");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null} }" + "'", str13, "Teacher{id=null, name= Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null} }");
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Teacher{id=null, name= Student{id=null, name='null', email='null', nick='', isBanned=null, deletedComments=0} }");
        java.lang.String str2 = customErrorType1.getErrorMessage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='', isBanned=null, deletedComments=0} }" + "'", str2, "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='', isBanned=null, deletedComments=0} }");
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        teacherDTO1.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}");
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str5 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher6 = new com.engSoft.entities.Teacher(teacherDTO1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getName();
        java.lang.String str9 = courseDTO7.getInitialTime();
        java.lang.String str10 = courseDTO7.getCode();
        java.lang.String str11 = courseDTO7.getFinalTime();
        java.lang.String str12 = courseDTO7.getInitialTime();
        course0.update(courseDTO7, (java.lang.Long) 10L);
        java.lang.String str15 = course0.getFinalTime();
        java.lang.Long long16 = course0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long16);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Student{id=-1, name='null', email='null', nick='Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=35}");
        studentDTO2.setEmail("Student{id=0, name='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=true, deletedComments=10}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
        java.lang.String str3 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}" + "'", str3, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        java.lang.Long long4 = student0.getId();
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setNick("Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        java.lang.Long long3 = feedback0.getIdStudent();
        feedback0.setWorkload((java.lang.Integer) 100);
        feedback0.setWorkload((java.lang.Integer) 10);
        java.lang.Integer int8 = feedback0.getPlanning();
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        java.lang.Integer int8 = feedbackDTO0.getCourseware();
        java.lang.Integer int9 = feedbackDTO0.getMethodology();
        java.lang.Long long10 = feedbackDTO0.getIdCourse();
        java.lang.Integer int11 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}", "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
        studentDTO2.setEmail("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null} }");
        java.lang.String str7 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null} }" + "'", str7, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null} }");
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        java.lang.Boolean boolean2 = student0.getBanned();
        java.lang.String str3 = student0.toString();
        student0.setId((java.lang.Long) 10L);
        student0.setEmail("");
        student0.setDeletedComments((int) (byte) -1);
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str3, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        com.engSoft.DTO.StudentDTO studentDTO9 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.Long long10 = student0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=10, evaluationSystem=1, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=null, deletedComments=32}", "Student{id=-1, name='null', email='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}", "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
        studentDTO2.setEmail("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null} }");
        studentDTO2.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=null}");
        studentDTO2.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getNameTeacher();
        java.lang.String str9 = courseDTO5.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getNick();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        student0.setDeletedComments((int) (short) 100);
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='Teacher{id=null, name= hi! }', idTeacher='1', initialTime='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', finalTime='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}'}");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null} }");
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        java.lang.Integer int8 = feedbackDTO0.getPlanning();
        java.lang.Integer int9 = feedbackDTO0.getMethodology();
        java.lang.Long long10 = feedbackDTO0.getIdStudent();
        java.lang.Integer int11 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher6 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str7 = teacherDTO1.getName();
        java.lang.String str8 = teacherDTO1.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        java.lang.String str5 = student0.getEmail();
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setDeletedComments((int) 'a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getName();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getNameTeacher();
        com.engSoft.entities.Course course12 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        com.engSoft.entities.Course course14 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        com.engSoft.entities.Course course15 = new com.engSoft.entities.Course();
        java.lang.String str16 = course15.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO22 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str23 = courseDTO22.getCode();
        course15.update(courseDTO22, (java.lang.Long) 1L);
        java.lang.Long long26 = course15.getId();
        java.lang.String str27 = course15.getName();
        java.lang.String str28 = course15.getCode();
        com.engSoft.DTO.CourseDTO courseDTO34 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str35 = courseDTO34.getCode();
        com.engSoft.entities.Course course37 = new com.engSoft.entities.Course(courseDTO34, (java.lang.Long) 10L);
        course15.update(courseDTO34, (java.lang.Long) 1L);
        java.lang.String str40 = courseDTO34.getNameTeacher();
        java.lang.String str41 = courseDTO34.getNameTeacher();
        course14.update(courseDTO34, (java.lang.Long) 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(long26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str27, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str40, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str41, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.toString();
        java.lang.String str5 = course0.getFinalTime();
        java.lang.Long long6 = course0.getId();
        java.lang.String str7 = course0.getInitialTime();
        com.engSoft.DTO.CourseDTO courseDTO13 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Teacher{id=null, name=  }", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str14 = courseDTO13.getCode();
        java.lang.String str15 = courseDTO13.getNameTeacher();
        course0.update(courseDTO13, (java.lang.Long) 100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str4, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str15, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments((int) (byte) -1);
        student0.setBanned((java.lang.Boolean) false);
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.Long long11 = student0.getId();
        student0.setNick("Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str16 = student0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student{id=null, name='null', email='null', nick='Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=false, deletedComments=-1}" + "'", str16, "Student{id=null, name='null', email='null', nick='Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=false, deletedComments=-1}");
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getName();
        java.lang.String str11 = courseDTO5.getName();
        java.lang.String str12 = courseDTO5.getInitialTime();
        java.lang.String str13 = courseDTO5.getCode();
        java.lang.String str14 = courseDTO5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=0, modality=null}");
        java.lang.String str5 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=0, modality=null}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=0, modality=null}");
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getName();
        java.lang.String str10 = courseDTO5.getNameTeacher();
        java.lang.String str11 = courseDTO5.getName();
        java.lang.String str12 = courseDTO5.getInitialTime();
        java.lang.String str13 = courseDTO5.getCode();
        java.lang.String str14 = courseDTO5.getFinalTime();
        java.lang.String str15 = courseDTO5.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        java.lang.String str9 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO10 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setNick("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
        java.lang.String str13 = student0.getEmail();
        com.engSoft.DTO.StudentDTO studentDTO14 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.String str2 = student0.getName();
        java.lang.String str3 = student0.getEmail();
        student0.setId((java.lang.Long) 100L);
        student0.setDeletedComments(0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacher0.getName();
        java.lang.String str5 = teacher0.toString();
        java.lang.String str6 = teacher0.toString();
        java.lang.String str7 = teacher0.getName();
        java.lang.String str8 = teacher0.toString();
        java.lang.String str9 = teacher0.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str8, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.toString();
        java.lang.String str2 = teacher0.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO3);
        com.engSoft.DTO.TeacherDTO teacherDTO5 = new com.engSoft.DTO.TeacherDTO(teacher4);
        com.engSoft.DTO.TeacherDTO teacherDTO6 = new com.engSoft.DTO.TeacherDTO(teacher4);
        com.engSoft.entities.Teacher teacher7 = new com.engSoft.entities.Teacher(teacherDTO6);
        teacherDTO6.setName("Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10} }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Teacher{id=null, name= null }" + "'", str1, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        int int5 = student0.getDeletedComments();
        student0.setEmail("Teacher{id=null, name=  }");
        java.lang.Long long8 = student0.getId();
        student0.setNick("Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
        student0.setDeletedComments(97);
        java.lang.Boolean boolean13 = student0.getBanned();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        java.lang.Long long3 = feedback0.getId();
        java.lang.Integer int4 = feedback0.getCourseware();
        feedback0.setIdCourse((java.lang.Long) 1L);
        java.lang.Long long7 = feedback0.getId();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Student{id=-1, name='null', email='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int5 = feedback4.getEvaluationSystem();
        feedback4.setPlanning((java.lang.Integer) 1);
        feedback4.setWorkload((java.lang.Integer) 100);
        java.lang.Integer int10 = feedback4.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int10);
    }
}

