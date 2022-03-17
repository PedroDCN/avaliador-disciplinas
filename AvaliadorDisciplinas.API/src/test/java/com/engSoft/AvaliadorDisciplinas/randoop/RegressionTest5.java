package com.engSoft.AvaliadorDisciplinas.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setName("Teacher{id=null, name=  }");
        student0.setName("Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str9 = student0.getEmail();
        java.lang.String str10 = student0.toString();
        student0.setEmail("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.String str13 = student0.getName();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}" + "'", str10, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
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
        java.lang.Boolean boolean15 = student0.getBanned();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str14, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        java.lang.Long long9 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        java.lang.String str7 = student0.getNick();
        java.lang.Long long8 = student0.getId();
        java.lang.String str9 = student0.getName();
        student0.setNick("Teacher{id=null, name=  }");
        student0.setNick("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str14 = student0.getNick();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}" + "'", str14, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.Feedback feedback2 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        java.lang.Class<?> wildcardClass7 = feedbackDTO0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.String str2 = course0.toString();
        java.lang.String str3 = course0.getInitialTime();
        java.lang.Long long4 = course0.getIdTeacher();
        com.engSoft.DTO.CourseDTO courseDTO10 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str11 = courseDTO10.getName();
        java.lang.String str12 = courseDTO10.getInitialTime();
        java.lang.String str13 = courseDTO10.getCode();
        java.lang.String str14 = courseDTO10.getName();
        course0.update(courseDTO10, (java.lang.Long) 0L);
        java.lang.String str17 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO23 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str24 = courseDTO23.getCode();
        com.engSoft.entities.Course course26 = new com.engSoft.entities.Course(courseDTO23, (java.lang.Long) 10L);
        java.lang.String str27 = courseDTO23.getName();
        java.lang.String str28 = courseDTO23.getName();
        java.lang.String str29 = courseDTO23.getNameTeacher();
        course0.update(courseDTO23, (java.lang.Long) 100L);
        java.lang.String str32 = course0.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str17, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str27, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str28, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str29, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacher0.getName();
        java.lang.Long long5 = teacher0.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO6 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str7 = teacherDTO6.getName();
        teacherDTO6.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str10 = teacherDTO6.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        feedback0.setCourseware((java.lang.Integer) 100);
        feedback0.setWorkload((java.lang.Integer) 0);
        feedback0.setCourseware((java.lang.Integer) 1);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        student0.setName("");
        java.lang.Boolean boolean7 = student0.getBanned();
        student0.setBanned((java.lang.Boolean) true);
        student0.setNick("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback8 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long9 = feedbackDTO0.getIdStudent();
        java.lang.Integer int10 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Teacher{id=null, name= null }", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str6 = courseDTO5.getFinalTime();
        java.lang.String str7 = courseDTO5.getInitialTime();
        com.engSoft.entities.Course course9 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str7, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(0);
        java.lang.String str9 = student0.toString();
        student0.setId((java.lang.Long) (-1L));
        student0.setId((java.lang.Long) (-1L));
        java.lang.String str14 = student0.toString();
        student0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student{id=-1, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str14, "Student{id=-1, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.String str5 = student0.toString();
        java.lang.String str6 = student0.getNick();
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
        java.lang.String str9 = student0.toString();
        java.lang.String str10 = student0.getEmail();
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}" + "'", str5, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=10, methodology=null, planning=0, evaluationSystem=null, courseware=null, modality=null}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=-1, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        student0.setName("");
        java.lang.Boolean boolean7 = student0.getBanned();
        student0.setBanned((java.lang.Boolean) true);
        student0.setNick("Student{id=100, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=10}");
        student0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=null}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        int int9 = student0.getDeletedComments();
        student0.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}");
        java.lang.Boolean boolean12 = student0.getBanned();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("", "Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        studentDTO2.setName("Student{id=null, name='null', email='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}");
        studentDTO2.setEmail("Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}', code='Student{id=null, name='null', email='null', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}', idTeacher='0', initialTime='Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}', finalTime='Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}'}");
        studentDTO2.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=10}', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        java.lang.String str5 = student0.toString();
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        int int8 = student0.getDeletedComments();
        student0.setDeletedComments((-1));
        student0.setBanned((java.lang.Boolean) true);
        int int13 = student0.getDeletedComments();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setCourseware((java.lang.Integer) 1);
        java.lang.Integer int4 = feedback0.getWorkload();
        feedback0.setMethodology((java.lang.Integer) 1);
        feedback0.setMethodology((java.lang.Integer) 100);
        feedback0.setEvaluationSystem((java.lang.Integer) 100);
        feedback0.setWorkload((java.lang.Integer) (-1));
        java.lang.Long long13 = feedback0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long13);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.String str2 = student0.toString();
        java.lang.String str3 = student0.toString();
        java.lang.String str4 = student0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str2, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str3, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str4, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        java.lang.Integer int10 = feedbackDTO0.getCourseware();
        java.lang.Integer int11 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Student{id=null, name='Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setCourseware((java.lang.Integer) 1);
        java.lang.Integer int4 = feedback0.getWorkload();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback();
        java.lang.Integer int6 = feedback5.getEvaluationSystem();
        feedback5.setIdCourse((java.lang.Long) 1L);
        feedback5.setPlanning((java.lang.Integer) 1);
        feedback5.setPlanning((java.lang.Integer) 10);
        feedback5.setIdStudent((java.lang.Long) 0L);
        feedback5.setIdCourse((java.lang.Long) 100L);
        com.engSoft.entities.Feedback feedback17 = new com.engSoft.entities.Feedback();
        java.lang.Integer int18 = feedback17.getEvaluationSystem();
        feedback17.setIdCourse((java.lang.Long) 1L);
        feedback17.setPlanning((java.lang.Integer) 1);
        feedback17.setPlanning((java.lang.Integer) 10);
        feedback17.setMethodology((java.lang.Integer) 0);
        com.engSoft.entities.Feedback feedback27 = new com.engSoft.entities.Feedback();
        java.lang.Integer int28 = feedback27.getEvaluationSystem();
        feedback27.setIdCourse((java.lang.Long) 1L);
        com.engSoft.entities.Feedback feedback31 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum32 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback31.setModality(modalityEnum32);
        feedback27.setModality(modalityEnum32);
        feedback17.setModality(modalityEnum32);
        feedback5.setModality(modalityEnum32);
        feedback0.setModality(modalityEnum32);
        java.lang.Long long38 = feedback0.getId();
        java.lang.Long long39 = feedback0.getId();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertTrue("'" + modalityEnum32 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum32.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(long38);
        org.junit.Assert.assertNull(long39);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int9 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long10 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback11 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long12 = feedbackDTO0.getIdStudent();
        java.lang.Long long13 = feedbackDTO0.getIdStudent();
        java.lang.Integer int14 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        teacherDTO1.setName("Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        feedback0.setMethodology((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertTrue("'" + modalityEnum5 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum5.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.Long long4 = student0.getId();
        student0.setDeletedComments(0);
        student0.setId((java.lang.Long) 0L);
        student0.setNick("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str7 = student0.getName();
        java.lang.Boolean boolean8 = student0.getBanned();
        java.lang.Boolean boolean9 = student0.getBanned();
        student0.setName("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        teacherDTO1.setName("Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        int int1 = student0.getDeletedComments();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        com.engSoft.DTO.StudentDTO studentDTO3 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setNick("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.Long long9 = course8.getId();
        java.lang.Long long10 = course8.getId();
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        course8.update(courseDTO16, (java.lang.Long) 100L);
        java.lang.String str19 = course8.toString();
        java.lang.String str20 = course8.getFinalTime();
        java.lang.Long long21 = course8.getId();
        java.lang.String str22 = course8.getName();
        java.lang.String str23 = course8.getInitialTime();
        java.lang.String str24 = course8.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str19, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str20, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str22, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str23, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str24, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str6, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str7, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        java.lang.String str5 = student0.toString();
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        int int8 = student0.getDeletedComments();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=0, methodology=null, planning=null, evaluationSystem=null, courseware=0, modality=null}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.String str5 = student0.getName();
        student0.setBanned((java.lang.Boolean) true);
        student0.setEmail("");
        java.lang.Long long10 = student0.getId();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=PRESENTIAL}");
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        java.lang.String str33 = courseDTO27.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str30, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str32, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str33, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.DTO.TeacherDTO teacherDTO5 = new com.engSoft.DTO.TeacherDTO(teacher4);
        java.lang.String str6 = teacher4.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        student0.setName("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = student0.getNick();
        java.lang.String str7 = student0.getNick();
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
        java.lang.String str2 = customErrorType1.getErrorMessage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.String str2 = course0.toString();
        java.lang.String str3 = course0.getInitialTime();
        java.lang.Long long4 = course0.getIdTeacher();
        java.lang.String str5 = course0.getCode();
        java.lang.String str6 = course0.getInitialTime();
        java.lang.String str7 = course0.getFinalTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = courseDTO5.getName();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        com.engSoft.entities.Course course13 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) (-1L));
        java.lang.String str14 = course13.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str14, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        java.lang.String str32 = courseDTO27.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str30, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str32, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}");
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher1);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO2);
        teacherDTO2.setName("Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Integer int3 = feedbackDTO0.getPlanning();
        java.lang.Integer int4 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.Feedback feedback9 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long10 = feedback9.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 10);
        feedback0.setIdStudent((java.lang.Long) 0L);
        feedback0.setIdCourse((java.lang.Long) 100L);
        com.engSoft.entities.Feedback feedback12 = new com.engSoft.entities.Feedback();
        java.lang.Integer int13 = feedback12.getEvaluationSystem();
        feedback12.setIdCourse((java.lang.Long) 1L);
        feedback12.setPlanning((java.lang.Integer) 1);
        feedback12.setPlanning((java.lang.Integer) 10);
        feedback12.setMethodology((java.lang.Integer) 0);
        com.engSoft.entities.Feedback feedback22 = new com.engSoft.entities.Feedback();
        java.lang.Integer int23 = feedback22.getEvaluationSystem();
        feedback22.setIdCourse((java.lang.Long) 1L);
        com.engSoft.entities.Feedback feedback26 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum27 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback26.setModality(modalityEnum27);
        feedback22.setModality(modalityEnum27);
        feedback12.setModality(modalityEnum27);
        feedback0.setModality(modalityEnum27);
        feedback0.setIdStudent((java.lang.Long) 0L);
        java.lang.String str34 = feedback0.toString();
        java.lang.Class<?> wildcardClass35 = feedback0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertTrue("'" + modalityEnum27 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum27.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str34, "Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.Long long2 = teacher1.getId();
        java.lang.Long long3 = teacher1.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher1);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO4);
        java.lang.String str6 = teacher5.getName();
        java.lang.Long long7 = teacher5.getId();
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str6, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("", "");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacher0.getName();
        java.lang.Long long5 = teacher0.getId();
        java.lang.String str6 = teacher0.toString();
        java.lang.String str7 = teacher0.getName();
        java.lang.String str8 = teacher0.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setDeletedComments(10);
        java.lang.String str6 = student0.getName();
        student0.setId((java.lang.Long) (-1L));
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setDeletedComments((int) (byte) 0);
        java.lang.String str13 = student0.toString();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student{id=-1, name='null', email='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', nick='null', isBanned=true, deletedComments=0}" + "'", str13, "Student{id=-1, name='null', email='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.Long long4 = student0.getId();
        student0.setDeletedComments(0);
        student0.setId((java.lang.Long) 0L);
        java.lang.String str9 = student0.getName();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=-1, courseware=35, modality=null}");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
        java.lang.String str70 = course0.getFinalTime();
        java.lang.String str71 = course0.getFinalTime();
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
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str70, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str71, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setMethodology((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) (-1));
        java.lang.Integer int10 = feedback0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}");
        java.lang.Long long2 = teacher1.getId();
        teacher1.setName("Student{id=0, name='Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setId((java.lang.Long) 100L);
        student0.setEmail("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE} }");
        java.lang.String str9 = student0.getEmail();
        student0.setDeletedComments((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE} }" + "'", str9, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE} }");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(modalityEnum8);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setDeletedComments(10);
        java.lang.Boolean boolean6 = student0.getBanned();
        java.lang.Long long7 = student0.getId();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        int int2 = student0.getDeletedComments();
        java.lang.String str3 = student0.toString();
        java.lang.String str4 = student0.toString();
        java.lang.String str5 = student0.getName();
        java.lang.String str6 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str10 = student0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str3, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str4, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str6, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str10, "Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getFinalTime();
        java.lang.String str5 = course0.getFinalTime();
        java.lang.Long long6 = course0.getId();
        java.lang.Long long7 = course0.getId();
        java.lang.Long long8 = course0.getId();
        java.lang.Long long9 = course0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher3);
        teacher3.setName("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher3);
        teacherDTO7.setName("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(modalityEnum4);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        java.lang.String str9 = student0.toString();
        student0.setEmail("");
        java.lang.String str12 = student0.getEmail();
        java.lang.String str13 = student0.getNick();
        com.engSoft.DTO.StudentDTO studentDTO14 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str13, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback8 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long9 = feedbackDTO0.getIdStudent();
        java.lang.Integer int10 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        java.lang.Long long9 = feedbackDTO0.getIdStudent();
        java.lang.Integer int10 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
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
        student0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}" + "'", str13, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        java.lang.String str3 = student0.getNick();
        java.lang.String str4 = student0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.Long long9 = course8.getId();
        java.lang.Long long10 = course8.getId();
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        course8.update(courseDTO16, (java.lang.Long) 100L);
        java.lang.String str19 = course8.getInitialTime();
        java.lang.String str20 = course8.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str19, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str20, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.Long long2 = course0.getId();
        java.lang.String str3 = course0.toString();
        java.lang.String str4 = course0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str3, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        java.lang.Long long8 = feedbackDTO0.getIdCourse();
        java.lang.Integer int9 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long10 = feedbackDTO0.getIdCourse();
        java.lang.Long long11 = feedbackDTO0.getIdStudent();
        java.lang.Long long12 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Long long2 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("hi!");
        java.lang.String str2 = teacher1.getName();
        java.lang.String str3 = teacher1.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher1);
        teacherDTO4.setName("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str3, "Teacher{id=null, name= hi! }");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        java.lang.Integer int10 = feedbackDTO0.getCourseware();
        java.lang.Integer int11 = feedbackDTO0.getMethodology();
        java.lang.Long long12 = feedbackDTO0.getIdStudent();
        java.lang.Integer int13 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Teacher{id=null, name= hi! }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str6 = courseDTO5.getNameTeacher();
        java.lang.String str7 = courseDTO5.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str6, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str7, "Teacher{id=null, name= hi! }");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedback7.getModality();
        java.lang.Long long9 = feedback7.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setDeletedComments(35);
        student0.setNick("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        teacherDTO1.setName("Teacher{id=null, name= null }");
        java.lang.String str4 = teacherDTO1.getName();
        java.lang.String str5 = teacherDTO1.getName();
        java.lang.String str6 = teacherDTO1.getName();
        teacherDTO1.setName("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= null }" + "'", str4, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= null }" + "'", str6, "Teacher{id=null, name= null }");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        java.lang.String str4 = student0.getName();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        int int1 = student0.getDeletedComments();
        java.lang.String str2 = student0.getNick();
        student0.setBanned((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setEvaluationSystem((java.lang.Integer) (-1));
        java.lang.Integer int4 = feedback0.getMethodology();
        feedback0.setMethodology((java.lang.Integer) 0);
        feedback0.setPlanning((java.lang.Integer) 100);
        feedback0.setCourseware((java.lang.Integer) 10);
        java.lang.Integer int11 = feedback0.getWorkload();
        feedback0.setPlanning((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}", "Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=100, modality=null}", "Student{id=10, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=0}", "Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        java.lang.String str2 = teacher1.toString();
        java.lang.String str3 = teacher1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }" + "'", str2, "Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str3, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        int int1 = student0.getDeletedComments();
        java.lang.String str2 = student0.getNick();
        com.engSoft.DTO.StudentDTO studentDTO3 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        java.lang.String str4 = student0.getNick();
        student0.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setId((java.lang.Long) (-1L));
        student0.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        teacherDTO1.setName("Teacher{id=null, name= null }");
        java.lang.String str4 = teacherDTO1.getName();
        teacherDTO1.setName("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= null }" + "'", str4, "Teacher{id=null, name= null }");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= null }");
        teacherDTO1.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacherDTO1.getName();
        teacherDTO1.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
        com.engSoft.entities.Teacher teacher7 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.DTO.TeacherDTO teacherDTO8 = new com.engSoft.DTO.TeacherDTO(teacher7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setDeletedComments(10);
        java.lang.String str6 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO7.setName("Teacher{id=null, name= hi! }");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str6, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getName();
        java.lang.String str11 = courseDTO5.getName();
        com.engSoft.entities.Course course13 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.Long long3 = course0.getIdTeacher();
        java.lang.String str4 = course0.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum8);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        student0.setEmail("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str9 = student0.getNick();
        java.lang.Long long10 = student0.getId();
        java.lang.Boolean boolean11 = student0.getBanned();
        java.lang.String str12 = student0.getName();
        student0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str15 = student0.getEmail();
        java.lang.String str16 = student0.toString();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str15, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student{id=null, name='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}" + "'", str16, "Student{id=null, name='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        java.lang.Long long31 = course0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertNull(long31);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        java.lang.Boolean boolean2 = student0.getBanned();
        java.lang.String str3 = student0.toString();
        student0.setId((java.lang.Long) 0L);
        student0.setNick("Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }");
        java.lang.String str8 = student0.getEmail();
        com.engSoft.DTO.StudentDTO studentDTO9 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str3, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        java.lang.String str11 = courseDTO7.getInitialTime();
        com.engSoft.entities.Course course13 = new com.engSoft.entities.Course(courseDTO7, (java.lang.Long) 1L);
        java.lang.String str14 = courseDTO7.getFinalTime();
        java.lang.String str15 = courseDTO7.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Long long5 = feedbackDTO0.getIdStudent();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long9 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        java.lang.Long long11 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        student0.setName("Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}");
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str6 = student0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getNick();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str10 = student0.getEmail();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        student0.setEmail("Teacher{id=null, name= hi! }");
        student0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}");
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=0, planning=1, evaluationSystem=null, courseware=null, modality=null}");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        java.lang.String str25 = courseDTO19.getNameTeacher();
        java.lang.String str26 = courseDTO19.getNameTeacher();
        java.lang.String str27 = courseDTO19.getFinalTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str25, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str26, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str27, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getCode();
        com.engSoft.DTO.CourseDTO courseDTO10 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str11 = courseDTO10.getName();
        java.lang.String str12 = courseDTO10.getInitialTime();
        course0.update(courseDTO10, (java.lang.Long) 0L);
        com.engSoft.entities.Course course16 = new com.engSoft.entities.Course(courseDTO10, (java.lang.Long) 0L);
        java.lang.String str17 = courseDTO10.getNameTeacher();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str17, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setCourseware((java.lang.Integer) 1);
        java.lang.Integer int4 = feedback0.getWorkload();
        java.lang.Integer int5 = feedback0.getEvaluationSystem();
        feedback0.setIdStudent((java.lang.Long) 0L);
        java.lang.Integer int8 = feedback0.getPlanning();
        java.lang.Integer int9 = feedback0.getMethodology();
        feedback0.setPlanning((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getMethodology();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.Long long4 = teacher3.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO5 = new com.engSoft.DTO.TeacherDTO(teacher3);
        java.lang.Long long6 = teacher3.getId();
        java.lang.Long long7 = teacher3.getId();
        java.lang.String str8 = teacher3.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= null }" + "'", str8, "Teacher{id=null, name= null }");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean9 = student0.getBanned();
        student0.setName("Teacher{id=null, name= null }");
        com.engSoft.DTO.StudentDTO studentDTO12 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments((int) (short) 10);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
        java.lang.String str26 = courseDTO18.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str6, "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str7, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
        java.lang.String str24 = course0.getInitialTime();
        java.lang.String str25 = course0.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str23, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        java.lang.String str9 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO10 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
        student0.setNick("Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}");
        java.lang.String str15 = student0.getEmail();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Student{id=null, name='null', email='null', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Feedback{id=null, idCourse=null, idStudent=10, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str6, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=0, modality=null}");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.String str5 = feedback4.toString();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Integer int4 = feedbackDTO0.getWorkload();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str5 = studentDTO2.getEmail();
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        studentDTO2.setName("Teacher{id=null, name= null }");
        studentDTO2.setEmail("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }");
        java.lang.String str12 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }" + "'", str12, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}", "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}", "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        java.lang.String str9 = course8.getCode();
        java.lang.String str10 = course8.getName();
        java.lang.Long long11 = course8.getId();
        java.lang.String str12 = course8.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str6, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str9, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}" + "'", str10, "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}" + "'", str12, "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        student0.setName("Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=0}");
        java.lang.Long long8 = student0.getId();
        java.lang.String str9 = student0.getEmail();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        java.lang.String str11 = courseDTO7.getName();
        com.engSoft.entities.Course course13 = new com.engSoft.entities.Course(courseDTO7, (java.lang.Long) 100L);
        java.lang.String str14 = course13.getCode();
        java.lang.String str15 = course13.getCode();
        java.lang.String str16 = course13.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str16, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str4 = teacher0.toString();
        java.lang.String str5 = teacher0.getName();
        java.lang.String str6 = teacher0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= null }" + "'", str4, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        feedback0.setCourseware((java.lang.Integer) 100);
        feedback0.setPlanning((java.lang.Integer) 10);
        java.lang.Long long5 = feedback0.getIdCourse();
        feedback0.setIdCourse((java.lang.Long) (-1L));
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedback0.getModality();
        java.lang.Long long9 = feedback0.getIdStudent();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='null', email='null', nick='Teacher{id=null, name=  }', isBanned=true, deletedComments=0}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = courseDTO5.getInitialTime();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = courseDTO5.getNameTeacher();
        java.lang.String str10 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}" + "'", str10, "Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
        java.lang.String str25 = courseDTO19.getNameTeacher();
        com.engSoft.entities.Course course27 = new com.engSoft.entities.Course(courseDTO19, (java.lang.Long) 100L);
        java.lang.String str28 = course27.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO29 = null;
        // The following exception was thrown during execution in test generation
        try {
            course27.update(courseDTO29, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str25, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str28, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean9 = student0.getBanned();
        int int10 = student0.getDeletedComments();
        java.lang.String str11 = student0.getEmail();
        com.engSoft.DTO.StudentDTO studentDTO12 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        java.lang.Long long6 = feedback0.getId();
        feedback0.setPlanning((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum9 = feedback0.getModality();
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setMethodology((java.lang.Integer) 100);
        feedback0.setMethodology((java.lang.Integer) 1);
        java.lang.Integer int16 = feedback0.getCourseware();
        java.lang.Integer int17 = feedback0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(modalityEnum9);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(int17);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
        java.lang.String str26 = courseDTO16.getInitialTime();
        java.lang.String str27 = courseDTO16.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str22, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str23, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str24, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Long long1 = feedback0.getIdStudent();
        feedback0.setIdCourse((java.lang.Long) 100L);
        java.lang.Integer int4 = feedback0.getPlanning();
        java.lang.String str5 = feedback0.toString();
        feedback0.setIdStudent((java.lang.Long) 0L);
        java.lang.String str8 = feedback0.toString();
        feedback0.setMethodology((java.lang.Integer) 0);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str5, "Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str8, "Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name=  }");
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher1);
        teacher1.setName("Teacher{id=null, name= Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        java.lang.String str5 = teacher1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }" + "'", str5, "Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.Long long4 = student0.getId();
        student0.setDeletedComments(0);
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        int int9 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        int int2 = student0.getDeletedComments();
        java.lang.Boolean boolean3 = student0.getBanned();
        student0.setNick("");
        java.lang.String str6 = student0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='null', nick='', isBanned=null, deletedComments=0}" + "'", str6, "Student{id=null, name='null', email='null', nick='', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=1, courseware=null, modality=REMOTE}", "Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}', code='Student{id=null, name='null', email='null', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}', idTeacher='0', initialTime='Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}', finalTime='Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}'}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=PRESENTIAL}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.String str6 = courseDTO5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}" + "'", str6, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        java.lang.Boolean boolean2 = student0.getBanned();
        java.lang.String str3 = student0.toString();
        student0.setId((java.lang.Long) 10L);
        student0.setEmail("");
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str3, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean7 = student0.getBanned();
        java.lang.String str8 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO9 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}" + "'", str8, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str6 = teacher5.toString();
        java.lang.String str7 = teacher5.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO8 = new com.engSoft.DTO.TeacherDTO(teacher5);
        java.lang.String str9 = teacherDTO8.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= null }" + "'", str6, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=null, deletedComments=32}", "Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 100);
        java.lang.Integer int8 = feedback0.getMethodology();
        java.lang.Long long9 = feedback0.getIdStudent();
        java.lang.Long long10 = feedback0.getId();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='Teacher{id=null, name= Teacher{id=null, name=  } }', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str7 = student0.getName();
        java.lang.Boolean boolean8 = student0.getBanned();
        student0.setDeletedComments((int) (short) -1);
        java.lang.String str11 = student0.getName();
        java.lang.String str12 = student0.getEmail();
        com.engSoft.DTO.StudentDTO studentDTO13 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str14 = student0.getNick();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Long long1 = feedback0.getIdStudent();
        feedback0.setIdCourse((java.lang.Long) 100L);
        java.lang.Integer int4 = feedback0.getPlanning();
        java.lang.String str5 = feedback0.toString();
        java.lang.Long long6 = feedback0.getIdStudent();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str5, "Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=100, modality=null}", "Student{id=null, name='null', email='null', nick='Teacher{id=null, name=  }', isBanned=true, deletedComments=0}");
        java.lang.String str3 = studentDTO2.getName();
        studentDTO2.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        studentDTO2.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        java.lang.String str8 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=100, modality=null}" + "'", str3, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=100, modality=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='null', email='null', nick='Teacher{id=null, name=  }', isBanned=true, deletedComments=0}" + "'", str8, "Student{id=null, name='null', email='null', nick='Teacher{id=null, name=  }', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= Teacher{id=null, name=  } }");
        teacher1.setName("Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=97}");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Student{id=1, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getInitialTime();
        java.lang.String str4 = course0.getFinalTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}");
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher1);
        teacherDTO2.setName("Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null}', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long4 = teacher0.getId();
        java.lang.String str5 = teacher0.toString();
        java.lang.Long long6 = teacher0.getId();
        java.lang.String str7 = teacher0.getName();
        java.lang.Long long8 = teacher0.getId();
        java.lang.String str9 = teacher0.getName();
        java.lang.String str10 = teacher0.getName();
        teacher0.setName("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
        java.lang.String str2 = customErrorType1.getErrorMessage();
        java.lang.String str3 = customErrorType1.getErrorMessage();
        java.lang.String str4 = customErrorType1.getErrorMessage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}" + "'", str2, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}" + "'", str3, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}" + "'", str4, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        teacherDTO1.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        teacherDTO1.setName("Teacher{id=null, name= null }");
        java.lang.String str8 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher9 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str10 = teacher9.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= null }" + "'", str8, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name= null } }" + "'", str10, "Teacher{id=null, name= Teacher{id=null, name= null } }");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.Long long9 = course8.getId();
        java.lang.Long long10 = course8.getId();
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        course8.update(courseDTO16, (java.lang.Long) 100L);
        java.lang.String str19 = course8.toString();
        java.lang.String str20 = course8.getFinalTime();
        java.lang.String str21 = course8.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str19, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str20, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str21, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        java.lang.Long long10 = feedbackDTO0.getIdCourse();
        java.lang.Integer int11 = feedbackDTO0.getWorkload();
        java.lang.Integer int12 = feedbackDTO0.getCourseware();
        java.lang.Integer int13 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.String str5 = student0.toString();
        java.lang.String str6 = student0.getNick();
        java.lang.Boolean boolean7 = student0.getBanned();
        student0.setNick("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}" + "'", str5, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.Long long1 = course0.getId();
        java.lang.String str2 = course0.getCode();
        java.lang.Long long3 = course0.getId();
        java.lang.String str4 = course0.getInitialTime();
        java.lang.String str5 = course0.getFinalTime();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("hi!");
        java.lang.String str2 = teacher1.getName();
        java.lang.String str3 = teacher1.getName();
        java.lang.String str4 = teacher1.toString();
        java.lang.String str5 = teacher1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str4, "Teacher{id=null, name= hi! }");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str5, "Teacher{id=null, name= hi! }");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str5 = studentDTO2.getEmail();
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        studentDTO2.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str14 = studentDTO2.getName();
        java.lang.String str15 = studentDTO2.getEmail();
        java.lang.String str16 = studentDTO2.getName();
        studentDTO2.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=1, methodology=100, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str15, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str16, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str3 = studentDTO2.getName();
        java.lang.String str4 = studentDTO2.getName();
        studentDTO2.setName("Teacher{id=null, name= null }");
        java.lang.String str7 = studentDTO2.getName();
        java.lang.String str8 = studentDTO2.getName();
        studentDTO2.setEmail("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }");
        studentDTO2.setName("Student{id=null, name='Teacher{id=null, name= hi! }', email='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}', nick='hi!', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= null }" + "'", str7, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= null }" + "'", str8, "Teacher{id=null, name= null }");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
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
        java.lang.String str25 = courseDTO19.getFinalTime();
        java.lang.String str26 = courseDTO19.getInitialTime();
        java.lang.String str27 = courseDTO19.getCode();
        java.lang.String str28 = courseDTO19.getNameTeacher();
        java.lang.String str29 = courseDTO19.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str25, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str28, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=-1, planning=null, evaluationSystem=1, courseware=1, modality=REMOTE}");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        java.lang.Boolean boolean6 = student0.getBanned();
        java.lang.String str7 = student0.getNick();
        java.lang.Boolean boolean8 = student0.getBanned();
        java.lang.Long long9 = student0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setMethodology((java.lang.Integer) 1);
        java.lang.String str8 = feedback0.toString();
        feedback0.setIdCourse((java.lang.Long) 1L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=null}" + "'", str8, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getPlanning();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Integer int4 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        java.lang.String str7 = student0.getNick();
        java.lang.Long long8 = student0.getId();
        java.lang.String str9 = student0.getName();
        student0.setNick("Teacher{id=null, name=  }");
        student0.setNick("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str14 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO15 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student{id=null, name='null', email='null', nick='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}', isBanned=true, deletedComments=0}" + "'", str14, "Student{id=null, name='null', email='null', nick='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Long long1 = feedback0.getIdStudent();
        feedback0.setIdCourse((java.lang.Long) 100L);
        java.lang.Integer int4 = feedback0.getPlanning();
        java.lang.String str5 = feedback0.toString();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback();
        java.lang.Integer int7 = feedback6.getEvaluationSystem();
        feedback6.setIdCourse((java.lang.Long) 1L);
        feedback6.setEvaluationSystem((java.lang.Integer) 100);
        java.lang.Integer int12 = feedback6.getPlanning();
        feedback6.setIdStudent((java.lang.Long) 100L);
        feedback6.setIdCourse((java.lang.Long) 100L);
        com.engSoft.DTO.FeedbackDTO feedbackDTO17 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int18 = feedbackDTO17.getWorkload();
        java.lang.Integer int19 = feedbackDTO17.getMethodology();
        com.engSoft.entities.Feedback feedback20 = new com.engSoft.entities.Feedback(feedbackDTO17);
        java.lang.Integer int21 = feedback20.getCourseware();
        feedback20.setMethodology((java.lang.Integer) 100);
        java.lang.Integer int24 = feedback20.getPlanning();
        java.lang.Integer int25 = feedback20.getEvaluationSystem();
        com.engSoft.entities.Feedback feedback26 = new com.engSoft.entities.Feedback();
        java.lang.Integer int27 = feedback26.getEvaluationSystem();
        feedback26.setIdCourse((java.lang.Long) 1L);
        feedback26.setIdCourse((java.lang.Long) 10L);
        feedback26.setEvaluationSystem((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum34 = feedback26.getModality();
        feedback26.setMethodology((java.lang.Integer) 100);
        com.engSoft.entities.Feedback feedback37 = new com.engSoft.entities.Feedback();
        java.lang.Integer int38 = feedback37.getEvaluationSystem();
        java.lang.String str39 = feedback37.toString();
        java.lang.Long long40 = feedback37.getId();
        com.engSoft.entities.Feedback feedback41 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum42 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback41.setModality(modalityEnum42);
        feedback37.setModality(modalityEnum42);
        feedback26.setModality(modalityEnum42);
        feedback20.setModality(modalityEnum42);
        feedback6.setModality(modalityEnum42);
        feedback0.setModality(modalityEnum42);
        java.lang.Long long49 = feedback0.getId();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str5, "Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNull(modalityEnum34);
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str39, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long40);
        org.junit.Assert.assertTrue("'" + modalityEnum42 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum42.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(long49);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setEmail("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.String str7 = student0.getEmail();
        student0.setNick("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setBanned((java.lang.Boolean) true);
        student0.setDeletedComments((int) (byte) 100);
        java.lang.String str14 = student0.getName();
        student0.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setEmail("Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}");
        java.lang.String str19 = student0.getEmail();
        java.lang.String str20 = student0.getNick();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}" + "'", str19, "Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = courseDTO5.getName();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        java.lang.String str12 = course11.getInitialTime();
        java.lang.Long long13 = course11.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(long13);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        java.lang.Long long8 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO4.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
        java.lang.String str7 = studentDTO4.getEmail();
        java.lang.String str8 = studentDTO4.getEmail();
        studentDTO4.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= null }");
        teacherDTO1.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str6 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher7 = new com.engSoft.entities.Teacher(teacherDTO1);
        teacher7.setName("Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Long long2 = feedback0.getId();
        feedback0.setCourseware((java.lang.Integer) 1);
        feedback0.setMethodology((java.lang.Integer) 1);
        feedback0.setIdStudent((java.lang.Long) 10L);
        java.lang.String str9 = feedback0.toString();
        java.lang.Integer int10 = feedback0.getWorkload();
        feedback0.setWorkload((java.lang.Integer) 0);
        feedback0.setWorkload((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=10, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=10, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.String str2 = course0.toString();
        java.lang.String str3 = course0.getInitialTime();
        java.lang.String str4 = course0.getFinalTime();
        java.lang.String str5 = course0.getFinalTime();
        java.lang.String str6 = course0.getCode();
        java.lang.Long long7 = course0.getIdTeacher();
        java.lang.Long long8 = course0.getIdTeacher();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments((int) (byte) -1);
        student0.setBanned((java.lang.Boolean) false);
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.Long long11 = student0.getId();
        student0.setNick("Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=-1, courseware=35, modality=null}");
        int int16 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        java.lang.Long long9 = feedbackDTO0.getIdCourse();
        java.lang.Integer int10 = feedbackDTO0.getWorkload();
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
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.types.ModalityEnum modalityEnum9 = feedbackDTO0.getModality();
        java.lang.Integer int10 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback11 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback11.setIdStudent((java.lang.Long) 0L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(modalityEnum9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}");
        java.lang.String str2 = teacher1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35} }" + "'", str2, "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35} }");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        java.lang.Long long4 = feedback0.getIdStudent();
        java.lang.Integer int5 = feedback0.getWorkload();
        java.lang.Integer int6 = feedback0.getCourseware();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedback0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        feedback0.setIdStudent((java.lang.Long) 1L);
        java.lang.String str5 = feedback0.toString();
        java.lang.Long long6 = feedback0.getId();
        feedback0.setPlanning((java.lang.Integer) 10);
        feedback0.setEvaluationSystem((java.lang.Integer) 1);
        feedback0.setWorkload((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int7 = feedbackDTO0.getPlanning();
        java.lang.Integer int8 = feedbackDTO0.getPlanning();
        java.lang.Integer int9 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str3 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str3, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}", "", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        com.engSoft.entities.Course course7 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) (-1L));
        java.lang.String str8 = courseDTO5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}" + "'", str8, "Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setCourseware((java.lang.Integer) 1);
        java.lang.Integer int4 = feedback0.getWorkload();
        java.lang.Integer int5 = feedback0.getEvaluationSystem();
        feedback0.setIdStudent((java.lang.Long) 0L);
        java.lang.Integer int8 = feedback0.getPlanning();
        java.lang.Integer int9 = feedback0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum10 = feedback0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(modalityEnum10);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.String str2 = course0.toString();
        java.lang.String str3 = course0.getInitialTime();
        java.lang.String str4 = course0.getFinalTime();
        java.lang.String str5 = course0.getFinalTime();
        java.lang.String str6 = course0.getFinalTime();
        java.lang.String str7 = course0.toString();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course();
        java.lang.String str9 = course8.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO15 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str16 = courseDTO15.getCode();
        course8.update(courseDTO15, (java.lang.Long) 1L);
        java.lang.String str19 = courseDTO15.getNameTeacher();
        course0.update(courseDTO15, (java.lang.Long) 0L);
        java.lang.String str22 = courseDTO15.getName();
        java.lang.String str23 = courseDTO15.getFinalTime();
        java.lang.String str24 = courseDTO15.getName();
        java.lang.String str25 = courseDTO15.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str19, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str22, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str23, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str24, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.String str2 = course0.toString();
        java.lang.String str3 = course0.getInitialTime();
        java.lang.Long long4 = course0.getIdTeacher();
        com.engSoft.DTO.CourseDTO courseDTO10 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str11 = courseDTO10.getName();
        java.lang.String str12 = courseDTO10.getInitialTime();
        java.lang.String str13 = courseDTO10.getCode();
        java.lang.String str14 = courseDTO10.getName();
        course0.update(courseDTO10, (java.lang.Long) 0L);
        java.lang.String str17 = courseDTO10.getCode();
        com.engSoft.entities.Course course19 = new com.engSoft.entities.Course(courseDTO10, (java.lang.Long) 1L);
        java.lang.Long long20 = course19.getId();
        com.engSoft.entities.Course course21 = new com.engSoft.entities.Course();
        java.lang.String str22 = course21.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO28 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str29 = courseDTO28.getCode();
        course21.update(courseDTO28, (java.lang.Long) 1L);
        java.lang.Long long32 = course21.getId();
        java.lang.String str33 = course21.getName();
        java.lang.String str34 = course21.getCode();
        com.engSoft.DTO.CourseDTO courseDTO40 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str41 = courseDTO40.getCode();
        com.engSoft.entities.Course course43 = new com.engSoft.entities.Course(courseDTO40, (java.lang.Long) 10L);
        course21.update(courseDTO40, (java.lang.Long) 1L);
        java.lang.String str46 = courseDTO40.getNameTeacher();
        java.lang.String str47 = courseDTO40.getNameTeacher();
        course19.update(courseDTO40, (java.lang.Long) 100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(long20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str33, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str46, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str47, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int7 = feedbackDTO0.getPlanning();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        java.lang.Long long10 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback11 = new com.engSoft.entities.Feedback(feedbackDTO0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        com.engSoft.DTO.StudentDTO studentDTO1 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str2 = student0.getNick();
        java.lang.String str3 = student0.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        studentDTO2.setName("Feedback{id=null, idCourse=null, idStudent=10, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.String str5 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str5, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        java.lang.Integer int3 = feedback0.getCourseware();
        feedback0.setIdStudent((java.lang.Long) 1L);
        feedback0.setWorkload((java.lang.Integer) 0);
        feedback0.setCourseware((java.lang.Integer) 0);
        java.lang.String str10 = feedback0.toString();
        com.engSoft.entities.Feedback feedback11 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum12 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback11.setModality(modalityEnum12);
        feedback11.setIdStudent((java.lang.Long) 1L);
        java.lang.String str16 = feedback11.toString();
        feedback11.setIdCourse((java.lang.Long) 0L);
        java.lang.String str19 = feedback11.toString();
        com.engSoft.entities.types.ModalityEnum modalityEnum20 = feedback11.getModality();
        feedback0.setModality(modalityEnum20);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=0, methodology=null, planning=null, evaluationSystem=null, courseware=0, modality=null}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=0, methodology=null, planning=null, evaluationSystem=null, courseware=0, modality=null}");
        org.junit.Assert.assertTrue("'" + modalityEnum12 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum12.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str16, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str19, "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + modalityEnum20 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum20.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
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
        java.lang.String str32 = courseDTO27.getCode();
        java.lang.String str33 = courseDTO27.getInitialTime();
        java.lang.String str34 = courseDTO27.getNameTeacher();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str30, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str32, "Teacher{id=null, name= hi! }");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str33, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        com.engSoft.entities.Course course23 = new com.engSoft.entities.Course(courseDTO16, (java.lang.Long) 10L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        java.lang.String str7 = student0.getNick();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        com.engSoft.DTO.StudentDTO studentDTO10 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        student0.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=-1, planning=null, evaluationSystem=1, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Teacher{id=null, name= null }", "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        com.engSoft.entities.Course course7 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        java.lang.String str8 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str8, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.Long long9 = course8.getId();
        java.lang.Long long10 = course8.getId();
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        course8.update(courseDTO16, (java.lang.Long) 100L);
        java.lang.String str19 = courseDTO16.getFinalTime();
        com.engSoft.entities.Course course21 = new com.engSoft.entities.Course(courseDTO16, (java.lang.Long) (-1L));
        java.lang.Long long22 = course21.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str19, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long22);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = courseDTO5.getName();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        java.lang.String str12 = courseDTO5.getInitialTime();
        java.lang.String str13 = courseDTO5.getCode();
        java.lang.String str14 = courseDTO5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getName();
        java.lang.String str9 = courseDTO7.getInitialTime();
        java.lang.String str10 = courseDTO7.getCode();
        java.lang.String str11 = courseDTO7.getFinalTime();
        java.lang.String str12 = courseDTO7.getInitialTime();
        course0.update(courseDTO7, (java.lang.Long) 10L);
        java.lang.String str15 = courseDTO7.getInitialTime();
        com.engSoft.entities.Course course17 = new com.engSoft.entities.Course(courseDTO7, (java.lang.Long) (-1L));
        com.engSoft.entities.Course course18 = new com.engSoft.entities.Course();
        java.lang.String str19 = course18.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO25 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str26 = courseDTO25.getCode();
        course18.update(courseDTO25, (java.lang.Long) 1L);
        java.lang.String str29 = courseDTO25.getName();
        com.engSoft.entities.Course course31 = new com.engSoft.entities.Course(courseDTO25, (java.lang.Long) 100L);
        com.engSoft.entities.Course course32 = new com.engSoft.entities.Course();
        java.lang.String str33 = course32.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO39 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str40 = courseDTO39.getCode();
        course32.update(courseDTO39, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO48 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str49 = courseDTO48.getInitialTime();
        course32.update(courseDTO48, (java.lang.Long) (-1L));
        java.lang.String str52 = course32.getInitialTime();
        com.engSoft.entities.Course course53 = new com.engSoft.entities.Course();
        java.lang.String str54 = course53.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO60 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str61 = courseDTO60.getCode();
        course53.update(courseDTO60, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO69 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str70 = courseDTO69.getInitialTime();
        course53.update(courseDTO69, (java.lang.Long) (-1L));
        java.lang.String str73 = courseDTO69.getCode();
        course32.update(courseDTO69, (java.lang.Long) 0L);
        course31.update(courseDTO69, (java.lang.Long) 100L);
        java.lang.String str78 = courseDTO69.getFinalTime();
        course17.update(courseDTO69, (java.lang.Long) 10L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str29, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str78, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getName();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        java.lang.String str12 = course11.getInitialTime();
        com.engSoft.entities.Course course13 = new com.engSoft.entities.Course();
        java.lang.String str14 = course13.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO20 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str21 = courseDTO20.getCode();
        course13.update(courseDTO20, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO29 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str30 = courseDTO29.getInitialTime();
        course13.update(courseDTO29, (java.lang.Long) (-1L));
        java.lang.String str33 = courseDTO29.getInitialTime();
        java.lang.String str34 = courseDTO29.getFinalTime();
        course11.update(courseDTO29, (java.lang.Long) 1L);
        java.lang.String str37 = courseDTO29.getFinalTime();
        java.lang.String str38 = courseDTO29.getCode();
        com.engSoft.entities.Course course40 = new com.engSoft.entities.Course(courseDTO29, (java.lang.Long) (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str34, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str37, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Long long5 = feedbackDTO0.getIdStudent();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        java.lang.Long long9 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getPlanning();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long9 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.Long long2 = teacher1.getId();
        java.lang.Long long3 = teacher1.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher1);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO4);
        com.engSoft.entities.Teacher teacher6 = new com.engSoft.entities.Teacher(teacherDTO4);
        com.engSoft.entities.Teacher teacher7 = new com.engSoft.entities.Teacher(teacherDTO4);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        student0.setName("Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}");
        student0.setBanned((java.lang.Boolean) false);
        int int6 = student0.getDeletedComments();
        java.lang.String str7 = student0.getNick();
        java.lang.String str8 = student0.toString();
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null}");
        java.lang.String str11 = student0.toString();
        student0.setEmail("Teacher{id=null, name= hi! }");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str8, "Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null}', isBanned=false, deletedComments=0}" + "'", str11, "Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null}', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Long long1 = feedback0.getIdStudent();
        feedback0.setWorkload((java.lang.Integer) 10);
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.types.ModalityEnum modalityEnum6 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(modalityEnum6);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Student{id=null, name='null', email='null', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Feedback{id=null, idCourse=null, idStudent=10, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.String str6 = courseDTO5.getFinalTime();
        java.lang.String str7 = courseDTO5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=10, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=10, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=10, name='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str7 = student0.getName();
        java.lang.Boolean boolean8 = student0.getBanned();
        student0.setDeletedComments((int) (short) -1);
        java.lang.String str11 = student0.getName();
        java.lang.String str12 = student0.getEmail();
        com.engSoft.DTO.StudentDTO studentDTO13 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO13.setName("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        studentDTO13.setEmail("Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setName("Teacher{id=null, name= null }");
        student0.setId((java.lang.Long) 10L);
        java.lang.String str11 = student0.getNick();
        java.lang.String str12 = student0.getEmail();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str15 = student0.toString();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student{id=10, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str15, "Student{id=10, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.String str4 = student0.toString();
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getEmail();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str4, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher6 = new com.engSoft.entities.Teacher(teacherDTO1);
        teacher6.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str9 = teacher6.toString();
        teacher6.setName("Teacher{id=null, name= Teacher{id=null, name= null } }");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str9, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str7 = student0.toString();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Long long10 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO11 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str12 = studentDTO11.getName();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str7, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name=  }");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.Long long3 = teacher2.getId();
        java.lang.Long long4 = teacher2.getId();
        java.lang.String str5 = teacher2.toString();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name=  } }" + "'", str5, "Teacher{id=null, name= Teacher{id=null, name=  } }");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Teacher{id=null, name= hi! }");
        student0.setId((java.lang.Long) 1L);
        student0.setNick("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Teacher{id=null, name=  }");
        java.lang.String str9 = student0.getNick();
        student0.setBanned((java.lang.Boolean) true);
        student0.setId((java.lang.Long) (-1L));
        student0.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.toString();
        java.lang.String str2 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO3 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str4 = student0.getName();
        int int5 = student0.getDeletedComments();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str1, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}", "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}", "Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.String str6 = courseDTO5.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}" + "'", str6, "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Boolean boolean5 = student0.getBanned();
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = student0.getEmail();
        student0.setNick("Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str11 = student0.toString();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}" + "'", str11, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.Class<?> wildcardClass3 = studentDTO2.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        java.lang.Long long9 = feedbackDTO0.getIdCourse();
        java.lang.Long long10 = feedbackDTO0.getIdStudent();
        java.lang.Integer int11 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
        teacherDTO1.setName("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments((int) (byte) -1);
        student0.setBanned((java.lang.Boolean) false);
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.Long long11 = student0.getId();
        student0.setNick("Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
        student0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        feedback0.setIdStudent((java.lang.Long) 100L);
        java.lang.Integer int4 = feedback0.getCourseware();
        java.lang.Integer int5 = feedback0.getEvaluationSystem();
        com.engSoft.entities.types.ModalityEnum modalityEnum6 = feedback0.getModality();
        feedback0.setIdCourse((java.lang.Long) (-1L));
        java.lang.Integer int9 = feedback0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum6);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedback0.getModality();
        java.lang.Long long3 = feedback0.getIdCourse();
        feedback0.setMethodology((java.lang.Integer) 0);
        java.lang.Long long6 = feedback0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}", "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        java.lang.String str3 = studentDTO2.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student4 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str3, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Teacher{id=null, name= null }", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name=  }", "hi!", "Teacher{id=null, name= hi! }");
        java.lang.String str6 = courseDTO5.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str6, "Teacher{id=null, name= hi! }");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}", "Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}");
        studentDTO2.setEmail("Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        studentDTO2.setName("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Long long2 = feedbackDTO0.getIdStudent();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Integer int4 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("");
        teacher1.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str4 = teacher1.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        java.lang.Integer int8 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
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
        java.lang.Long long10 = feedback6.getIdStudent();
        java.lang.Integer int11 = feedback6.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        java.lang.Integer int2 = feedback0.getPlanning();
        java.lang.Long long3 = feedback0.getId();
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedback0.getModality();
        java.lang.Integer int5 = feedback0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(modalityEnum4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("hi!");
        java.lang.String str2 = teacher1.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Feedback{id=null, idCourse=null, idStudent=null, workload=1, methodology=100, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str2 = teacher1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=1, methodology=100, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }" + "'", str2, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=1, methodology=100, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        java.lang.String str3 = studentDTO2.getName();
        studentDTO2.setName("hi!");
        studentDTO2.setName("Teacher{id=null, name= null }");
        studentDTO2.setEmail("");
        java.lang.String str10 = studentDTO2.getName();
        java.lang.String str11 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Teacher{id=null, name= null }" + "'", str10, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Teacher{id=null, name= null }" + "'", str11, "Teacher{id=null, name= null }");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        teacherDTO1.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        teacherDTO1.setName("Teacher{id=null, name= null }");
        java.lang.String str8 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher9 = new com.engSoft.entities.Teacher(teacherDTO1);
        teacher9.setName("Teacher{id=null, name= Teacher{id=null, name=  } }");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= null }" + "'", str8, "Teacher{id=null, name= null }");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setCourseware((java.lang.Integer) 1);
        java.lang.Integer int4 = feedback0.getWorkload();
        java.lang.String str5 = feedback0.toString();
        feedback0.setWorkload((java.lang.Integer) 0);
        feedback0.setEvaluationSystem((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=1, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}", "Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}", "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null}", "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=PRESENTIAL}");
        java.lang.String str6 = courseDTO5.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}" + "'", str6, "Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        teacher1.setName("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=-1, courseware=35, modality=null}");
        java.lang.String str4 = teacher1.toString();
        java.lang.Class<?> wildcardClass5 = teacher1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=-1, courseware=35, modality=null} }" + "'", str4, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=-1, courseware=35, modality=null} }");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Long long2 = feedback0.getId();
        feedback0.setCourseware((java.lang.Integer) 1);
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedback0.getModality();
        java.lang.String str6 = feedback0.toString();
        java.lang.Integer int7 = feedback0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Integer int3 = feedbackDTO0.getPlanning();
        java.lang.Integer int4 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        com.engSoft.entities.Feedback feedback10 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int11 = feedback10.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.toString();
        java.lang.String str2 = teacher0.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacherDTO3.setName("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Teacher{id=null, name= null }" + "'", str1, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.Long long4 = teacher3.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO5 = new com.engSoft.DTO.TeacherDTO(teacher3);
        java.lang.String str6 = teacher3.toString();
        teacher3.setName("Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        java.lang.String str9 = teacher3.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= null }" + "'", str6, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str7 = student0.getName();
        java.lang.Boolean boolean8 = student0.getBanned();
        student0.setDeletedComments((int) (short) -1);
        java.lang.String str11 = student0.getName();
        java.lang.String str12 = student0.getEmail();
        com.engSoft.DTO.StudentDTO studentDTO13 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str14 = studentDTO13.getEmail();
        java.lang.String str15 = studentDTO13.getEmail();
        java.lang.String str16 = studentDTO13.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str16, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setMethodology((java.lang.Integer) 35);
        feedback0.setIdCourse((java.lang.Long) 1L);
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str3 = student0.getEmail();
        student0.setDeletedComments((int) (short) 0);
        student0.setNick("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str8 = student0.getEmail();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Integer int4 = feedbackDTO0.getPlanning();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
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
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Integer int3 = feedbackDTO0.getPlanning();
        java.lang.Integer int4 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.types.ModalityEnum modalityEnum9 = feedbackDTO0.getModality();
        java.lang.Integer int10 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(modalityEnum9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getWorkload();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum6 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int8 = feedback7.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum6);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str3 = teacher0.getName();
        java.lang.Long long4 = teacher0.getId();
        java.lang.String str5 = teacher0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}");
        java.lang.String str2 = customErrorType1.getErrorMessage();
        java.lang.String str3 = customErrorType1.getErrorMessage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}" + "'", str2, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}" + "'", str3, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Integer int4 = feedbackDTO0.getPlanning();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Student{id=null, name='hi!', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        com.engSoft.entities.Course course10 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str11 = courseDTO5.getName();
        java.lang.String str12 = courseDTO5.getNameTeacher();
        java.lang.String str13 = courseDTO5.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("hi!", "");
        java.lang.String str3 = studentDTO2.getName();
        studentDTO2.setName("Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student6 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=1, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=-1}", "");
        java.lang.Class<?> wildcardClass6 = courseDTO5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setName("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        student0.setName("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        student0.setDeletedComments((int) '4');
        student0.setEmail("Student{id=0, name='Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "", "hi!", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Teacher{id=null, name= null }");
        java.lang.String str6 = courseDTO5.getNameTeacher();
        java.lang.String str7 = courseDTO5.getName();
        java.lang.String str8 = courseDTO5.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str7, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str8, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=PRESENTIAL}", "Student{id=null, name='null', email='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
        java.lang.String str6 = courseDTO5.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}" + "'", str6, "Student{id=null, name='null', email='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        java.lang.Integer int9 = feedbackDTO0.getEvaluationSystem();
        java.lang.Class<?> wildcardClass10 = feedbackDTO0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("hi!");
        java.lang.String str2 = teacher1.getName();
        teacher1.setName("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.Long long5 = teacher1.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO6 = new com.engSoft.DTO.TeacherDTO(teacher1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long4 = teacher0.getId();
        java.lang.String str5 = teacher0.toString();
        java.lang.Long long6 = teacher0.getId();
        java.lang.String str7 = teacher0.getName();
        java.lang.Long long8 = teacher0.getId();
        java.lang.String str9 = teacher0.getName();
        java.lang.String str10 = teacher0.getName();
        java.lang.String str11 = teacher0.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO12 = new com.engSoft.DTO.TeacherDTO(teacher0);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        java.lang.Boolean boolean2 = student0.getBanned();
        java.lang.String str3 = student0.toString();
        java.lang.Long long4 = student0.getId();
        java.lang.String str5 = student0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str3, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Boolean boolean3 = student0.getBanned();
        java.lang.Boolean boolean4 = student0.getBanned();
        java.lang.Boolean boolean5 = student0.getBanned();
        student0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int5 = feedback4.getEvaluationSystem();
        feedback4.setMethodology((java.lang.Integer) 1);
        java.lang.Integer int8 = feedback4.getCourseware();
        feedback4.setMethodology((java.lang.Integer) 97);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        com.engSoft.entities.types.ModalityEnum modalityEnum9 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback10 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int11 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(modalityEnum9);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str7 = student0.toString();
        student0.setDeletedComments((int) (short) 0);
        java.lang.String str10 = student0.getEmail();
        int int11 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str7, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getName();
        java.lang.String str9 = courseDTO5.getInitialTime();
        java.lang.String str10 = courseDTO5.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str7, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str9, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str10, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        feedback0.setIdStudent((java.lang.Long) 100L);
        java.lang.Integer int4 = feedback0.getEvaluationSystem();
        java.lang.Integer int5 = feedback0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        studentDTO2.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = course8.getInitialTime();
        java.lang.String str10 = course8.getFinalTime();
        java.lang.String str11 = course8.getInitialTime();
        java.lang.String str12 = course8.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setId((java.lang.Long) 100L);
        java.lang.Boolean boolean7 = student0.getBanned();
        java.lang.String str8 = student0.getNick();
        student0.setId((java.lang.Long) 0L);
        student0.setId((java.lang.Long) 0L);
        student0.setDeletedComments((int) (byte) -1);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Integer int8 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback9 = new com.engSoft.entities.Feedback(feedbackDTO0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedback6.getModality();
        java.lang.Integer int8 = feedback6.getWorkload();
        java.lang.Integer int9 = feedback6.getCourseware();
        java.lang.String str10 = feedback6.toString();
        feedback6.setIdStudent((java.lang.Long) 1L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=10, planning=null, evaluationSystem=35, courseware=10, modality=null}", "Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback4.setWorkload((java.lang.Integer) 10);
        java.lang.Long long7 = feedback4.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long7 = student0.getId();
        java.lang.String str8 = student0.getName();
        java.lang.Long long9 = student0.getId();
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str2 = customErrorType1.getErrorMessage();
        java.lang.String str3 = customErrorType1.getErrorMessage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}", "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=-1}", "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null}", "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str6 = courseDTO5.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }" + "'", str6, "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=0, modality=null}");
        java.lang.String str3 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=0, modality=null}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=0, modality=null}");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        java.lang.String str7 = student0.getNick();
        java.lang.Long long8 = student0.getId();
        java.lang.String str9 = student0.getName();
        student0.setName("Student{id=-1, name='null', email='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Integer int4 = feedbackDTO0.getWorkload();
        java.lang.Integer int5 = feedbackDTO0.getPlanning();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacher0.getName();
        java.lang.String str5 = teacher0.toString();
        java.lang.String str6 = teacher0.getName();
        java.lang.String str7 = teacher0.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO8 = new com.engSoft.DTO.TeacherDTO(teacher0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str7, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getMethodology();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=1, planning=null, evaluationSystem=10, courseware=1, modality=REMOTE}");
        teacherDTO1.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=10, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.String str4 = teacherDTO1.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=10, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=10, planning=null, evaluationSystem=null, courseware=1, modality=null}");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
        java.lang.String str43 = course0.getInitialTime();
        java.lang.String str44 = course0.getInitialTime();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=1, methodology=0, planning=10, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=1, methodology=100, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}", "Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}", "Student{id=100, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setCourseware((java.lang.Integer) 1);
        java.lang.Integer int4 = feedback0.getWorkload();
        feedback0.setCourseware((java.lang.Integer) 100);
        java.lang.Integer int7 = feedback0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setName("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        student0.setName("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        student0.setDeletedComments((int) '#');
        student0.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=null, deletedComments=10}");
        student0.setName("Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(0);
        java.lang.String str9 = student0.toString();
        java.lang.String str10 = student0.getEmail();
        student0.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        student0.setBanned((java.lang.Boolean) true);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL} }", "", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}");
        java.lang.String str6 = courseDTO5.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL} }");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Teacher{id=null, name= null }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        studentDTO2.setName("Teacher{id=null, name= null }");
        java.lang.String str5 = studentDTO2.getName();
        studentDTO2.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
        studentDTO2.setName("Student{id=null, name='null', email='null', nick='', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str2 = customErrorType1.getErrorMessage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str5 = studentDTO2.getEmail();
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        studentDTO2.setName("Teacher{id=null, name= null }");
        studentDTO2.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        studentDTO2.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        studentDTO2.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        studentDTO2.setEmail("Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}");
        java.lang.String str18 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}" + "'", str18, "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        java.lang.String str7 = student0.getNick();
        java.lang.Long long8 = student0.getId();
        student0.setEmail("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        student0.setEmail("");
        int int13 = student0.getDeletedComments();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.String str4 = student0.toString();
        student0.setNick("Teacher{id=null, name=  }");
        java.lang.String str7 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO8.setEmail("Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }");
        java.lang.String str11 = studentDTO8.getEmail();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str4, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='Teacher{id=null, name=  }', isBanned=true, deletedComments=0}" + "'", str7, "Student{id=null, name='null', email='null', nick='Teacher{id=null, name=  }', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }" + "'", str11, "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=1, name='null', email='null', nick='hi!', isBanned=false, deletedComments=0}", "Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=10, evaluationSystem=1, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long5 = feedbackDTO0.getIdStudent();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("", "Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }");
        studentDTO2.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        studentDTO2.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str5 = studentDTO2.getEmail();
        studentDTO2.setName("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=1, methodology=100, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str5, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        java.lang.String str5 = student0.toString();
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        int int8 = student0.getDeletedComments();
        student0.setDeletedComments((-1));
        student0.setBanned((java.lang.Boolean) true);
        student0.setId((java.lang.Long) 0L);
        int int15 = student0.getDeletedComments();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 100);
        java.lang.Integer int8 = feedback0.getMethodology();
        java.lang.Long long9 = feedback0.getIdStudent();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setCourseware((java.lang.Integer) 35);
        feedback0.setPlanning((java.lang.Integer) (-1));
        feedback0.setPlanning((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO3);
        java.lang.String str5 = teacher4.toString();
        java.lang.String str6 = teacher4.getName();
        java.lang.String str7 = teacher4.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= null }" + "'", str7, "Teacher{id=null, name= null }");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.Long long1 = course0.getId();
        java.lang.String str2 = course0.getCode();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getName();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='1', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=-1, planning=null, evaluationSystem=1, courseware=1, modality=REMOTE}");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
        feedback6.setIdCourse((java.lang.Long) (-1L));
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
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        java.lang.Integer int6 = feedback0.getWorkload();
        java.lang.Integer int7 = feedback0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Integer int2 = feedback0.getWorkload();
        java.lang.Integer int3 = feedback0.getWorkload();
        java.lang.Integer int4 = feedback0.getWorkload();
        java.lang.Integer int5 = feedback0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setName("Teacher{id=null, name= null }");
        java.lang.String str7 = student0.getEmail();
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
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
        java.lang.String str61 = courseDTO53.getCode();
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
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str61, "Teacher{id=null, name= hi! }");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        student0.setEmail("Teacher{id=null, name= hi! }");
        java.lang.String str11 = student0.toString();
        student0.setDeletedComments((int) (short) 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}" + "'", str11, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str3 = student0.getEmail();
        student0.setNick("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setDeletedComments(0);
        student0.setBanned((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setEmail("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.String str7 = student0.getEmail();
        student0.setNick("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setBanned((java.lang.Boolean) true);
        student0.setDeletedComments((int) (byte) 100);
        java.lang.String str14 = student0.getName();
        student0.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str19 = student0.toString();
        student0.setDeletedComments((int) 'a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', isBanned=true, deletedComments=100}" + "'", str19, "Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', isBanned=true, deletedComments=100}");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getInitialTime();
        course0.update(courseDTO16, (java.lang.Long) (-1L));
        java.lang.String str20 = course0.getInitialTime();
        com.engSoft.entities.Course course21 = new com.engSoft.entities.Course();
        java.lang.String str22 = course21.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO28 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str29 = courseDTO28.getCode();
        course21.update(courseDTO28, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO37 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str38 = courseDTO37.getInitialTime();
        course21.update(courseDTO37, (java.lang.Long) (-1L));
        java.lang.String str41 = courseDTO37.getCode();
        course0.update(courseDTO37, (java.lang.Long) 0L);
        com.engSoft.entities.Course course45 = new com.engSoft.entities.Course(courseDTO37, (java.lang.Long) (-1L));
        java.lang.String str46 = courseDTO37.getFinalTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str46, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        java.lang.Boolean boolean2 = student0.getBanned();
        java.lang.String str3 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str5 = student0.getNick();
        java.lang.Boolean boolean6 = student0.getBanned();
        java.lang.String str7 = student0.getEmail();
        java.lang.String str8 = student0.getNick();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=0, evaluationSystem=10, courseware=1, modality=null}", "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }", "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}", "Teacher{id=null, name= Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0} }", "Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=10, evaluationSystem=1, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
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
        com.engSoft.entities.Course course26 = new com.engSoft.entities.Course(courseDTO16, (java.lang.Long) 100L);
        com.engSoft.entities.Course course28 = new com.engSoft.entities.Course(courseDTO16, (java.lang.Long) 1L);
        java.lang.String str29 = course28.toString();
        com.engSoft.DTO.CourseDTO courseDTO35 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str36 = courseDTO35.getName();
        java.lang.String str37 = courseDTO35.getInitialTime();
        java.lang.String str38 = courseDTO35.getCode();
        java.lang.String str39 = courseDTO35.getFinalTime();
        java.lang.String str40 = courseDTO35.getName();
        java.lang.String str41 = courseDTO35.getName();
        java.lang.String str42 = courseDTO35.getInitialTime();
        java.lang.String str43 = courseDTO35.getCode();
        course28.update(courseDTO35, (java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str22, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str23, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str24, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str29, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str36, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str39, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str40, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str41, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.String str5 = student0.getName();
        student0.setBanned((java.lang.Boolean) true);
        student0.setEmail("");
        java.lang.Boolean boolean10 = student0.getBanned();
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getMethodology();
        java.lang.Integer int2 = feedbackDTO0.getCourseware();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Class<?> wildcardClass5 = feedbackDTO0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        java.lang.Long long4 = student0.getId();
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.Long long7 = student0.getId();
        java.lang.Boolean boolean8 = student0.getBanned();
        student0.setDeletedComments((int) (byte) 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str3 = teacher0.getName();
        java.lang.Long long4 = teacher0.getId();
        java.lang.Long long5 = teacher0.getId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("hi!");
        java.lang.String str2 = teacher1.getName();
        java.lang.Long long3 = teacher1.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher1);
        teacherDTO4.setName("Course{id=null, name='Student{id=null, name='null', email='null', nick='Teacher{id=null, name=  }', isBanned=true, deletedComments=0}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='-1', initialTime='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', finalTime='Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}'}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedback6.getModality();
        java.lang.Integer int8 = feedback6.getPlanning();
        feedback6.setIdStudent((java.lang.Long) 0L);
        java.lang.Integer int11 = feedback6.getCourseware();
        java.lang.Integer int12 = feedback6.getMethodology();
        java.lang.Integer int13 = feedback6.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
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
        java.lang.String str32 = courseDTO21.getFinalTime();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str32, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
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
        java.lang.String str31 = course0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str31, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Student{id=null, name='null', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=false, deletedComments=-1}");
        java.lang.String str2 = customErrorType1.getErrorMessage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=null, name='null', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=false, deletedComments=-1}" + "'", str2, "Student{id=null, name='null', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=false, deletedComments=-1}");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        java.lang.String str7 = student0.getNick();
        java.lang.Long long8 = student0.getId();
        java.lang.String str9 = student0.getNick();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str12 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO13 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str9, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}" + "'", str12, "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
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
        java.lang.Integer int14 = feedback6.getWorkload();
        feedback6.setWorkload((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum17 = feedback6.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(modalityEnum17);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str3 = student0.getEmail();
        java.lang.Boolean boolean4 = student0.getBanned();
        com.engSoft.DTO.StudentDTO studentDTO5 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = course8.getInitialTime();
        java.lang.String str10 = course8.getCode();
        java.lang.String str11 = course8.getInitialTime();
        java.lang.String str12 = course8.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.Long long9 = course8.getId();
        java.lang.Long long10 = course8.getId();
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        course8.update(courseDTO16, (java.lang.Long) 100L);
        java.lang.String str19 = course8.toString();
        java.lang.String str20 = course8.getFinalTime();
        java.lang.String str21 = course8.getName();
        java.lang.String str22 = course8.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str19, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str20, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str22, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        int int6 = student0.getDeletedComments();
        student0.setId((java.lang.Long) (-1L));
        int int9 = student0.getDeletedComments();
        java.lang.String str10 = student0.getNick();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=0, evaluationSystem=10, courseware=1, modality=null}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=null}");
        studentDTO2.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str5 = studentDTO2.getName();
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=10, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setCourseware((java.lang.Integer) 1);
        java.lang.Integer int4 = feedback0.getWorkload();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback();
        java.lang.Integer int6 = feedback5.getEvaluationSystem();
        feedback5.setIdCourse((java.lang.Long) 1L);
        feedback5.setPlanning((java.lang.Integer) 1);
        feedback5.setPlanning((java.lang.Integer) 10);
        feedback5.setIdStudent((java.lang.Long) 0L);
        feedback5.setIdCourse((java.lang.Long) 100L);
        com.engSoft.entities.Feedback feedback17 = new com.engSoft.entities.Feedback();
        java.lang.Integer int18 = feedback17.getEvaluationSystem();
        feedback17.setIdCourse((java.lang.Long) 1L);
        feedback17.setPlanning((java.lang.Integer) 1);
        feedback17.setPlanning((java.lang.Integer) 10);
        feedback17.setMethodology((java.lang.Integer) 0);
        com.engSoft.entities.Feedback feedback27 = new com.engSoft.entities.Feedback();
        java.lang.Integer int28 = feedback27.getEvaluationSystem();
        feedback27.setIdCourse((java.lang.Long) 1L);
        com.engSoft.entities.Feedback feedback31 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum32 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback31.setModality(modalityEnum32);
        feedback27.setModality(modalityEnum32);
        feedback17.setModality(modalityEnum32);
        feedback5.setModality(modalityEnum32);
        feedback0.setModality(modalityEnum32);
        java.lang.Long long38 = feedback0.getId();
        java.lang.Long long39 = feedback0.getIdCourse();
        feedback0.setWorkload((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertTrue("'" + modalityEnum32 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum32.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(long38);
        org.junit.Assert.assertNull(long39);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getName();
        com.engSoft.entities.Course course12 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.Long long13 = course12.getId();
        java.lang.String str14 = course12.getName();
        java.lang.String str15 = course12.toString();
        java.lang.String str16 = course12.getInitialTime();
        java.lang.Long long17 = course12.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str15, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(long17);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
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
        java.lang.String str17 = courseDTO5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str16, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str17, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedback0.getModality();
        java.lang.Integer int3 = feedback0.getMethodology();
        java.lang.Integer int4 = feedback0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Teacher{id=null, name= null }", "hi!");
        studentDTO2.setName("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        studentDTO2.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=0, modality=null}");
        java.lang.String str7 = studentDTO2.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student8 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
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
        java.lang.String str24 = courseDTO16.getInitialTime();
        java.lang.String str25 = courseDTO16.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str22, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str23, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str3 = student0.getEmail();
        student0.setDeletedComments((int) (short) 0);
        java.lang.Boolean boolean6 = student0.getBanned();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= null }");
        java.lang.String str2 = teacher1.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name= null } }" + "'", str2, "Teacher{id=null, name= Teacher{id=null, name= null } }");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}");
        student0.setId((java.lang.Long) 10L);
        java.lang.String str13 = student0.getName();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
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
        java.lang.String str25 = courseDTO19.getNameTeacher();
        com.engSoft.entities.Course course27 = new com.engSoft.entities.Course(courseDTO19, (java.lang.Long) 100L);
        com.engSoft.DTO.CourseDTO courseDTO33 = new com.engSoft.DTO.CourseDTO("Teacher{id=null, name= null }", "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str34 = courseDTO33.getFinalTime();
        java.lang.String str35 = courseDTO33.getInitialTime();
        course27.update(courseDTO33, (java.lang.Long) 10L);
        java.lang.String str38 = course27.toString();
        java.lang.String str39 = course27.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str25, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str34, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str35, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Course{id=null, name='Teacher{id=null, name= null }', code='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', idTeacher='10', initialTime='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', finalTime='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}'}" + "'", str38, "Course{id=null, name='Teacher{id=null, name= null }', code='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', idTeacher='10', initialTime='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', finalTime='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}'}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Teacher{id=null, name= null }" + "'", str39, "Teacher{id=null, name= null }");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        java.lang.String str2 = teacher1.toString();
        teacher1.setName("Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', isBanned=true, deletedComments=100}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }" + "'", str2, "Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.String str2 = course0.toString();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str9 = courseDTO8.getName();
        java.lang.String str10 = courseDTO8.getInitialTime();
        java.lang.String str11 = courseDTO8.getCode();
        java.lang.String str12 = courseDTO8.getFinalTime();
        course0.update(courseDTO8, (java.lang.Long) 10L);
        java.lang.String str15 = courseDTO8.getName();
        java.lang.String str16 = courseDTO8.getFinalTime();
        java.lang.String str17 = courseDTO8.getFinalTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str16, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str17, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getCode();
        java.lang.String str5 = course0.getInitialTime();
        java.lang.String str6 = course0.toString();
        java.lang.String str7 = course0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str6, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        teacherDTO1.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}");
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str5 = teacherDTO1.getName();
        teacherDTO1.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=100, planning=10, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        studentDTO2.setEmail("Teacher{id=null, name=  }");
        java.lang.String str5 = studentDTO2.getEmail();
        java.lang.String str6 = studentDTO2.getEmail();
        java.lang.String str7 = studentDTO2.getName();
        studentDTO2.setEmail("Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35} }");
        studentDTO2.setEmail("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name=  }" + "'", str5, "Teacher{id=null, name=  }");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name=  }" + "'", str6, "Teacher{id=null, name=  }");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        feedback0.setIdStudent((java.lang.Long) 1L);
        java.lang.String str5 = feedback0.toString();
        java.lang.Long long6 = feedback0.getId();
        feedback0.setEvaluationSystem((java.lang.Integer) 10);
        feedback0.setWorkload((java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Long long2 = feedback0.getId();
        feedback0.setCourseware((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long4 = teacher0.getId();
        java.lang.String str5 = teacher0.toString();
        java.lang.Long long6 = teacher0.getId();
        java.lang.String str7 = teacher0.getName();
        java.lang.Long long8 = teacher0.getId();
        java.lang.String str9 = teacher0.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO10 = new com.engSoft.DTO.TeacherDTO(teacher0);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setId((java.lang.Long) 100L);
        java.lang.Boolean boolean7 = student0.getBanned();
        student0.setId((java.lang.Long) 100L);
        int int10 = student0.getDeletedComments();
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='null', isBanned=null, deletedComments=0}", "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Long long2 = feedbackDTO0.getIdStudent();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Integer int4 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setDeletedComments(10);
        java.lang.String str6 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str6, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getFinalTime();
        java.lang.String str5 = course0.getFinalTime();
        java.lang.String str6 = course0.getFinalTime();
        java.lang.String str7 = course0.getInitialTime();
        java.lang.String str8 = course0.getCode();
        java.lang.Long long9 = course0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("hi!", "");
        java.lang.String str3 = studentDTO2.getName();
        java.lang.String str4 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        int int2 = student0.getDeletedComments();
        java.lang.String str3 = student0.toString();
        java.lang.String str4 = student0.toString();
        java.lang.String str5 = student0.getName();
        java.lang.String str6 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO7.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str3, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str4, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str6, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.Class<?> wildcardClass2 = customErrorType1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getFinalTime();
        java.lang.String str5 = course0.getFinalTime();
        java.lang.String str6 = course0.getFinalTime();
        java.lang.String str7 = course0.getInitialTime();
        java.lang.String str8 = course0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.String str2 = course0.getCode();
        java.lang.String str3 = course0.getCode();
        java.lang.String str4 = course0.getInitialTime();
        java.lang.String str5 = course0.getFinalTime();
        java.lang.String str6 = course0.getCode();
        java.lang.String str7 = course0.getFinalTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.Long long4 = teacher0.getId();
        teacher0.setName("Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }");
        teacher0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getNick();
        java.lang.String str7 = student0.getNick();
        int int8 = student0.getDeletedComments();
        student0.setDeletedComments((-1));
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str13 = student0.getEmail();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}", "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.String str5 = studentDTO2.getEmail();
        studentDTO2.setEmail("Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Teacher{id=null, name=  }", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getFinalTime();
        java.lang.Class<?> wildcardClass8 = courseDTO5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.Long long2 = course0.getId();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str9 = courseDTO8.getCode();
        course0.update(courseDTO8, (java.lang.Long) 0L);
        com.engSoft.entities.Course course13 = new com.engSoft.entities.Course(courseDTO8, (java.lang.Long) 0L);
        java.lang.String str14 = courseDTO8.getCode();
        java.lang.String str15 = courseDTO8.getNameTeacher();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
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
        java.lang.String str16 = course0.getCode();
        java.lang.String str17 = course0.getFinalTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str13, "Teacher{id=null, name= hi! }");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str16, "Teacher{id=null, name= hi! }");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str17, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        java.lang.Long long9 = feedbackDTO0.getIdCourse();
        java.lang.Long long10 = feedbackDTO0.getIdCourse();
        java.lang.Integer int11 = feedbackDTO0.getMethodology();
        java.lang.Long long12 = feedbackDTO0.getIdCourse();
        java.lang.Integer int13 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        java.lang.Integer int8 = feedbackDTO0.getMethodology();
        java.lang.Integer int9 = feedbackDTO0.getPlanning();
        java.lang.Integer int10 = feedbackDTO0.getEvaluationSystem();
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
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getPlanning();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.Long long2 = teacher1.getId();
        java.lang.Long long3 = teacher1.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher1);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO4);
        teacherDTO4.setName("");
        com.engSoft.entities.Teacher teacher8 = new com.engSoft.entities.Teacher(teacherDTO4);
        java.lang.Long long9 = teacher8.getId();
        java.lang.String str10 = teacher8.toString();
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Teacher{id=null, name=  }" + "'", str10, "Teacher{id=null, name=  }");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setIdCourse((java.lang.Long) 10L);
        java.lang.Integer int6 = feedback0.getCourseware();
        feedback0.setIdStudent((java.lang.Long) 0L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        studentDTO2.setName("Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str5 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        java.lang.String str7 = student0.getNick();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        com.engSoft.DTO.StudentDTO studentDTO10 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str11 = student0.getEmail();
        java.lang.String str12 = student0.toString();
        java.lang.Boolean boolean13 = student0.getBanned();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=null, deletedComments=35}" + "'", str12, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=null, deletedComments=35}");
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        teacher1.setName("Student{id=null, name='hi!', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str9 = student0.getEmail();
        java.lang.String str10 = student0.toString();
        student0.setEmail("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.Boolean boolean13 = student0.getBanned();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}" + "'", str10, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}");
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setCourseware((java.lang.Integer) 1);
        java.lang.Integer int4 = feedback0.getWorkload();
        feedback0.setCourseware((java.lang.Integer) 10);
        feedback0.setCourseware((java.lang.Integer) 10);
        feedback0.setPlanning((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO2);
        teacher3.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        java.lang.Long long6 = teacher3.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher3);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.String str2 = course0.getCode();
        java.lang.String str3 = course0.getCode();
        java.lang.String str4 = course0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str4, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}", "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        studentDTO2.setName("Teacher{id=null, name= Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0} }");
        java.lang.String str5 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0} }" + "'", str5, "Teacher{id=null, name= Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0} }");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getNick();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str10 = student0.getName();
        student0.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        int int13 = student0.getDeletedComments();
        java.lang.Long long14 = student0.getId();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(modalityEnum5);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= Teacher{id=null, name= null } }");
        java.lang.String str2 = teacher1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name= Teacher{id=null, name= null } } }" + "'", str2, "Teacher{id=null, name= Teacher{id=null, name= Teacher{id=null, name= null } } }");
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=97}");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Integer int2 = feedback0.getWorkload();
        java.lang.String str3 = feedback0.toString();
        java.lang.Long long4 = feedback0.getId();
        java.lang.Integer int5 = feedback0.getCourseware();
        feedback0.setWorkload((java.lang.Integer) 1);
        java.lang.Long long8 = feedback0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Long long5 = feedbackDTO0.getIdStudent();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.types.ModalityEnum modalityEnum9 = feedbackDTO0.getModality();
        java.lang.Integer int10 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(modalityEnum9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}", "Feedback{id=null, idCourse=null, idStudent=10, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Feedback{id=null, idCourse=null, idStudent=10, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
        java.lang.String str6 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=10, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=10, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        java.lang.Long long2 = teacher1.getId();
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getNameTeacher();
        java.lang.String str11 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        int int9 = student0.getDeletedComments();
        student0.setBanned((java.lang.Boolean) false);
        student0.setDeletedComments((int) (byte) 100);
        java.lang.String str14 = student0.getNick();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Student{id=-1, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
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
        java.lang.String str29 = courseDTO19.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str20, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getPlanning();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setDeletedComments((int) (short) -1);
        student0.setBanned((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str2 = customErrorType1.getErrorMessage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        student0.setNick("");
        student0.setEmail("Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}");
        java.lang.Long long8 = student0.getId();
        java.lang.String str9 = student0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='hi!', email='Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}', nick='', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=null, name='hi!', email='Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}', nick='', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
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
        java.lang.String str22 = course0.toString();
        java.lang.String str23 = course0.getCode();
        java.lang.String str24 = course0.getCode();
        java.lang.String str25 = course0.toString();
        java.lang.String str26 = course0.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str22, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str25, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        java.lang.Integer int2 = feedback0.getPlanning();
        java.lang.String str3 = feedback0.toString();
        java.lang.Integer int4 = feedback0.getCourseware();
        java.lang.Integer int5 = feedback0.getMethodology();
        java.lang.Integer int6 = feedback0.getEvaluationSystem();
        java.lang.Integer int7 = feedback0.getEvaluationSystem();
        java.lang.Long long8 = feedback0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getPlanning();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Long long2 = feedbackDTO0.getIdStudent();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Integer int4 = feedbackDTO0.getMethodology();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        int int6 = student0.getDeletedComments();
        java.lang.Boolean boolean7 = student0.getBanned();
        java.lang.String str8 = student0.getEmail();
        java.lang.String str9 = student0.toString();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=null}");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        feedback0.setIdStudent((java.lang.Long) 1L);
        java.lang.String str5 = feedback0.toString();
        feedback0.setPlanning((java.lang.Integer) 10);
        java.lang.Long long8 = feedback0.getId();
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = courseDTO5.getNameTeacher();
        java.lang.String str7 = courseDTO5.getCode();
        java.lang.String str8 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}" + "'", str6, "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}" + "'", str8, "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getName();
        java.lang.String str9 = courseDTO5.getInitialTime();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        java.lang.String str12 = courseDTO5.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str7, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str9, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str12, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str3 = studentDTO2.getName();
        java.lang.String str4 = studentDTO2.getName();
        java.lang.String str5 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str5 = teacherDTO4.getName();
        com.engSoft.entities.Teacher teacher6 = new com.engSoft.entities.Teacher(teacherDTO4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str6 = courseDTO5.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str6, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback9 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback9.setPlanning((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(modalityEnum8);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        java.lang.String str7 = student0.getNick();
        java.lang.Long long8 = student0.getId();
        java.lang.String str9 = student0.getName();
        java.lang.String str10 = student0.toString();
        java.lang.Boolean boolean11 = student0.getBanned();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=0}" + "'", str10, "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Teacher{id=null, name= hi! }");
        java.lang.Long long7 = student0.getId();
        student0.setName("Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
        student0.setNick("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str12 = student0.toString();
        java.lang.String str13 = student0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}" + "'", str12, "Student{id=null, name='Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}" + "'", str13, "Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str6 = teacher5.toString();
        java.lang.String str7 = teacher5.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO8 = new com.engSoft.DTO.TeacherDTO(teacher5);
        com.engSoft.entities.Teacher teacher9 = new com.engSoft.entities.Teacher(teacherDTO8);
        teacher9.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=35, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}");
        com.engSoft.DTO.TeacherDTO teacherDTO12 = new com.engSoft.DTO.TeacherDTO(teacher9);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= null }" + "'", str6, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=null}", "Student{id=null, name='null', email='null', nick='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}', isBanned=true, deletedComments=0}");
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student3 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setEvaluationSystem((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedback0.getModality();
        feedback0.setWorkload((java.lang.Integer) 10);
        feedback0.setIdStudent((java.lang.Long) 0L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum8);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Long long1 = feedback0.getIdStudent();
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setIdCourse((java.lang.Long) 10L);
        java.lang.Long long6 = feedback0.getId();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}", "Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}", "Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getFinalTime();
        java.lang.String str9 = courseDTO5.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}" + "'", str7, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str8, "Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Teacher{id=null, name= hi! }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        com.engSoft.entities.Course course7 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        java.lang.String str8 = courseDTO5.getInitialTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str8, "Teacher{id=null, name= hi! }");
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getInitialTime();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "", "hi!", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Teacher{id=null, name= null }");
        java.lang.String str9 = courseDTO8.getName();
        course0.update(courseDTO8, (java.lang.Long) (-1L));
        java.lang.String str12 = course0.toString();
        com.engSoft.DTO.CourseDTO courseDTO18 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str19 = courseDTO18.getCode();
        com.engSoft.entities.Course course21 = new com.engSoft.entities.Course(courseDTO18, (java.lang.Long) 10L);
        com.engSoft.entities.Course course23 = new com.engSoft.entities.Course(courseDTO18, (java.lang.Long) 10L);
        java.lang.String str24 = courseDTO18.getName();
        course0.update(courseDTO18, (java.lang.Long) 0L);
        java.lang.String str27 = courseDTO18.getNameTeacher();
        java.lang.String str28 = courseDTO18.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str9, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}" + "'", str12, "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str24, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str27, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=null, name='null', email='null', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}");
        java.lang.String str2 = teacherDTO1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=null, name='null', email='null', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}" + "'", str2, "Student{id=null, name='null', email='null', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("hi!");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.Long long3 = teacher2.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher2);
        teacherDTO4.setName("Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}");
        java.lang.String str7 = teacherDTO4.getName();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str7, "Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("hi!");
        java.lang.String str2 = teacher1.getName();
        java.lang.Long long3 = teacher1.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher1);
        teacher1.setName("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Long long2 = feedbackDTO0.getIdStudent();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Integer int4 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        java.lang.Long long8 = feedbackDTO0.getIdCourse();
        java.lang.Integer int9 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.Feedback feedback10 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum11 = feedbackDTO0.getModality();
        com.engSoft.entities.types.ModalityEnum modalityEnum12 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(modalityEnum11);
        org.junit.Assert.assertNull(modalityEnum12);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        student0.setNick("");
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getInitialTime();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "", "hi!", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Teacher{id=null, name= null }");
        java.lang.String str9 = courseDTO8.getName();
        course0.update(courseDTO8, (java.lang.Long) (-1L));
        java.lang.String str12 = course0.toString();
        com.engSoft.DTO.CourseDTO courseDTO18 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str19 = courseDTO18.getCode();
        com.engSoft.entities.Course course21 = new com.engSoft.entities.Course(courseDTO18, (java.lang.Long) 10L);
        com.engSoft.entities.Course course23 = new com.engSoft.entities.Course(courseDTO18, (java.lang.Long) 10L);
        java.lang.String str24 = courseDTO18.getName();
        course0.update(courseDTO18, (java.lang.Long) 0L);
        java.lang.String str27 = courseDTO18.getFinalTime();
        java.lang.String str28 = courseDTO18.getName();
        com.engSoft.entities.Course course30 = new com.engSoft.entities.Course(courseDTO18, (java.lang.Long) 1L);
        java.lang.String str31 = courseDTO18.getFinalTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str9, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}" + "'", str12, "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str24, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str27, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str28, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str31, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
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
        java.lang.Long long10 = feedback6.getIdStudent();
        java.lang.Long long11 = feedback6.getId();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str5 = teacher4.toString();
        teacher4.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        com.engSoft.DTO.TeacherDTO teacherDTO8 = new com.engSoft.DTO.TeacherDTO(teacher4);
        com.engSoft.DTO.TeacherDTO teacherDTO9 = new com.engSoft.DTO.TeacherDTO(teacher4);
        teacher4.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=10}', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        java.lang.Integer int9 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getPlanning();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedbackDTO0.getModality();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(modalityEnum4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.String str2 = course0.toString();
        java.lang.String str3 = course0.getInitialTime();
        java.lang.Long long4 = course0.getIdTeacher();
        java.lang.String str5 = course0.getCode();
        java.lang.Long long6 = course0.getIdTeacher();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Boolean boolean5 = student0.getBanned();
        int int6 = student0.getDeletedComments();
        java.lang.Long long7 = student0.getId();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long10 = student0.getId();
        student0.setNick("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=100, evaluationSystem=null, courseware=-1, modality=null}");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Long long2 = feedbackDTO0.getIdStudent();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedbackDTO0.getModality();
        java.lang.Long long5 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum6 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(modalityEnum4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(modalityEnum6);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        java.lang.String str7 = student0.getNick();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Boolean boolean10 = student0.getBanned();
        java.lang.String str11 = student0.getName();
        java.lang.Long long12 = student0.getId();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "", "hi!", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Teacher{id=null, name= null }");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getNameTeacher();
        java.lang.String str8 = courseDTO5.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str6, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str8, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getFinalTime();
        java.lang.String str5 = course0.getCode();
        java.lang.String str6 = course0.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setName("Teacher{id=null, name= null }");
        student0.setName("");
        student0.setEmail("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
        com.engSoft.DTO.StudentDTO studentDTO13 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        int int2 = student0.getDeletedComments();
        java.lang.String str3 = student0.toString();
        student0.setNick("Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str3, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
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
        com.engSoft.entities.types.ModalityEnum modalityEnum14 = feedback6.getModality();
        java.lang.Integer int15 = feedback6.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(modalityEnum14);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback6.setIdCourse((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getInitialTime();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "", "hi!", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Teacher{id=null, name= null }");
        java.lang.String str9 = courseDTO8.getName();
        course0.update(courseDTO8, (java.lang.Long) (-1L));
        java.lang.Long long12 = course0.getId();
        java.lang.String str13 = course0.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str9, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        com.engSoft.entities.Feedback feedback9 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback10 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int11 = feedbackDTO0.getMethodology();
        java.lang.Integer int12 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback13 = new com.engSoft.entities.Feedback(feedbackDTO0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 100);
        java.lang.Integer int8 = feedback0.getMethodology();
        feedback0.setPlanning((java.lang.Integer) 0);
        java.lang.Integer int11 = feedback0.getEvaluationSystem();
        feedback0.setWorkload((java.lang.Integer) 10);
        java.lang.String str14 = feedback0.toString();
        com.engSoft.entities.types.ModalityEnum modalityEnum15 = feedback0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=10, methodology=null, planning=0, evaluationSystem=null, courseware=null, modality=null}" + "'", str14, "Feedback{id=null, idCourse=1, idStudent=null, workload=10, methodology=null, planning=0, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(modalityEnum15);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean7 = student0.getBanned();
        student0.setNick("Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        java.lang.String str10 = student0.getEmail();
        java.lang.String str11 = student0.getName();
        student0.setEmail("");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=10, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Teacher{id=null, name= Teacher{id=null, name=  } }', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str5 = studentDTO2.getEmail();
        java.lang.String str6 = studentDTO2.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student7 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=10}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}", "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setMethodology((java.lang.Integer) 97);
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacher0.getName();
        java.lang.Long long5 = teacher0.getId();
        java.lang.String str6 = teacher0.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO8 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str9 = teacher0.toString();
        teacher0.setName("Student{id=null, name='null', email='null', nick='', isBanned=null, deletedComments=0}");
        java.lang.String str12 = teacher0.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str9, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='', isBanned=null, deletedComments=0} }" + "'", str12, "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='', isBanned=null, deletedComments=0} }");
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("hi!", "");
        java.lang.String str3 = studentDTO2.getName();
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        studentDTO2.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback8 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback8.setIdStudent((java.lang.Long) 100L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
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
        com.engSoft.entities.Course course34 = new com.engSoft.entities.Course(courseDTO25, (java.lang.Long) 0L);
        course8.update(courseDTO25, (java.lang.Long) 10L);
        java.lang.String str37 = courseDTO25.getNameTeacher();
        com.engSoft.entities.Course course39 = new com.engSoft.entities.Course(courseDTO25, (java.lang.Long) (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str31, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str37, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        java.lang.Long long4 = feedback0.getIdStudent();
        java.lang.Long long5 = feedback0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        java.lang.String str6 = courseDTO5.getNameTeacher();
        java.lang.String str7 = courseDTO5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str6, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getInitialTime();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "", "hi!", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Teacher{id=null, name= null }");
        java.lang.String str9 = courseDTO8.getName();
        course0.update(courseDTO8, (java.lang.Long) (-1L));
        java.lang.String str12 = course0.toString();
        com.engSoft.DTO.CourseDTO courseDTO18 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str19 = courseDTO18.getCode();
        com.engSoft.entities.Course course21 = new com.engSoft.entities.Course(courseDTO18, (java.lang.Long) 10L);
        com.engSoft.entities.Course course23 = new com.engSoft.entities.Course(courseDTO18, (java.lang.Long) 10L);
        java.lang.String str24 = courseDTO18.getName();
        course0.update(courseDTO18, (java.lang.Long) 0L);
        java.lang.String str27 = courseDTO18.getFinalTime();
        java.lang.String str28 = courseDTO18.getName();
        com.engSoft.entities.Course course30 = new com.engSoft.entities.Course(courseDTO18, (java.lang.Long) 1L);
        com.engSoft.entities.Course course31 = new com.engSoft.entities.Course();
        java.lang.String str32 = course31.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO38 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str39 = courseDTO38.getCode();
        course31.update(courseDTO38, (java.lang.Long) 1L);
        java.lang.Long long42 = course31.getId();
        java.lang.String str43 = course31.getName();
        java.lang.String str44 = course31.getCode();
        com.engSoft.DTO.CourseDTO courseDTO50 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str51 = courseDTO50.getCode();
        com.engSoft.entities.Course course53 = new com.engSoft.entities.Course(courseDTO50, (java.lang.Long) 10L);
        course31.update(courseDTO50, (java.lang.Long) 1L);
        java.lang.String str56 = courseDTO50.getNameTeacher();
        java.lang.String str57 = courseDTO50.getCode();
        course30.update(courseDTO50, (java.lang.Long) 100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str9, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}" + "'", str12, "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str24, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str27, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str28, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(long42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str43, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str56, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.Long long9 = course8.getId();
        java.lang.Long long10 = course8.getId();
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        course8.update(courseDTO16, (java.lang.Long) 100L);
        java.lang.String str19 = course8.getInitialTime();
        com.engSoft.entities.Course course20 = new com.engSoft.entities.Course();
        java.lang.String str21 = course20.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO27 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str28 = courseDTO27.getCode();
        course20.update(courseDTO27, (java.lang.Long) 1L);
        java.lang.String str31 = courseDTO27.getNameTeacher();
        java.lang.String str32 = courseDTO27.getName();
        course8.update(courseDTO27, (java.lang.Long) 100L);
        java.lang.String str35 = courseDTO27.getFinalTime();
        com.engSoft.entities.Course course37 = new com.engSoft.entities.Course(courseDTO27, (java.lang.Long) 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str19, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str31, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str32, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str35, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
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
        java.lang.Integer int11 = feedbackDTO0.getWorkload();
        java.lang.Integer int12 = feedbackDTO0.getWorkload();
        java.lang.Long long13 = feedbackDTO0.getIdStudent();
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
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(long13);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str7 = student0.getName();
        java.lang.Boolean boolean8 = student0.getBanned();
        student0.setDeletedComments((int) (short) -1);
        java.lang.String str11 = student0.getName();
        java.lang.String str12 = student0.getName();
        java.lang.String str13 = student0.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        int int9 = student0.getDeletedComments();
        student0.setDeletedComments((int) '#');
        java.lang.Boolean boolean12 = student0.getBanned();
        java.lang.String str13 = student0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=35}" + "'", str13, "Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=35}");
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
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
        java.lang.String str24 = courseDTO16.getNameTeacher();
        java.lang.String str25 = courseDTO16.getFinalTime();
        com.engSoft.entities.Course course27 = new com.engSoft.entities.Course(courseDTO16, (java.lang.Long) 10L);
        com.engSoft.entities.Course course29 = new com.engSoft.entities.Course(courseDTO16, (java.lang.Long) 1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str22, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str23, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str24, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str25, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Long long2 = feedback0.getId();
        feedback0.setCourseware((java.lang.Integer) 1);
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setEvaluationSystem((java.lang.Integer) (-1));
        java.lang.String str9 = feedback0.toString();
        java.lang.Integer int10 = feedback0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=-1, courseware=1, modality=null}" + "'", str9, "Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=-1, courseware=1, modality=null}");
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        studentDTO2.setName("");
        studentDTO2.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.String str7 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str7, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str7 = studentDTO6.getEmail();
        studentDTO6.setEmail("Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 10);
        feedback0.setMethodology((java.lang.Integer) 0);
        com.engSoft.entities.types.ModalityEnum modalityEnum10 = feedback0.getModality();
        feedback0.setPlanning((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum10);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=100, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
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
        java.lang.String str22 = course0.toString();
        java.lang.String str23 = course0.getCode();
        java.lang.String str24 = course0.getName();
        com.engSoft.DTO.CourseDTO courseDTO30 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str31 = courseDTO30.getName();
        java.lang.String str32 = courseDTO30.getInitialTime();
        java.lang.String str33 = courseDTO30.getCode();
        java.lang.String str34 = courseDTO30.getFinalTime();
        java.lang.String str35 = courseDTO30.getInitialTime();
        java.lang.String str36 = courseDTO30.getNameTeacher();
        course0.update(courseDTO30, (java.lang.Long) 0L);
        java.lang.String str39 = courseDTO30.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str22, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str24, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str31, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str34, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str36, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        java.lang.String str5 = student0.toString();
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        int int8 = student0.getDeletedComments();
        student0.setDeletedComments((-1));
        student0.setBanned((java.lang.Boolean) true);
        student0.setNick("Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}");
        java.lang.String str15 = student0.toString();
        student0.setDeletedComments((int) 'a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student{id=null, name='hi!', email='null', nick='Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}', isBanned=true, deletedComments=-1}" + "'", str15, "Student{id=null, name='hi!', email='null', nick='Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}', isBanned=true, deletedComments=-1}");
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacherDTO1.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str4 = teacherDTO1.getName();
        java.lang.String str5 = teacherDTO1.getName();
        java.lang.String str6 = teacherDTO1.getName();
        java.lang.String str7 = teacherDTO1.getName();
        teacherDTO1.setName("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        java.lang.Long long3 = feedback0.getId();
        feedback0.setCourseware((java.lang.Integer) 0);
        feedback0.setPlanning((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(0);
        student0.setEmail("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE} }");
        student0.setEmail("Student{id=0, name='Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.types.ModalityEnum modalityEnum9 = feedbackDTO0.getModality();
        java.lang.Integer int10 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback11 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int12 = feedbackDTO0.getMethodology();
        java.lang.Integer int13 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(modalityEnum9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getFinalTime();
        java.lang.String str5 = course0.getFinalTime();
        java.lang.Long long6 = course0.getId();
        java.lang.String str7 = course0.getCode();
        java.lang.Long long8 = course0.getIdTeacher();
        com.engSoft.DTO.CourseDTO courseDTO14 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Teacher{id=null, name=  }", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str15 = courseDTO14.getCode();
        course0.update(courseDTO14, (java.lang.Long) 0L);
        com.engSoft.entities.Course course19 = new com.engSoft.entities.Course(courseDTO14, (java.lang.Long) 10L);
        com.engSoft.entities.Course course20 = new com.engSoft.entities.Course();
        java.lang.Long long21 = course20.getId();
        com.engSoft.DTO.CourseDTO courseDTO27 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str28 = courseDTO27.getCode();
        com.engSoft.entities.Course course30 = new com.engSoft.entities.Course(courseDTO27, (java.lang.Long) 10L);
        java.lang.Long long31 = course30.getId();
        java.lang.Long long32 = course30.getId();
        com.engSoft.DTO.CourseDTO courseDTO38 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        course30.update(courseDTO38, (java.lang.Long) 100L);
        java.lang.String str41 = courseDTO38.getFinalTime();
        course20.update(courseDTO38, (java.lang.Long) 10L);
        java.lang.String str44 = courseDTO38.getFinalTime();
        course19.update(courseDTO38, (java.lang.Long) 100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertNull(long32);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str41, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str44, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str5 = teacher4.toString();
        teacher4.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        java.lang.Long long8 = teacher4.getId();
        java.lang.String str9 = teacher4.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str9, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.Long long9 = course8.getId();
        java.lang.String str10 = course8.toString();
        java.lang.String str11 = course8.getFinalTime();
        java.lang.String str12 = course8.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str10, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.Long long4 = student0.getId();
        student0.setDeletedComments(0);
        student0.setId((java.lang.Long) 0L);
        java.lang.String str9 = student0.getName();
        java.lang.String str10 = student0.getEmail();
        student0.setDeletedComments((int) (short) 0);
        java.lang.String str13 = student0.toString();
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str13, "Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=-1, courseware=35, modality=null}");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(0);
        java.lang.String str9 = student0.toString();
        student0.setId((java.lang.Long) (-1L));
        student0.setId((java.lang.Long) (-1L));
        java.lang.String str14 = student0.getName();
        int int15 = student0.getDeletedComments();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Boolean boolean3 = student0.getBanned();
        student0.setId((java.lang.Long) 1L);
        java.lang.String str6 = student0.toString();
        java.lang.String str7 = student0.getEmail();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=1, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str6, "Student{id=1, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("", "Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        java.lang.String str3 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}" + "'", str3, "Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Integer int8 = feedbackDTO0.getMethodology();
        java.lang.Integer int9 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getNick();
        int int7 = student0.getDeletedComments();
        student0.setNick("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=10}', isBanned=true, deletedComments=10}");
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=null}");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedback3.getMethodology();
        feedback3.setPlanning((java.lang.Integer) 10);
        feedback3.setEvaluationSystem((java.lang.Integer) 35);
        feedback3.setIdStudent((java.lang.Long) 0L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.String str4 = student0.toString();
        java.lang.String str5 = student0.toString();
        student0.setEmail("Teacher{id=null, name= hi! }");
        java.lang.String str8 = student0.getName();
        java.lang.String str9 = student0.getNick();
        student0.setDeletedComments(1);
        java.lang.String str12 = student0.getNick();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str4, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str5, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        java.lang.String str3 = studentDTO2.getEmail();
        studentDTO2.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}");
        java.lang.String str6 = studentDTO2.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student7 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str3, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setDeletedComments(10);
        java.lang.String str6 = student0.toString();
        java.lang.Boolean boolean7 = student0.getBanned();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str6, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=-1, name='null', email='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', nick='null', isBanned=true, deletedComments=0}", "Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "", "Student{id=null, name='hi!', email='null', nick='Teacher{id=null, name=  }', isBanned=null, deletedComments=0}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=10, planning=null, evaluationSystem=null, courseware=1, modality=null} }");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE} }", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        java.lang.String str6 = courseDTO5.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}" + "'", str6, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}");
    }
}

