package com.engSoft.AvaliadorDisciplinas.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setName("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        com.engSoft.DTO.StudentDTO studentDTO5 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setId((java.lang.Long) 0L);
        java.lang.String str8 = student0.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str8, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        feedback0.setCourseware((java.lang.Integer) 100);
        feedback0.setPlanning((java.lang.Integer) 10);
        java.lang.Long long5 = feedback0.getIdCourse();
        feedback0.setIdCourse((java.lang.Long) (-1L));
        feedback0.setMethodology((java.lang.Integer) 100);
        feedback0.setIdCourse((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setEvaluationSystem((java.lang.Integer) 100);
        java.lang.Integer int6 = feedback0.getPlanning();
        feedback0.setIdStudent((java.lang.Long) 100L);
        feedback0.setMethodology((java.lang.Integer) 10);
        feedback0.setEvaluationSystem((java.lang.Integer) 35);
        feedback0.setPlanning((java.lang.Integer) 100);
        java.lang.Long long15 = feedback0.getId();
        com.engSoft.entities.Feedback feedback16 = new com.engSoft.entities.Feedback();
        java.lang.Integer int17 = feedback16.getEvaluationSystem();
        java.lang.String str18 = feedback16.toString();
        com.engSoft.entities.types.ModalityEnum modalityEnum19 = feedback16.getModality();
        feedback16.setWorkload((java.lang.Integer) (-1));
        feedback16.setCourseware((java.lang.Integer) 1);
        com.engSoft.entities.Feedback feedback24 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum25 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback24.setModality(modalityEnum25);
        feedback24.setIdStudent((java.lang.Long) 1L);
        java.lang.String str29 = feedback24.toString();
        feedback24.setIdCourse((java.lang.Long) 0L);
        java.lang.String str32 = feedback24.toString();
        com.engSoft.entities.types.ModalityEnum modalityEnum33 = feedback24.getModality();
        feedback16.setModality(modalityEnum33);
        feedback0.setModality(modalityEnum33);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str18, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(modalityEnum19);
        org.junit.Assert.assertTrue("'" + modalityEnum25 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum25.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str29, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str32, "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + modalityEnum33 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum33.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        java.lang.Long long11 = course0.getId();
        java.lang.String str12 = course0.getName();
        java.lang.String str13 = course0.getCode();
        com.engSoft.DTO.CourseDTO courseDTO19 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Teacher{id=null, name= hi! }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        com.engSoft.entities.Course course21 = new com.engSoft.entities.Course(courseDTO19, (java.lang.Long) 1L);
        course0.update(courseDTO19, (java.lang.Long) 10L);
        java.lang.Long long24 = course0.getId();
        java.lang.String str25 = course0.getFinalTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(long24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str25, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
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
        com.engSoft.entities.types.ModalityEnum modalityEnum10 = feedback9.getModality();
        feedback9.setPlanning((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(modalityEnum10);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
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
        com.engSoft.entities.Feedback feedback10 = new com.engSoft.entities.Feedback(feedbackDTO0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(modalityEnum9);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = courseDTO5.getName();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        java.lang.String str12 = courseDTO5.getInitialTime();
        java.lang.String str13 = courseDTO5.getFinalTime();
        java.lang.String str14 = courseDTO5.getCode();
        java.lang.String str15 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=35, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=0, modality=null}");
        studentDTO2.setEmail("Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=0}");
        java.lang.String str5 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=0}" + "'", str5, "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getWorkload();
        java.lang.Integer int2 = feedback0.getCourseware();
        java.lang.Long long3 = feedback0.getId();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getCode();
        java.lang.String str5 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO11 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str12 = courseDTO11.getName();
        java.lang.String str13 = courseDTO11.getInitialTime();
        java.lang.String str14 = courseDTO11.getCode();
        java.lang.String str15 = courseDTO11.getName();
        com.engSoft.entities.Course course17 = new com.engSoft.entities.Course(courseDTO11, (java.lang.Long) 100L);
        java.lang.String str18 = courseDTO11.getCode();
        java.lang.String str19 = courseDTO11.getFinalTime();
        course0.update(courseDTO11, (java.lang.Long) (-1L));
        java.lang.String str22 = course0.getCode();
        java.lang.String str23 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO29 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str30 = courseDTO29.getCode();
        com.engSoft.entities.Course course32 = new com.engSoft.entities.Course(courseDTO29, (java.lang.Long) 10L);
        java.lang.String str33 = courseDTO29.getNameTeacher();
        java.lang.String str34 = courseDTO29.getCode();
        java.lang.String str35 = courseDTO29.getFinalTime();
        course0.update(courseDTO29, (java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str19, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str23, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str33, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str35, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO4.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
        java.lang.String str7 = studentDTO4.getEmail();
        studentDTO4.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', nick='null', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setEvaluationSystem((java.lang.Integer) (-1));
        java.lang.Integer int4 = feedback0.getCourseware();
        java.lang.Integer int5 = feedback0.getWorkload();
        feedback0.setMethodology((java.lang.Integer) 10);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
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
        java.lang.String str16 = course12.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str15, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str16, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=0, name='Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}", "Student{id=null, name='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}");
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}", "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=null, deletedComments=32}");
        java.lang.String str6 = courseDTO5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}" + "'", str6, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str6 = teacherDTO1.getName();
        java.lang.String str7 = teacherDTO1.getName();
        java.lang.String str8 = teacherDTO1.getName();
        java.lang.String str9 = teacherDTO1.getName();
        teacherDTO1.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        feedback0.setIdStudent((java.lang.Long) 1L);
        java.lang.String str5 = feedback0.toString();
        java.lang.Long long6 = feedback0.getId();
        feedback0.setMethodology((java.lang.Integer) 100);
        java.lang.Integer int9 = feedback0.getCourseware();
        feedback0.setWorkload((java.lang.Integer) (-1));
        feedback0.setMethodology((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
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
        java.lang.Long long11 = feedbackDTO0.getIdCourse();
        java.lang.Integer int12 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setId((java.lang.Long) 100L);
        java.lang.Boolean boolean7 = student0.getBanned();
        int int8 = student0.getDeletedComments();
        java.lang.String str9 = student0.toString();
        student0.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=100, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}" + "'", str9, "Student{id=100, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getInitialTime();
        com.engSoft.entities.Course course9 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        java.lang.String str10 = course9.getCode();
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getName();
        java.lang.String str18 = courseDTO16.getInitialTime();
        com.engSoft.entities.Course course20 = new com.engSoft.entities.Course(courseDTO16, (java.lang.Long) 0L);
        java.lang.String str21 = courseDTO16.getCode();
        com.engSoft.entities.Course course23 = new com.engSoft.entities.Course(courseDTO16, (java.lang.Long) 1L);
        java.lang.String str24 = courseDTO16.getInitialTime();
        course9.update(courseDTO16, (java.lang.Long) 100L);
        java.lang.String str27 = course9.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str7, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str10, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str17, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str27, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.Long long2 = course0.getId();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str9 = courseDTO8.getCode();
        course0.update(courseDTO8, (java.lang.Long) 0L);
        java.lang.String str12 = courseDTO8.getCode();
        com.engSoft.entities.Course course14 = new com.engSoft.entities.Course(courseDTO8, (java.lang.Long) 0L);
        java.lang.String str15 = courseDTO8.getName();
        java.lang.String str16 = courseDTO8.getCode();
        com.engSoft.entities.Course course18 = new com.engSoft.entities.Course(courseDTO8, (java.lang.Long) 1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
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
        java.lang.Long long30 = course13.getId();
        java.lang.String str31 = course13.getFinalTime();
        java.lang.String str32 = course13.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str25, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str26, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str27, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str31, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str32, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str5 = studentDTO2.getEmail();
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        studentDTO2.setName("Teacher{id=null, name= null }");
        studentDTO2.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        studentDTO2.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        studentDTO2.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
        studentDTO2.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
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
        com.engSoft.entities.Course course32 = new com.engSoft.entities.Course();
        java.lang.String str33 = course32.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO39 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str40 = courseDTO39.getCode();
        course32.update(courseDTO39, (java.lang.Long) 1L);
        java.lang.Long long43 = course32.getId();
        java.lang.String str44 = course32.getName();
        java.lang.String str45 = course32.getCode();
        com.engSoft.entities.Course course46 = new com.engSoft.entities.Course();
        java.lang.String str47 = course46.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO53 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str54 = courseDTO53.getName();
        java.lang.String str55 = courseDTO53.getInitialTime();
        java.lang.String str56 = courseDTO53.getCode();
        java.lang.String str57 = courseDTO53.getFinalTime();
        java.lang.String str58 = courseDTO53.getInitialTime();
        course46.update(courseDTO53, (java.lang.Long) 10L);
        java.lang.String str61 = courseDTO53.getFinalTime();
        course32.update(courseDTO53, (java.lang.Long) 10L);
        com.engSoft.DTO.CourseDTO courseDTO69 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str70 = courseDTO69.getCode();
        com.engSoft.entities.Course course72 = new com.engSoft.entities.Course(courseDTO69, (java.lang.Long) 100L);
        course32.update(courseDTO69, (java.lang.Long) 100L);
        java.lang.String str75 = courseDTO69.getNameTeacher();
        java.lang.String str76 = courseDTO69.getInitialTime();
        course0.update(courseDTO69, (java.lang.Long) 0L);
        com.engSoft.DTO.CourseDTO courseDTO84 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='null', email='null', nick='Teacher{id=null, name=  }', isBanned=true, deletedComments=0}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str85 = courseDTO84.getInitialTime();
        course0.update(courseDTO84, (java.lang.Long) (-1L));
        java.lang.String str88 = course0.toString();
        java.lang.String str89 = course0.getCode();
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
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(long43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str44, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str54, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str57, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str61, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str75, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str85, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Course{id=null, name='Student{id=null, name='null', email='null', nick='Teacher{id=null, name=  }', isBanned=true, deletedComments=0}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='-1', initialTime='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', finalTime='Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}'}" + "'", str88, "Course{id=null, name='Student{id=null, name='null', email='null', nick='Teacher{id=null, name=  }', isBanned=true, deletedComments=0}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='-1', initialTime='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', finalTime='Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}'}");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str89, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
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
        java.lang.String str32 = course0.getInitialTime();
        java.lang.Long long33 = course0.getId();
        java.lang.String str34 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO40 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str41 = courseDTO40.getName();
        java.lang.String str42 = courseDTO40.getInitialTime();
        java.lang.String str43 = courseDTO40.getCode();
        java.lang.String str44 = courseDTO40.getName();
        com.engSoft.entities.Course course46 = new com.engSoft.entities.Course(courseDTO40, (java.lang.Long) (-1L));
        java.lang.String str47 = courseDTO40.getInitialTime();
        java.lang.String str48 = courseDTO40.getFinalTime();
        course0.update(courseDTO40, (java.lang.Long) 10L);
        com.engSoft.entities.Course course52 = new com.engSoft.entities.Course(courseDTO40, (java.lang.Long) 100L);
        java.lang.String str53 = course52.toString();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(long33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str34, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str41, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str44, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str48, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str53, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        feedback0.setCourseware((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedback0.getModality();
        java.lang.Integer int5 = feedback0.getWorkload();
        java.lang.Integer int6 = feedback0.getMethodology();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback();
        java.lang.Integer int8 = feedback7.getEvaluationSystem();
        feedback7.setIdCourse((java.lang.Long) 1L);
        feedback7.setPlanning((java.lang.Integer) 1);
        java.lang.Long long13 = feedback7.getId();
        feedback7.setCourseware((java.lang.Integer) 100);
        feedback7.setPlanning((java.lang.Integer) 0);
        com.engSoft.entities.Feedback feedback18 = new com.engSoft.entities.Feedback();
        java.lang.Long long19 = feedback18.getIdStudent();
        feedback18.setIdCourse((java.lang.Long) 100L);
        java.lang.Integer int22 = feedback18.getMethodology();
        com.engSoft.entities.Feedback feedback23 = new com.engSoft.entities.Feedback();
        java.lang.Integer int24 = feedback23.getEvaluationSystem();
        feedback23.setIdCourse((java.lang.Long) 1L);
        feedback23.setIdCourse((java.lang.Long) 10L);
        com.engSoft.entities.Feedback feedback29 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum30 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback29.setModality(modalityEnum30);
        feedback29.setIdStudent((java.lang.Long) 1L);
        java.lang.String str34 = feedback29.toString();
        feedback29.setIdCourse((java.lang.Long) 0L);
        com.engSoft.entities.types.ModalityEnum modalityEnum37 = com.engSoft.entities.types.ModalityEnum.PRESENTIAL;
        feedback29.setModality(modalityEnum37);
        feedback23.setModality(modalityEnum37);
        feedback18.setModality(modalityEnum37);
        feedback7.setModality(modalityEnum37);
        feedback0.setModality(modalityEnum37);
        java.lang.String str43 = feedback0.toString();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNull(long19);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertTrue("'" + modalityEnum30 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum30.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str34, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + modalityEnum37 + "' != '" + com.engSoft.entities.types.ModalityEnum.PRESENTIAL + "'", modalityEnum37.equals(com.engSoft.entities.types.ModalityEnum.PRESENTIAL));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=PRESENTIAL}" + "'", str43, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=PRESENTIAL}");
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        student0.setId((java.lang.Long) 100L);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', nick='null', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        studentDTO2.setEmail("Teacher{id=null, name=  }");
        java.lang.String str5 = studentDTO2.getName();
        studentDTO2.setName("Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}");
        java.lang.String str8 = studentDTO2.getEmail();
        java.lang.String str9 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str5, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name=  }" + "'", str8, "Teacher{id=null, name=  }");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Teacher{id=null, name=  }" + "'", str9, "Teacher{id=null, name=  }");
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=null}");
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        java.lang.Integer int7 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
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
        java.lang.Integer int12 = feedback6.getMethodology();
        feedback6.setCourseware((java.lang.Integer) 0);
        feedback6.setMethodology((java.lang.Integer) 0);
        feedback6.setPlanning((java.lang.Integer) 10);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        java.lang.Integer int3 = feedback0.getCourseware();
        feedback0.setIdStudent((java.lang.Long) 1L);
        feedback0.setWorkload((java.lang.Integer) 0);
        feedback0.setCourseware((java.lang.Integer) 0);
        java.lang.String str10 = feedback0.toString();
        feedback0.setWorkload((java.lang.Integer) 10);
        feedback0.setIdCourse((java.lang.Long) 1L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=0, methodology=null, planning=null, evaluationSystem=null, courseware=0, modality=null}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=0, methodology=null, planning=null, evaluationSystem=null, courseware=0, modality=null}");
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        java.lang.Integer int9 = feedbackDTO0.getPlanning();
        java.lang.Integer int10 = feedbackDTO0.getCourseware();
        java.lang.Long long11 = feedbackDTO0.getIdCourse();
        java.lang.Long long12 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback13 = new com.engSoft.entities.Feedback(feedbackDTO0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
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
        java.lang.String str12 = feedback11.toString();
        java.lang.Integer int13 = feedback11.getPlanning();
        java.lang.String str14 = feedback11.toString();
        com.engSoft.entities.Feedback feedback15 = new com.engSoft.entities.Feedback();
        java.lang.Long long16 = feedback15.getIdStudent();
        feedback15.setIdCourse((java.lang.Long) 100L);
        java.lang.Integer int19 = feedback15.getPlanning();
        java.lang.String str20 = feedback15.toString();
        feedback15.setIdStudent((java.lang.Long) 0L);
        java.lang.String str23 = feedback15.toString();
        feedback15.setCourseware((java.lang.Integer) 100);
        feedback15.setWorkload((java.lang.Integer) 0);
        com.engSoft.entities.Feedback feedback28 = new com.engSoft.entities.Feedback();
        java.lang.Integer int29 = feedback28.getEvaluationSystem();
        feedback28.setCourseware((java.lang.Integer) 1);
        java.lang.Integer int32 = feedback28.getWorkload();
        com.engSoft.entities.Feedback feedback33 = new com.engSoft.entities.Feedback();
        java.lang.Integer int34 = feedback33.getEvaluationSystem();
        feedback33.setIdCourse((java.lang.Long) 1L);
        feedback33.setPlanning((java.lang.Integer) 1);
        feedback33.setPlanning((java.lang.Integer) 10);
        feedback33.setIdStudent((java.lang.Long) 0L);
        feedback33.setIdCourse((java.lang.Long) 100L);
        com.engSoft.entities.Feedback feedback45 = new com.engSoft.entities.Feedback();
        java.lang.Integer int46 = feedback45.getEvaluationSystem();
        feedback45.setIdCourse((java.lang.Long) 1L);
        feedback45.setPlanning((java.lang.Integer) 1);
        feedback45.setPlanning((java.lang.Integer) 10);
        feedback45.setMethodology((java.lang.Integer) 0);
        com.engSoft.entities.Feedback feedback55 = new com.engSoft.entities.Feedback();
        java.lang.Integer int56 = feedback55.getEvaluationSystem();
        feedback55.setIdCourse((java.lang.Long) 1L);
        com.engSoft.entities.Feedback feedback59 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum60 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback59.setModality(modalityEnum60);
        feedback55.setModality(modalityEnum60);
        feedback45.setModality(modalityEnum60);
        feedback33.setModality(modalityEnum60);
        feedback28.setModality(modalityEnum60);
        feedback15.setModality(modalityEnum60);
        feedback11.setModality(modalityEnum60);
        feedback11.setCourseware((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(modalityEnum9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str20, "Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str23, "Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNull(int56);
        org.junit.Assert.assertTrue("'" + modalityEnum60 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum60.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str3 = student0.getName();
        java.lang.Long long4 = student0.getId();
        java.lang.String str5 = student0.getName();
        java.lang.Long long6 = student0.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Teacher{id=null, name= hi! }', email='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}', nick='hi!', isBanned=true, deletedComments=0}", "Student{id=null, name='null', email='null', nick='Teacher{id=null, name=  }', isBanned=true, deletedComments=0}", "Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=10, courseware=null, modality=null}", "Teacher{id=null, name= Teacher{id=null, name= null } }", "Feedback{id=null, idCourse=null, idStudent=1, workload=0, methodology=null, planning=null, evaluationSystem=null, courseware=0, modality=null}");
        java.lang.Class<?> wildcardClass6 = courseDTO5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        feedback0.setIdStudent((java.lang.Long) 100L);
        feedback0.setMethodology((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}", "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        studentDTO2.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        studentDTO2.setEmail("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        java.lang.String str7 = studentDTO2.getName();
        studentDTO2.setEmail("Teacher{id=null, name= Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0} }");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str3 = student0.getEmail();
        java.lang.String str4 = student0.getName();
        student0.setBanned((java.lang.Boolean) true);
        int int7 = student0.getDeletedComments();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        java.lang.Integer int9 = feedbackDTO0.getMethodology();
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
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        java.lang.String str11 = courseDTO7.getInitialTime();
        java.lang.String str12 = courseDTO7.getCode();
        com.engSoft.entities.Course course14 = new com.engSoft.entities.Course(courseDTO7, (java.lang.Long) (-1L));
        java.lang.String str15 = courseDTO7.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Integer int2 = feedback0.getWorkload();
        java.lang.String str3 = feedback0.toString();
        java.lang.Long long4 = feedback0.getId();
        java.lang.Integer int5 = feedback0.getCourseware();
        feedback0.setWorkload((java.lang.Integer) 1);
        feedback0.setEvaluationSystem((java.lang.Integer) 100);
        java.lang.Long long10 = feedback0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str7 = student0.getName();
        java.lang.Boolean boolean8 = student0.getBanned();
        java.lang.Long long9 = student0.getId();
        java.lang.String str10 = student0.getEmail();
        java.lang.Boolean boolean11 = student0.getBanned();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
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
        feedback6.setEvaluationSystem((java.lang.Integer) (-1));
        feedback6.setWorkload((java.lang.Integer) (-1));
        feedback6.setWorkload((java.lang.Integer) 10);
        java.lang.String str20 = feedback6.toString();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=0, workload=10, methodology=null, planning=null, evaluationSystem=-1, courseware=100, modality=null}" + "'", str20, "Feedback{id=null, idCourse=null, idStudent=0, workload=10, methodology=null, planning=null, evaluationSystem=-1, courseware=100, modality=null}");
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        feedback0.setIdStudent((java.lang.Long) 1L);
        java.lang.String str5 = feedback0.toString();
        java.lang.Long long6 = feedback0.getId();
        feedback0.setPlanning((java.lang.Integer) 10);
        feedback0.setPlanning((java.lang.Integer) 0);
        feedback0.setEvaluationSystem((java.lang.Integer) 1);
        java.lang.String str13 = feedback0.toString();
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=0, evaluationSystem=1, courseware=null, modality=REMOTE}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=0, evaluationSystem=1, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.Boolean boolean2 = student0.getBanned();
        student0.setNick("Teacher{id=null, name= hi! }");
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        int int7 = student0.getDeletedComments();
        java.lang.String str8 = student0.getEmail();
        java.lang.String str9 = student0.toString();
        student0.setDeletedComments((int) (short) 0);
        student0.setDeletedComments(100);
        java.lang.String str14 = student0.getNick();
        student0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str8, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='null', email='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=null, name='null', email='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str14, "Teacher{id=null, name= hi! }");
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getName();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) (-1L));
        com.engSoft.entities.Course course12 = new com.engSoft.entities.Course();
        java.lang.String str13 = course12.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO19 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str20 = courseDTO19.getCode();
        course12.update(courseDTO19, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO28 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str29 = courseDTO28.getInitialTime();
        course12.update(courseDTO28, (java.lang.Long) (-1L));
        java.lang.String str32 = courseDTO28.getInitialTime();
        java.lang.String str33 = courseDTO28.getFinalTime();
        java.lang.String str34 = courseDTO28.getName();
        java.lang.String str35 = courseDTO28.getName();
        java.lang.String str36 = courseDTO28.getName();
        com.engSoft.entities.Course course38 = new com.engSoft.entities.Course(courseDTO28, (java.lang.Long) 100L);
        com.engSoft.entities.Course course40 = new com.engSoft.entities.Course(courseDTO28, (java.lang.Long) 1L);
        course11.update(courseDTO28, (java.lang.Long) 0L);
        java.lang.String str43 = course11.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str33, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str34, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str35, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str36, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str43, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = course8.getInitialTime();
        com.engSoft.entities.Course course10 = new com.engSoft.entities.Course();
        java.lang.String str11 = course10.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO17 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str18 = courseDTO17.getCode();
        course10.update(courseDTO17, (java.lang.Long) 1L);
        java.lang.Long long21 = course10.getId();
        java.lang.String str22 = course10.getName();
        java.lang.String str23 = course10.getCode();
        com.engSoft.DTO.CourseDTO courseDTO29 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str30 = courseDTO29.getCode();
        com.engSoft.entities.Course course32 = new com.engSoft.entities.Course(courseDTO29, (java.lang.Long) 10L);
        course10.update(courseDTO29, (java.lang.Long) 1L);
        java.lang.String str35 = courseDTO29.getNameTeacher();
        course8.update(courseDTO29, (java.lang.Long) 10L);
        java.lang.String str38 = courseDTO29.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str22, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str35, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        java.lang.String str9 = courseDTO5.getFinalTime();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getFinalTime();
        com.engSoft.entities.Course course12 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) (-1L));
        java.lang.String str13 = course12.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}'}" + "'", str13, "Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}'}");
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
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
        java.lang.Integer int10 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int11 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setEvaluationSystem((java.lang.Integer) (-1));
        java.lang.Integer int4 = feedback0.getMethodology();
        feedback0.setMethodology((java.lang.Integer) 0);
        feedback0.setPlanning((java.lang.Integer) 100);
        com.engSoft.entities.types.ModalityEnum modalityEnum9 = feedback0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(modalityEnum9);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str3 = student0.getEmail();
        java.lang.Boolean boolean4 = student0.getBanned();
        student0.setBanned((java.lang.Boolean) false);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=0, modality=null}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        java.lang.Long long4 = feedback0.getIdStudent();
        feedback0.setMethodology((java.lang.Integer) (-1));
        java.lang.Long long7 = feedback0.getId();
        feedback0.setMethodology((java.lang.Integer) 1);
        java.lang.Long long10 = feedback0.getIdStudent();
        feedback0.setMethodology((java.lang.Integer) 0);
        feedback0.setMethodology((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
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
        java.lang.String str25 = course0.toString();
        java.lang.String str26 = course0.getCode();
        com.engSoft.DTO.CourseDTO courseDTO32 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str33 = courseDTO32.getName();
        java.lang.String str34 = courseDTO32.getInitialTime();
        java.lang.String str35 = courseDTO32.getCode();
        java.lang.String str36 = courseDTO32.getName();
        com.engSoft.entities.Course course38 = new com.engSoft.entities.Course(courseDTO32, (java.lang.Long) 100L);
        java.lang.String str39 = courseDTO32.getCode();
        java.lang.String str40 = courseDTO32.getFinalTime();
        course0.update(courseDTO32, (java.lang.Long) (-1L));
        java.lang.String str43 = courseDTO32.getInitialTime();
        java.lang.String str44 = courseDTO32.getFinalTime();
        java.lang.String str45 = courseDTO32.getCode();
        java.lang.String str46 = courseDTO32.getNameTeacher();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str23, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str25, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str33, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str36, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str40, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str44, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str46, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback8 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback8.setWorkload((java.lang.Integer) 10);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        teacherDTO1.setName("Teacher{id=null, name= null }");
        java.lang.String str4 = teacherDTO1.getName();
        java.lang.String str5 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher6 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher7 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str8 = teacherDTO1.getName();
        java.lang.String str9 = teacherDTO1.getName();
        teacherDTO1.setName("Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= null }" + "'", str4, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= null }" + "'", str8, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Teacher{id=null, name= null }" + "'", str9, "Teacher{id=null, name= null }");
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        java.lang.Integer int3 = feedback0.getCourseware();
        feedback0.setIdStudent((java.lang.Long) 1L);
        java.lang.String str6 = feedback0.toString();
        feedback0.setMethodology((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=1, courseware=null, modality=REMOTE}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=10}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=PRESENTIAL}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        com.engSoft.entities.Course course7 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course();
        java.lang.String str9 = course8.getInitialTime();
        java.lang.String str10 = course8.getInitialTime();
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "", "hi!", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Teacher{id=null, name= null }");
        java.lang.String str17 = courseDTO16.getName();
        course8.update(courseDTO16, (java.lang.Long) (-1L));
        java.lang.String str20 = course8.toString();
        com.engSoft.DTO.CourseDTO courseDTO26 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str27 = courseDTO26.getCode();
        com.engSoft.entities.Course course29 = new com.engSoft.entities.Course(courseDTO26, (java.lang.Long) 10L);
        com.engSoft.entities.Course course31 = new com.engSoft.entities.Course(courseDTO26, (java.lang.Long) 10L);
        java.lang.String str32 = courseDTO26.getName();
        course8.update(courseDTO26, (java.lang.Long) 0L);
        java.lang.String str35 = courseDTO26.getFinalTime();
        java.lang.String str36 = courseDTO26.getInitialTime();
        java.lang.String str37 = courseDTO26.getNameTeacher();
        course7.update(courseDTO26, (java.lang.Long) 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str17, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}" + "'", str20, "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str32, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str35, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str37, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setEvaluationSystem((java.lang.Integer) 100);
        feedback0.setIdStudent((java.lang.Long) 1L);
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedback0.getModality();
        java.lang.Integer int9 = feedback0.getWorkload();
        java.lang.Integer int10 = feedback0.getPlanning();
        feedback0.setCourseware((java.lang.Integer) 100);
        feedback0.setPlanning((java.lang.Integer) 100);
        feedback0.setIdCourse((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name=  }");
        java.lang.Long long2 = teacher1.getId();
        teacher1.setName("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.Long long5 = teacher1.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO6 = new com.engSoft.DTO.TeacherDTO(teacher1);
        java.lang.String str7 = teacher1.getName();
        java.lang.String str8 = teacher1.getName();
        java.lang.String str9 = teacher1.toString();
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str7, "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str8, "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Teacher{id=null, name= Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0} }" + "'", str9, "Teacher{id=null, name= Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0} }");
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.String str2 = course0.toString();
        java.lang.String str3 = course0.getInitialTime();
        java.lang.String str4 = course0.getFinalTime();
        java.lang.String str5 = course0.getFinalTime();
        java.lang.String str6 = course0.getFinalTime();
        java.lang.String str7 = course0.toString();
        java.lang.Long long8 = course0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setEvaluationSystem((java.lang.Integer) 100);
        feedback0.setIdStudent((java.lang.Long) 1L);
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedback0.getModality();
        java.lang.Integer int9 = feedback0.getWorkload();
        java.lang.Integer int10 = feedback0.getPlanning();
        java.lang.Integer int11 = feedback0.getCourseware();
        java.lang.Integer int12 = feedback0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        java.lang.Integer int8 = feedbackDTO0.getPlanning();
        com.engSoft.entities.Feedback feedback9 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback9.setIdCourse((java.lang.Long) 100L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO2);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO2);
        java.lang.Long long5 = teacher4.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback8 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        java.lang.Integer int10 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='hi!', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=true, deletedComments=0}", "Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }", "Student{id=-1, name='null', email='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', nick='null', isBanned=true, deletedComments=0}", "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }", "Student{id=null, name='hi!', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=true, deletedComments=0}");
        java.lang.String str6 = courseDTO5.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='hi!', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=true, deletedComments=0}" + "'", str6, "Student{id=null, name='hi!', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback4.setModality(modalityEnum5);
        feedback0.setModality(modalityEnum5);
        java.lang.Integer int8 = feedback0.getCourseware();
        feedback0.setEvaluationSystem((java.lang.Integer) 1);
        java.lang.String str11 = feedback0.toString();
        com.engSoft.entities.types.ModalityEnum modalityEnum12 = feedback0.getModality();
        feedback0.setWorkload((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertTrue("'" + modalityEnum5 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum5.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=1, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=1, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + modalityEnum12 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum12.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=100, modality=null}", "Student{id=null, name='null', email='null', nick='Teacher{id=null, name=  }', isBanned=true, deletedComments=0}");
        java.lang.String str3 = studentDTO2.getName();
        java.lang.String str4 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=100, modality=null}" + "'", str3, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=100, modality=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=100, modality=null}" + "'", str4, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=100, modality=null}");
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Boolean boolean5 = student0.getBanned();
        int int6 = student0.getDeletedComments();
        java.lang.Long long7 = student0.getId();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str10 = student0.getNick();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        java.lang.String str9 = student0.toString();
        student0.setEmail("");
        student0.setNick("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacher0.getName();
        java.lang.Long long5 = teacher0.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO6 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str7 = teacher0.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO8 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str9 = teacher0.toString();
        java.lang.String str10 = teacher0.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str7, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str9, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO2);
        teacher3.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        java.lang.String str6 = teacher3.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher3);
        com.engSoft.entities.Teacher teacher8 = new com.engSoft.entities.Teacher(teacherDTO7);
        com.engSoft.entities.Teacher teacher9 = new com.engSoft.entities.Teacher(teacherDTO7);
        java.lang.String str10 = teacherDTO7.getName();
        teacherDTO7.setName("Teacher{id=null, name= Teacher{id=null, name= null } }");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }" + "'", str6, "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str10, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setIdCourse((java.lang.Long) 0L);
        feedback0.setEvaluationSystem((java.lang.Integer) 100);
        java.lang.Integer int10 = feedback0.getCourseware();
        java.lang.Integer int11 = feedback0.getWorkload();
        feedback0.setCourseware((java.lang.Integer) 35);
        java.lang.Long long14 = feedback0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        java.lang.Boolean boolean6 = student0.getBanned();
        java.lang.String str7 = student0.getNick();
        java.lang.String str8 = student0.getName();
        java.lang.String str9 = student0.toString();
        int int10 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 100L);
        int int13 = student0.getDeletedComments();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str9, "Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.String str2 = course0.toString();
        java.lang.String str3 = course0.getInitialTime();
        java.lang.String str4 = course0.getInitialTime();
        java.lang.String str5 = course0.toString();
        java.lang.Long long6 = course0.getId();
        java.lang.String str7 = course0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str5, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
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
        student0.setDeletedComments((int) 'a');
        com.engSoft.DTO.StudentDTO studentDTO14 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        student0.setName("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = student0.getName();
        java.lang.String str7 = student0.getName();
        student0.setId((java.lang.Long) 10L);
        com.engSoft.DTO.StudentDTO studentDTO10 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str11 = student0.getNick();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str6, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
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
        java.lang.String str11 = feedback6.toString();
        feedback6.setIdStudent((java.lang.Long) (-1L));
        java.lang.Integer int14 = feedback6.getMethodology();
        feedback6.setIdStudent((java.lang.Long) 100L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(modalityEnum9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getPlanning();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedbackDTO0.getModality();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(modalityEnum4);
        org.junit.Assert.assertNull(modalityEnum5);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=0, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=0}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=0, methodology=null, planning=null, evaluationSystem=null, courseware=0, modality=null}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=null, deletedComments=32}", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=null, name='Teacher{id=null, name=  }', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getName();
        com.engSoft.entities.Course course12 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str13 = courseDTO5.getInitialTime();
        com.engSoft.entities.Course course15 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        com.engSoft.entities.Course course17 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setCourseware((java.lang.Integer) 1);
        java.lang.Integer int4 = feedback0.getWorkload();
        feedback0.setMethodology((java.lang.Integer) 1);
        feedback0.setMethodology((java.lang.Integer) 100);
        feedback0.setEvaluationSystem((java.lang.Integer) 100);
        feedback0.setWorkload((java.lang.Integer) (-1));
        java.lang.Long long13 = feedback0.getIdStudent();
        feedback0.setIdStudent((java.lang.Long) 1L);
        java.lang.String str16 = feedback0.toString();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=-1, methodology=100, planning=null, evaluationSystem=100, courseware=1, modality=null}" + "'", str16, "Feedback{id=null, idCourse=null, idStudent=1, workload=-1, methodology=100, planning=null, evaluationSystem=100, courseware=1, modality=null}");
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback6.setMethodology((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(0);
        java.lang.Long long9 = student0.getId();
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        java.lang.String str7 = student0.getNick();
        student0.setDeletedComments((int) 'a');
        student0.setId((java.lang.Long) 10L);
        com.engSoft.DTO.StudentDTO studentDTO12 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Student{id=null, name='Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        java.lang.String str3 = studentDTO2.getName();
        studentDTO2.setName("hi!");
        studentDTO2.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=0, modality=null}");
        studentDTO2.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', idTeacher='1', initialTime='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}', finalTime='Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        java.lang.Integer int10 = feedbackDTO0.getWorkload();
        java.lang.Integer int11 = feedbackDTO0.getEvaluationSystem();
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
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Integer int4 = feedbackDTO0.getWorkload();
        java.lang.Integer int5 = feedbackDTO0.getPlanning();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback8 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int9 = feedback8.getEvaluationSystem();
        java.lang.Long long10 = feedback8.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=10, evaluationSystem=1, courseware=null, modality=REMOTE}");
        java.lang.String str2 = teacher1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=10, evaluationSystem=1, courseware=null, modality=REMOTE} }" + "'", str2, "Teacher{id=null, name= Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=10, evaluationSystem=1, courseware=null, modality=REMOTE} }");
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("hi!");
        java.lang.String str2 = teacher1.getName();
        java.lang.String str3 = teacher1.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher1);
        java.lang.String str5 = teacherDTO4.getName();
        com.engSoft.entities.Teacher teacher6 = new com.engSoft.entities.Teacher(teacherDTO4);
        teacherDTO4.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str3, "Teacher{id=null, name= hi! }");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 100);
        java.lang.Integer int8 = feedback0.getMethodology();
        feedback0.setCourseware((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum11 = feedback0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(modalityEnum11);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Long long5 = feedbackDTO0.getIdStudent();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        java.lang.Long long9 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.types.ModalityEnum modalityEnum10 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(modalityEnum10);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedback3.getModality();
        java.lang.Integer int5 = feedback3.getMethodology();
        java.lang.Long long6 = feedback3.getId();
        java.lang.Integer int7 = feedback3.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Long long1 = feedback0.getIdStudent();
        feedback0.setCourseware((java.lang.Integer) 10);
        java.lang.Integer int4 = feedback0.getMethodology();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Integer int8 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getFinalTime();
        java.lang.String str5 = course0.getFinalTime();
        java.lang.Long long6 = course0.getId();
        java.lang.String str7 = course0.getCode();
        java.lang.Long long8 = course0.getId();
        java.lang.String str9 = course0.getInitialTime();
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
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}");
        studentDTO2.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=null, deletedComments=10}");
        studentDTO2.setEmail("Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=10, planning=null, evaluationSystem=100, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Integer int2 = feedback0.getWorkload();
        java.lang.String str3 = feedback0.toString();
        feedback0.setCourseware((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass6 = feedback0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        java.lang.Integer int9 = feedbackDTO0.getPlanning();
        java.lang.Integer int10 = feedbackDTO0.getMethodology();
        java.lang.Integer int11 = feedbackDTO0.getMethodology();
        java.lang.Integer int12 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Integer int4 = feedbackDTO0.getWorkload();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum6 = feedbackDTO0.getModality();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        java.lang.Long long8 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.Long long4 = teacher3.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO5 = new com.engSoft.DTO.TeacherDTO(teacher3);
        java.lang.String str6 = teacher3.toString();
        java.lang.Long long7 = teacher3.getId();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= null }" + "'", str6, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        student0.setName("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = student0.toString();
        java.lang.String str7 = student0.getNick();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str6, "Student{id=null, name='Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        java.lang.String str7 = student0.getNick();
        java.lang.Long long8 = student0.getId();
        student0.setEmail("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        int int11 = student0.getDeletedComments();
        com.engSoft.DTO.StudentDTO studentDTO12 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        int int6 = student0.getDeletedComments();
        java.lang.Boolean boolean7 = student0.getBanned();
        int int8 = student0.getDeletedComments();
        student0.setBanned((java.lang.Boolean) true);
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str7 = student0.toString();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Long long10 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO11 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}");
        java.lang.String str14 = student0.getName();
        java.lang.String str15 = student0.getName();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str7, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedback3.getCourseware();
        feedback3.setMethodology((java.lang.Integer) 100);
        java.lang.Integer int7 = feedback3.getPlanning();
        feedback3.setMethodology((java.lang.Integer) 35);
        java.lang.Long long10 = feedback3.getId();
        feedback3.setIdStudent((java.lang.Long) 0L);
        java.lang.Integer int13 = feedback3.getEvaluationSystem();
        java.lang.Long long14 = feedback3.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=null, name='null', email='Teacher{id=null, name=  }', nick='Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=null, name='Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        studentDTO2.setEmail("Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=10, courseware=null, modality=null}");
        java.lang.String str5 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Integer int4 = feedbackDTO0.getPlanning();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        java.lang.Long long8 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.types.ModalityEnum modalityEnum9 = feedbackDTO0.getModality();
        java.lang.Integer int10 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(modalityEnum9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        feedback0.setIdStudent((java.lang.Long) 1L);
        java.lang.String str5 = feedback0.toString();
        java.lang.Long long6 = feedback0.getId();
        feedback0.setMethodology((java.lang.Integer) 100);
        java.lang.Integer int9 = feedback0.getEvaluationSystem();
        java.lang.Integer int10 = feedback0.getWorkload();
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=10, idStudent=null, workload=0, methodology=null, planning=null, evaluationSystem=null, courseware=-1, modality=null}", "Student{id=0, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Teacher{id=null, name= null }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        studentDTO2.setEmail("");
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student7 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback8 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long9 = feedback8.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        java.lang.Integer int2 = feedback0.getPlanning();
        java.lang.Long long3 = feedback0.getId();
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedback0.getModality();
        java.lang.Integer int5 = feedback0.getPlanning();
        java.lang.Integer int6 = feedback0.getWorkload();
        java.lang.Integer int7 = feedback0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(modalityEnum4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        java.lang.String str6 = student0.getName();
        student0.setId((java.lang.Long) 0L);
        java.lang.String str9 = student0.getEmail();
        com.engSoft.DTO.StudentDTO studentDTO10 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO10.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=null}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setDeletedComments(10);
        java.lang.String str6 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str8 = student0.getName();
        java.lang.String str9 = student0.getName();
        java.lang.String str10 = student0.getNick();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str6, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.toString();
        java.lang.String str2 = student0.getName();
        student0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str1, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str3 = studentDTO2.getName();
        java.lang.String str4 = studentDTO2.getName();
        java.lang.String str5 = studentDTO2.getEmail();
        java.lang.String str6 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str5, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str6, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= null }");
        teacherDTO1.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher6 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str7 = teacher6.toString();
        java.lang.Long long8 = teacher6.getId();
        java.lang.Long long9 = teacher6.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str7, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacher0.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO5 = new com.engSoft.DTO.TeacherDTO(teacher0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str4, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        int int9 = student0.getDeletedComments();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str12 = student0.getNick();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
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
        java.lang.Integer int10 = feedbackDTO0.getCourseware();
        java.lang.Integer int11 = feedbackDTO0.getCourseware();
        java.lang.Integer int12 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(modalityEnum9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
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
        java.lang.String str12 = feedback11.toString();
        com.engSoft.entities.types.ModalityEnum modalityEnum13 = feedback11.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(modalityEnum9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(modalityEnum13);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=0, methodology=10, planning=100, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.String str4 = student0.toString();
        java.lang.Long long5 = student0.getId();
        int int6 = student0.getDeletedComments();
        java.lang.String str7 = student0.getNick();
        java.lang.String str8 = student0.getEmail();
        com.engSoft.DTO.StudentDTO studentDTO9 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str4, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setEvaluationSystem((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedback0.getModality();
        java.lang.Long long9 = feedback0.getId();
        feedback0.setIdCourse((java.lang.Long) 1L);
        java.lang.Integer int12 = feedback0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) true);
        student0.setId((java.lang.Long) 100L);
        java.lang.String str11 = student0.toString();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=100, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str11, "Student{id=100, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=1, courseware=0, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE} }");
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long4 = teacher0.getId();
        java.lang.Long long5 = teacher0.getId();
        java.lang.Long long6 = teacher0.getId();
        java.lang.String str7 = teacher0.toString();
        java.lang.Long long8 = teacher0.getId();
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str7, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}");
        java.lang.String str2 = customErrorType1.getErrorMessage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str2, "Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        java.lang.String str4 = student0.getNick();
        student0.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        int int7 = student0.getDeletedComments();
        student0.setNick("Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
        java.lang.String str10 = student0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        int int5 = student0.getDeletedComments();
        int int6 = student0.getDeletedComments();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO7.setEmail("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        studentDTO7.setEmail("Student{id=-1, name='null', email='null', nick='Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=35}");
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student12 = new com.engSoft.entities.Student(studentDTO7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        java.lang.String str11 = courseDTO7.getName();
        com.engSoft.entities.Course course13 = new com.engSoft.entities.Course(courseDTO7, (java.lang.Long) 100L);
        java.lang.String str14 = course13.getCode();
        java.lang.String str15 = course13.getCode();
        com.engSoft.DTO.CourseDTO courseDTO16 = null;
        // The following exception was thrown during execution in test generation
        try {
            course13.update(courseDTO16, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=-1, planning=100, evaluationSystem=0, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        int int2 = student0.getDeletedComments();
        java.lang.Boolean boolean3 = student0.getBanned();
        student0.setNick("");
        java.lang.String str6 = student0.getName();
        student0.setId((java.lang.Long) 10L);
        java.lang.String str9 = student0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        java.lang.Integer int8 = feedbackDTO0.getPlanning();
        com.engSoft.entities.Feedback feedback9 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback9.setIdStudent((java.lang.Long) 100L);
        feedback9.setIdCourse((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        java.lang.Integer int7 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=REMOTE}");
        studentDTO2.setName("Course{id=null, name='Student{id=null, name='null', email='null', nick='Teacher{id=null, name=  }', isBanned=true, deletedComments=0}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='-1', initialTime='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', finalTime='Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}'}");
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Class<?> wildcardClass5 = feedback4.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
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
        com.engSoft.entities.Feedback feedback10 = new com.engSoft.entities.Feedback(feedbackDTO0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        int int6 = student0.getDeletedComments();
        java.lang.Boolean boolean7 = student0.getBanned();
        int int8 = student0.getDeletedComments();
        java.lang.String str9 = student0.toString();
        java.lang.Boolean boolean10 = student0.getBanned();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        feedback0.setIdStudent((java.lang.Long) 1L);
        java.lang.String str5 = feedback0.toString();
        feedback0.setIdCourse((java.lang.Long) 0L);
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = com.engSoft.entities.types.ModalityEnum.PRESENTIAL;
        feedback0.setModality(modalityEnum8);
        feedback0.setMethodology((java.lang.Integer) 1);
        java.lang.Integer int12 = feedback0.getEvaluationSystem();
        feedback0.setWorkload((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + modalityEnum8 + "' != '" + com.engSoft.entities.types.ModalityEnum.PRESENTIAL + "'", modalityEnum8.equals(com.engSoft.entities.types.ModalityEnum.PRESENTIAL));
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
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
        java.lang.Long long11 = feedback6.getId();
        java.lang.String str12 = feedback6.toString();
        java.lang.Integer int13 = feedback6.getPlanning();
        feedback6.setPlanning((java.lang.Integer) 10);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(modalityEnum9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
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
        int int20 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', isBanned=true, deletedComments=100}" + "'", str19, "Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', isBanned=true, deletedComments=100}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        java.lang.String str3 = student0.getNick();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments(0);
        student0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str5 = teacher4.toString();
        teacher4.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        com.engSoft.DTO.TeacherDTO teacherDTO8 = new com.engSoft.DTO.TeacherDTO(teacher4);
        com.engSoft.DTO.TeacherDTO teacherDTO9 = new com.engSoft.DTO.TeacherDTO(teacher4);
        java.lang.Long long10 = teacher4.getId();
        java.lang.Long long11 = teacher4.getId();
        java.lang.String str12 = teacher4.toString();
        java.lang.String str13 = teacher4.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }" + "'", str12, "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str13, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        student0.setNick("");
        java.lang.Boolean boolean6 = student0.getBanned();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = courseDTO5.getNameTeacher();
        java.lang.String str10 = courseDTO5.getCode();
        java.lang.String str11 = courseDTO5.getFinalTime();
        java.lang.String str12 = courseDTO5.getFinalTime();
        java.lang.String str13 = courseDTO5.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long4 = teacher0.getId();
        java.lang.String str5 = teacher0.toString();
        java.lang.Long long6 = teacher0.getId();
        java.lang.String str7 = teacher0.getName();
        java.lang.String str8 = teacher0.getName();
        java.lang.Long long9 = teacher0.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO10 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str11 = teacher0.toString();
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str11, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        student0.setName("");
        java.lang.Boolean boolean7 = student0.getBanned();
        student0.setBanned((java.lang.Boolean) true);
        student0.setId((java.lang.Long) 1L);
        student0.setBanned((java.lang.Boolean) true);
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.String str2 = course0.getCode();
        java.lang.String str3 = course0.getCode();
        java.lang.String str4 = course0.getInitialTime();
        java.lang.String str5 = course0.getFinalTime();
        java.lang.String str6 = course0.getCode();
        java.lang.Long long7 = course0.getIdTeacher();
        java.lang.Long long8 = course0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        int int2 = student0.getDeletedComments();
        java.lang.Boolean boolean3 = student0.getBanned();
        java.lang.Boolean boolean4 = student0.getBanned();
        int int5 = student0.getDeletedComments();
        java.lang.String str6 = student0.getNick();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        java.lang.String str5 = student0.toString();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long10 = student0.getId();
        student0.setEmail("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str13 = student0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("");
        java.lang.String str2 = teacher1.getName();
        java.lang.Long long3 = teacher1.getId();
        java.lang.String str4 = teacher1.getName();
        teacher1.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str7 = teacher1.getName();
        teacher1.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=-1, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=null}" + "'", str7, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setName("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        student0.setName("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        student0.setDeletedComments((int) '#');
        java.lang.String str13 = student0.getNick();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}");
        java.lang.Long long2 = teacher1.getId();
        java.lang.Long long3 = teacher1.getId();
        java.lang.Long long4 = teacher1.getId();
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        java.lang.String str11 = courseDTO7.getName();
        com.engSoft.entities.Course course13 = new com.engSoft.entities.Course(courseDTO7, (java.lang.Long) 100L);
        com.engSoft.entities.Course course14 = new com.engSoft.entities.Course();
        java.lang.String str15 = course14.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO21 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str22 = courseDTO21.getCode();
        course14.update(courseDTO21, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO30 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str31 = courseDTO30.getInitialTime();
        course14.update(courseDTO30, (java.lang.Long) (-1L));
        java.lang.String str34 = course14.getInitialTime();
        com.engSoft.entities.Course course35 = new com.engSoft.entities.Course();
        java.lang.String str36 = course35.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO42 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str43 = courseDTO42.getCode();
        course35.update(courseDTO42, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO51 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str52 = courseDTO51.getInitialTime();
        course35.update(courseDTO51, (java.lang.Long) (-1L));
        java.lang.String str55 = courseDTO51.getCode();
        course14.update(courseDTO51, (java.lang.Long) 0L);
        course13.update(courseDTO51, (java.lang.Long) 100L);
        com.engSoft.entities.Course course61 = new com.engSoft.entities.Course(courseDTO51, (java.lang.Long) 100L);
        java.lang.String str62 = courseDTO51.getName();
        java.lang.String str63 = courseDTO51.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str62, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.Long long2 = course0.getId();
        java.lang.String str3 = course0.toString();
        java.lang.String str4 = course0.getFinalTime();
        java.lang.Long long5 = course0.getIdTeacher();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str3, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getName();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        com.engSoft.DTO.CourseDTO courseDTO17 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        course11.update(courseDTO17, (java.lang.Long) 10L);
        java.lang.String str20 = courseDTO17.getInitialTime();
        java.lang.String str21 = courseDTO17.getCode();
        com.engSoft.entities.Course course23 = new com.engSoft.entities.Course(courseDTO17, (java.lang.Long) 1L);
        com.engSoft.entities.Course course25 = new com.engSoft.entities.Course(courseDTO17, (java.lang.Long) 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str20, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        java.lang.String str2 = teacher1.getName();
        java.lang.String str3 = teacher1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str2, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str3, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        java.lang.Integer int2 = feedback0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.String str2 = course0.toString();
        java.lang.String str3 = course0.getInitialTime();
        java.lang.Long long4 = course0.getIdTeacher();
        java.lang.String str5 = course0.getInitialTime();
        java.lang.String str6 = course0.getName();
        com.engSoft.DTO.CourseDTO courseDTO12 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str13 = courseDTO12.getCode();
        com.engSoft.entities.Course course15 = new com.engSoft.entities.Course(courseDTO12, (java.lang.Long) 10L);
        com.engSoft.entities.Course course17 = new com.engSoft.entities.Course(courseDTO12, (java.lang.Long) 10L);
        java.lang.String str18 = courseDTO12.getFinalTime();
        course0.update(courseDTO12, (java.lang.Long) 100L);
        java.lang.String str21 = courseDTO12.getNameTeacher();
        java.lang.String str22 = courseDTO12.getName();
        com.engSoft.entities.Course course24 = new com.engSoft.entities.Course(courseDTO12, (java.lang.Long) 1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str18, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str22, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = courseDTO5.getCode();
        java.lang.Class<?> wildcardClass10 = courseDTO5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean9 = student0.getBanned();
        java.lang.Long long10 = student0.getId();
        java.lang.String str11 = student0.getName();
        java.lang.Boolean boolean12 = student0.getBanned();
        student0.setNick("Student{id=100, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=10}");
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=1, workload=0, methodology=null, planning=null, evaluationSystem=null, courseware=0, modality=null}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.String str2 = course0.toString();
        java.lang.String str3 = course0.getInitialTime();
        java.lang.Long long4 = course0.getIdTeacher();
        java.lang.String str5 = course0.getInitialTime();
        java.lang.String str6 = course0.getName();
        java.lang.String str7 = course0.toString();
        java.lang.String str8 = course0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str5 = studentDTO2.getEmail();
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        studentDTO2.setName("Teacher{id=null, name= null }");
        studentDTO2.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        studentDTO2.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        studentDTO2.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
        studentDTO2.setEmail("Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}");
        studentDTO2.setEmail("Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10} }");
        studentDTO2.setEmail("Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.Long long1 = course0.getId();
        java.lang.String str2 = course0.getCode();
        java.lang.String str3 = course0.toString();
        java.lang.Class<?> wildcardClass4 = course0.getClass();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str3, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= null }");
        teacherDTO1.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacherDTO1.getName();
        teacherDTO1.setName("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        com.engSoft.entities.Teacher teacher7 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher8 = new com.engSoft.entities.Teacher(teacherDTO1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=REMOTE}");
        studentDTO2.setEmail("Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0} }");
        java.lang.String str5 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setBanned((java.lang.Boolean) true);
        student0.setId((java.lang.Long) 0L);
        java.lang.Boolean boolean7 = student0.getBanned();
        student0.setName("");
        int int10 = student0.getDeletedComments();
        student0.setNick("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        int int1 = student0.getDeletedComments();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str3 = student0.getName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.String str4 = student0.toString();
        java.lang.String str5 = student0.toString();
        student0.setEmail("Teacher{id=null, name= hi! }");
        java.lang.String str8 = student0.getName();
        java.lang.String str9 = student0.getNick();
        student0.setDeletedComments(1);
        java.lang.Long long12 = student0.getId();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str4, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str5, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        student0.setNick("");
        student0.setEmail("Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}");
        java.lang.Long long8 = student0.getId();
        java.lang.String str9 = student0.getNick();
        student0.setDeletedComments((-1));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setBanned((java.lang.Boolean) true);
        student0.setBanned((java.lang.Boolean) true);
        student0.setBanned((java.lang.Boolean) false);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        java.lang.Long long8 = feedbackDTO0.getIdCourse();
        java.lang.Integer int9 = feedbackDTO0.getCourseware();
        java.lang.Long long10 = feedbackDTO0.getIdStudent();
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
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setMethodology((java.lang.Integer) 1);
        java.lang.Integer int8 = feedback0.getWorkload();
        java.lang.Long long9 = feedback0.getId();
        java.lang.Integer int10 = feedback0.getEvaluationSystem();
        feedback0.setEvaluationSystem((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum13 = feedback0.getModality();
        feedback0.setWorkload((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(modalityEnum13);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedback6.getModality();
        java.lang.Integer int8 = feedback6.getPlanning();
        feedback6.setPlanning((java.lang.Integer) 0);
        java.lang.Integer int11 = feedback6.getCourseware();
        java.lang.Long long12 = feedback6.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = courseDTO5.getCode();
        java.lang.String str10 = courseDTO5.getName();
        com.engSoft.entities.Course course12 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.toString();
        java.lang.String str2 = teacher0.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacherDTO3.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        teacherDTO3.setName("Teacher{id=null, name= null }");
        java.lang.String str8 = teacherDTO3.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Teacher{id=null, name= null }" + "'", str1, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= null }" + "'", str8, "Teacher{id=null, name= null }");
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        java.lang.String str6 = student0.getName();
        student0.setId((java.lang.Long) 0L);
        student0.setName("Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=0}");
        java.lang.Boolean boolean11 = student0.getBanned();
        student0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}");
        int int14 = student0.getDeletedComments();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str3 = student0.getName();
        student0.setNick("");
        java.lang.String str6 = student0.getNick();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Teacher{id=null, name= hi! }");
        student0.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        student0.setId((java.lang.Long) 10L);
        com.engSoft.DTO.StudentDTO studentDTO11 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Student{id=100, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=10}", "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
        java.lang.String str6 = courseDTO5.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}" + "'", str6, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='null', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=true, deletedComments=0}");
        java.lang.String str2 = teacher1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=true, deletedComments=0} }" + "'", str2, "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=true, deletedComments=0} }");
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        studentDTO2.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
        studentDTO2.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=100, evaluationSystem=null, courseware=-1, modality=null}");
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Integer int7 = feedbackDTO0.getPlanning();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(0);
        java.lang.String str9 = student0.toString();
        student0.setDeletedComments(100);
        com.engSoft.DTO.StudentDTO studentDTO12 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        int int1 = student0.getDeletedComments();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(10);
        com.engSoft.DTO.StudentDTO studentDTO5 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Student{id=10, name='Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean9 = student0.getBanned();
        java.lang.String str10 = student0.getEmail();
        student0.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str13 = student0.toString();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=10}" + "'", str13, "Student{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        java.lang.String str3 = student0.getNick();
        student0.setName("Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str8 = student0.getEmail();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setName("Teacher{id=null, name= null }");
        student0.setName("");
        student0.setEmail("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
        student0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        studentDTO2.setEmail("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str5 = studentDTO2.getEmail();
        java.lang.String str6 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str6, "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
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
        java.lang.Long long10 = feedbackDTO0.getIdStudent();
        java.lang.Integer int11 = feedbackDTO0.getEvaluationSystem();
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
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Long long2 = feedback0.getId();
        java.lang.String str3 = feedback0.toString();
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedback0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(modalityEnum4);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
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
        java.lang.Integer int10 = feedbackDTO0.getCourseware();
        java.lang.Integer int11 = feedbackDTO0.getCourseware();
        java.lang.Long long12 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(modalityEnum9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.String str2 = course0.toString();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str9 = courseDTO8.getName();
        java.lang.String str10 = courseDTO8.getInitialTime();
        java.lang.String str11 = courseDTO8.getCode();
        java.lang.String str12 = courseDTO8.getFinalTime();
        course0.update(courseDTO8, (java.lang.Long) 10L);
        java.lang.String str15 = courseDTO8.getNameTeacher();
        com.engSoft.entities.Course course17 = new com.engSoft.entities.Course(courseDTO8, (java.lang.Long) 10L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback9 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int10 = feedbackDTO0.getWorkload();
        java.lang.Integer int11 = feedbackDTO0.getCourseware();
        java.lang.Integer int12 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("hi!");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str3 = teacher2.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher2);
        java.lang.String str5 = teacher2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str5, "Teacher{id=null, name= hi! }");
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        java.lang.Integer int9 = feedbackDTO0.getPlanning();
        java.lang.Integer int10 = feedbackDTO0.getMethodology();
        java.lang.Integer int11 = feedbackDTO0.getMethodology();
        java.lang.Class<?> wildcardClass12 = feedbackDTO0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedback6.getModality();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedback6.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(modalityEnum8);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        java.lang.String str3 = studentDTO2.getName();
        studentDTO2.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str6 = studentDTO2.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student7 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setEvaluationSystem((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedback0.getModality();
        java.lang.Long long9 = feedback0.getId();
        java.lang.Long long10 = feedback0.getIdStudent();
        feedback0.setPlanning((java.lang.Integer) (-1));
        java.lang.Integer int13 = feedback0.getMethodology();
        feedback0.setIdStudent((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        java.lang.String str4 = student0.toString();
        student0.setDeletedComments(97);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}" + "'", str4, "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str2 = teacher1.getName();
        teacher1.setName("Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        java.lang.Long long5 = teacher1.getId();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str2, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        java.lang.String str7 = student0.getNick();
        java.lang.Long long8 = student0.getId();
        java.lang.String str9 = student0.getName();
        student0.setNick("Teacher{id=null, name=  }");
        java.lang.String str12 = student0.getNick();
        java.lang.String str13 = student0.getEmail();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Teacher{id=null, name=  }" + "'", str12, "Teacher{id=null, name=  }");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
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
        java.lang.Long long13 = feedback6.getId();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(long13);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.toString();
        java.lang.Long long5 = course0.getIdTeacher();
        java.lang.String str6 = course0.getCode();
        java.lang.String str7 = course0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str4, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(0);
        java.lang.String str9 = student0.toString();
        student0.setId((java.lang.Long) (-1L));
        student0.setId((java.lang.Long) (-1L));
        student0.setNick("Student{id=null, name='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int8 = feedbackDTO0.getPlanning();
        java.lang.Integer int9 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        java.lang.String str3 = student0.getNick();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments(0);
        student0.setDeletedComments((int) (short) 10);
        com.engSoft.DTO.StudentDTO studentDTO10 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str11 = studentDTO10.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(0);
        java.lang.String str9 = student0.toString();
        student0.setId((java.lang.Long) (-1L));
        student0.setId((java.lang.Long) (-1L));
        student0.setId((java.lang.Long) 10L);
        student0.setDeletedComments((int) ' ');
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name=  }");
        teacherDTO1.setName("Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=true, deletedComments=100}");
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        java.lang.Long long3 = feedback0.getId();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback4.setModality(modalityEnum5);
        feedback0.setModality(modalityEnum5);
        java.lang.String str8 = feedback0.toString();
        java.lang.Integer int9 = feedback0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertTrue("'" + modalityEnum5 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum5.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        student0.setName("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = student0.getNick();
        java.lang.String str7 = student0.getNick();
        student0.setDeletedComments((int) (byte) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
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
        student0.setBanned((java.lang.Boolean) true);
        student0.setName("Student{id=null, name='Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = courseDTO5.getName();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        java.lang.Long long12 = course11.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        java.lang.String str4 = student0.getNick();
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long7 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Teacher{id=null, name= Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "");
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student3 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str6 = teacher5.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher5);
        com.engSoft.entities.Teacher teacher8 = new com.engSoft.entities.Teacher(teacherDTO7);
        teacher8.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=null, deletedComments=32}");
        java.lang.Long long11 = teacher8.getId();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= null }" + "'", str6, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setName("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        java.lang.String str9 = student0.getNick();
        java.lang.String str10 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO11 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student{id=10, name='Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str10, "Student{id=10, name='Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.String str2 = course0.toString();
        java.lang.String str3 = course0.getCode();
        java.lang.String str4 = course0.getInitialTime();
        java.lang.String str5 = course0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}", "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}", "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
        com.engSoft.entities.Course course7 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) (-1L));
        java.lang.String str8 = courseDTO5.getFinalTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}" + "'", str8, "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str3 = student0.getName();
        java.lang.Long long4 = student0.getId();
        java.lang.String str5 = student0.getName();
        student0.setDeletedComments((int) (short) 0);
        student0.setBanned((java.lang.Boolean) true);
        student0.setDeletedComments((int) (short) 100);
        java.lang.Long long12 = student0.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int7 = feedback6.getPlanning();
        java.lang.Integer int8 = feedback6.getPlanning();
        feedback6.setEvaluationSystem((java.lang.Integer) 100);
        feedback6.setMethodology((java.lang.Integer) (-1));
        feedback6.setPlanning((java.lang.Integer) 35);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.toString();
        java.lang.String str2 = teacher0.toString();
        java.lang.String str3 = teacher0.toString();
        java.lang.String str4 = teacher0.toString();
        java.lang.Long long5 = teacher0.getId();
        java.lang.String str6 = teacher0.toString();
        java.lang.String str7 = teacher0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Teacher{id=null, name= null }" + "'", str1, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= null }" + "'", str2, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name= null }" + "'", str3, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= null }" + "'", str4, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= null }" + "'", str6, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
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
        com.engSoft.DTO.CourseDTO courseDTO22 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}", "Student{id=null, name='Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=null, deletedComments=0}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=10, planning=null, evaluationSystem=null, courseware=1, modality=null} }", "Feedback{id=null, idCourse=null, idStudent=null, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0} }");
        java.lang.String str23 = courseDTO22.getName();
        course0.update(courseDTO22, (java.lang.Long) 0L);
        java.lang.String str26 = course0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str13, "Teacher{id=null, name= hi! }");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str16, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}" + "'", str23, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}" + "'", str26, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        java.lang.Long long3 = feedback0.getId();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback4.setModality(modalityEnum5);
        feedback0.setModality(modalityEnum5);
        java.lang.Integer int8 = feedback0.getMethodology();
        feedback0.setCourseware((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertTrue("'" + modalityEnum5 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum5.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean7 = student0.getBanned();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setId((java.lang.Long) (-1L));
        student0.setBanned((java.lang.Boolean) true);
        student0.setDeletedComments((int) '#');
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.Boolean boolean7 = student0.getBanned();
        int int8 = student0.getDeletedComments();
        java.lang.String str9 = student0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setName("Teacher{id=null, name= null }");
        java.lang.String str7 = student0.getEmail();
        java.lang.String str8 = student0.toString();
        java.lang.String str9 = student0.getEmail();
        student0.setEmail("Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        java.lang.String str12 = student0.getNick();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}" + "'", str8, "Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= null }");
        teacherDTO1.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher6 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher6);
        teacherDTO7.setName("Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }");
        java.lang.String str10 = teacherDTO7.getName();
        com.engSoft.entities.Teacher teacher11 = new com.engSoft.entities.Teacher(teacherDTO7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }" + "'", str10, "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }");
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=1, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 10);
        java.lang.Integer int8 = feedback0.getEvaluationSystem();
        java.lang.Long long9 = feedback0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
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
        java.lang.String str23 = course0.getName();
        java.lang.String str24 = course0.getName();
        com.engSoft.DTO.CourseDTO courseDTO30 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str31 = courseDTO30.getName();
        java.lang.String str32 = courseDTO30.getCode();
        course0.update(courseDTO30, (java.lang.Long) 1L);
        java.lang.String str35 = courseDTO30.getNameTeacher();
        java.lang.String str36 = courseDTO30.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str22, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str23, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str24, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str31, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str35, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        java.lang.String str3 = student0.getNick();
        java.lang.String str4 = student0.getNick();
        java.lang.String str5 = student0.toString();
        java.lang.String str6 = student0.getName();
        java.lang.String str7 = student0.getName();
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.getName();
        java.lang.String str2 = teacher0.toString();
        java.lang.String str3 = teacher0.getName();
        java.lang.String str4 = teacher0.getName();
        teacher0.setName("Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=0, modality=null}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= null }" + "'", str2, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        teacherDTO1.setName("Teacher{id=null, name= null }");
        java.lang.String str4 = teacherDTO1.getName();
        teacherDTO1.setName("Student{id=-1, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= null }" + "'", str4, "Teacher{id=null, name= null }");
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        feedback0.setIdStudent((java.lang.Long) 1L);
        feedback0.setIdStudent((java.lang.Long) (-1L));
        feedback0.setIdStudent((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) (-1));
        com.engSoft.entities.types.ModalityEnum modalityEnum11 = feedback0.getModality();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setIdStudent((java.lang.Long) (-1L));
        feedback0.setWorkload((java.lang.Integer) 10);
        java.lang.Long long18 = feedback0.getId();
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertTrue("'" + modalityEnum11 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum11.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(long18);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
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
        java.lang.String str22 = courseDTO19.getCode();
        java.lang.String str23 = courseDTO19.getName();
        com.engSoft.entities.Course course25 = new com.engSoft.entities.Course(courseDTO19, (java.lang.Long) (-1L));
        java.lang.String str26 = courseDTO19.getInitialTime();
        java.lang.String str27 = courseDTO19.getInitialTime();
        course13.update(courseDTO19, (java.lang.Long) (-1L));
        java.lang.Long long30 = course13.getId();
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
        java.lang.String str56 = courseDTO50.getInitialTime();
        java.lang.String str57 = courseDTO50.getCode();
        java.lang.String str58 = courseDTO50.getCode();
        java.lang.String str59 = courseDTO50.getFinalTime();
        java.lang.String str60 = courseDTO50.getFinalTime();
        course13.update(courseDTO50, (java.lang.Long) (-1L));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str20, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str23, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(long42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str43, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str59, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str60, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        studentDTO2.setEmail("Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0} }");
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Integer int3 = feedbackDTO0.getPlanning();
        java.lang.Integer int4 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        java.lang.Integer int9 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        java.lang.Long long8 = feedbackDTO0.getIdCourse();
        java.lang.Integer int9 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback10 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int11 = feedbackDTO0.getMethodology();
        java.lang.Integer int12 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str3 = student0.getEmail();
        student0.setBanned((java.lang.Boolean) false);
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO7.setName("");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
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
        java.lang.Integer int10 = feedbackDTO0.getWorkload();
        java.lang.Integer int11 = feedbackDTO0.getPlanning();
        java.lang.Integer int12 = feedbackDTO0.getPlanning();
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
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=-1, name='null', email='null', nick='Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=35}", "Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}");
        java.lang.String str3 = studentDTO2.getName();
        studentDTO2.setName("Student{id=100, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=-1, name='null', email='null', nick='Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=35}" + "'", str3, "Student{id=-1, name='null', email='null', nick='Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=35}");
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Long long2 = feedback0.getId();
        feedback0.setCourseware((java.lang.Integer) 1);
        feedback0.setIdCourse((java.lang.Long) 0L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
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
        java.lang.String str32 = course0.getInitialTime();
        java.lang.Long long33 = course0.getId();
        java.lang.String str34 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO40 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str41 = courseDTO40.getName();
        java.lang.String str42 = courseDTO40.getInitialTime();
        java.lang.String str43 = courseDTO40.getCode();
        java.lang.String str44 = courseDTO40.getName();
        com.engSoft.entities.Course course46 = new com.engSoft.entities.Course(courseDTO40, (java.lang.Long) (-1L));
        java.lang.String str47 = courseDTO40.getInitialTime();
        java.lang.String str48 = courseDTO40.getFinalTime();
        course0.update(courseDTO40, (java.lang.Long) 10L);
        com.engSoft.entities.Course course52 = new com.engSoft.entities.Course(courseDTO40, (java.lang.Long) 100L);
        java.lang.String str53 = course52.getName();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(long33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str34, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str41, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str44, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str48, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str53, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("");
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher1);
        teacherDTO2.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
        teacherDTO2.setName("Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        com.engSoft.entities.Teacher teacher7 = new com.engSoft.entities.Teacher(teacherDTO2);
        teacher7.setName("Student{id=1, name='null', email='null', nick='hi!', isBanned=false, deletedComments=0}");
        com.engSoft.DTO.TeacherDTO teacherDTO10 = new com.engSoft.DTO.TeacherDTO(teacher7);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str6 = teacherDTO1.getName();
        java.lang.String str7 = teacherDTO1.getName();
        java.lang.String str8 = teacherDTO1.getName();
        teacherDTO1.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=0, planning=1, evaluationSystem=null, courseware=null, modality=null}");
        teacherDTO1.setName("Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
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
        teacherDTO11.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=10, methodology=null, planning=0, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        studentDTO2.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str5 = studentDTO2.getEmail();
        java.lang.String str6 = studentDTO2.getEmail();
        java.lang.String str7 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str5, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str6, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str7, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = courseDTO5.getFinalTime();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        java.lang.Long long12 = course11.getId();
        java.lang.String str13 = course11.getName();
        java.lang.String str14 = course11.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.Long long2 = course0.getId();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str9 = courseDTO8.getCode();
        course0.update(courseDTO8, (java.lang.Long) 0L);
        java.lang.String str12 = course0.toString();
        java.lang.String str13 = course0.getFinalTime();
        java.lang.String str14 = course0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str12, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getFinalTime();
        com.engSoft.entities.Course course12 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) (-1L));
        com.engSoft.DTO.CourseDTO courseDTO18 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str19 = courseDTO18.getName();
        course12.update(courseDTO18, (java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass22 = courseDTO18.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str19, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=null, deletedComments=32}");
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        student0.setName("Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=0}");
        java.lang.Boolean boolean8 = student0.getBanned();
        java.lang.String str9 = student0.getNick();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='Teacher{id=null, name= hi! }', idTeacher='100', initialTime='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', finalTime='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}'}");
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        java.lang.Long long9 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback10 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum11 = feedback10.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(modalityEnum11);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Long long2 = feedbackDTO0.getIdStudent();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Integer int4 = feedbackDTO0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback7.setPlanning((java.lang.Integer) 1);
        java.lang.Integer int10 = feedback7.getWorkload();
        java.lang.Long long11 = feedback7.getId();
        java.lang.Long long12 = feedback7.getId();
        feedback7.setCourseware((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.toString();
        java.lang.Long long5 = course0.getIdTeacher();
        java.lang.Long long6 = course0.getId();
        java.lang.String str7 = course0.getName();
        java.lang.String str8 = course0.getFinalTime();
        java.lang.String str9 = course0.getInitialTime();
        java.lang.Long long10 = course0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str4, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=null}", "Feedback{id=null, idCourse=10, idStudent=1, workload=null, methodology=0, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}", "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=null, deletedComments=10}");
        java.lang.String str2 = teacher1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=null, deletedComments=10} }" + "'", str2, "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=null, deletedComments=10} }");
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedback3.getCourseware();
        feedback3.setMethodology((java.lang.Integer) 100);
        java.lang.Integer int7 = feedback3.getPlanning();
        feedback3.setMethodology((java.lang.Integer) 35);
        java.lang.Long long10 = feedback3.getId();
        feedback3.setIdStudent((java.lang.Long) 100L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getPlanning();
        java.lang.Integer int4 = feedbackDTO0.getMethodology();
        java.lang.Long long5 = feedbackDTO0.getIdStudent();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
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
        java.lang.String str28 = courseDTO18.getInitialTime();
        java.lang.String str29 = courseDTO18.getNameTeacher();
        com.engSoft.entities.Course course31 = new com.engSoft.entities.Course(courseDTO18, (java.lang.Long) (-1L));
        java.lang.String str32 = course31.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str9, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}" + "'", str12, "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str24, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str27, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str29, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.Long long2 = teacher1.getId();
        java.lang.String str3 = teacher1.getName();
        java.lang.Long long4 = teacher1.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO5 = new com.engSoft.DTO.TeacherDTO(teacher1);
        teacher1.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=1, courseware=null, modality=REMOTE}");
        java.lang.String str8 = teacher1.toString();
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str3, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=1, courseware=null, modality=REMOTE} }" + "'", str8, "Teacher{id=null, name= Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=1, courseware=null, modality=REMOTE} }");
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=0, evaluationSystem=1, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = courseDTO5.getName();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str12 = courseDTO5.getFinalTime();
        java.lang.String str13 = courseDTO5.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean9 = student0.getBanned();
        student0.setName("Teacher{id=null, name= null }");
        com.engSoft.DTO.StudentDTO studentDTO12 = new com.engSoft.DTO.StudentDTO(student0);
        com.engSoft.DTO.StudentDTO studentDTO13 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        student0.setEmail("Teacher{id=null, name= hi! }");
        java.lang.String str11 = student0.toString();
        java.lang.String str12 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO13 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}" + "'", str11, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}" + "'", str12, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int3 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getInitialTime();
        com.engSoft.entities.Course course9 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        java.lang.String str10 = course9.getCode();
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getName();
        java.lang.String str18 = courseDTO16.getInitialTime();
        com.engSoft.entities.Course course20 = new com.engSoft.entities.Course(courseDTO16, (java.lang.Long) 0L);
        java.lang.String str21 = courseDTO16.getCode();
        com.engSoft.entities.Course course23 = new com.engSoft.entities.Course(courseDTO16, (java.lang.Long) 1L);
        java.lang.String str24 = courseDTO16.getInitialTime();
        course9.update(courseDTO16, (java.lang.Long) 100L);
        java.lang.String str27 = courseDTO16.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str7, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str10, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str17, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher6 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str7 = teacher6.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO8 = new com.engSoft.DTO.TeacherDTO(teacher6);
        java.lang.String str9 = teacher6.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= null }" + "'", str7, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=null, deletedComments=32}");
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedback6.getModality();
        java.lang.Integer int8 = feedback6.getPlanning();
        feedback6.setPlanning((java.lang.Integer) 0);
        feedback6.setWorkload((java.lang.Integer) 1);
        java.lang.Integer int13 = feedback6.getMethodology();
        java.lang.Long long14 = feedback6.getIdStudent();
        java.lang.Long long15 = feedback6.getIdCourse();
        java.lang.Class<?> wildcardClass16 = feedback6.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Long long5 = feedbackDTO0.getIdStudent();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        java.lang.Integer int8 = feedbackDTO0.getCourseware();
        java.lang.Integer int9 = feedbackDTO0.getPlanning();
        com.engSoft.entities.Feedback feedback10 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback10.setIdCourse((java.lang.Long) 1L);
        feedback10.setWorkload((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str3 = student0.getEmail();
        java.lang.String str4 = student0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setEvaluationSystem((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedback0.getModality();
        java.lang.Long long9 = feedback0.getId();
        java.lang.Long long10 = feedback0.getIdStudent();
        feedback0.setIdCourse((java.lang.Long) 0L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Boolean boolean5 = student0.getBanned();
        int int6 = student0.getDeletedComments();
        java.lang.Boolean boolean7 = student0.getBanned();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int8 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long4 = feedback3.getIdStudent();
        feedback3.setCourseware((java.lang.Integer) 97);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 10);
        java.lang.Integer int8 = feedback0.getEvaluationSystem();
        java.lang.Long long9 = feedback0.getId();
        java.lang.Long long10 = feedback0.getId();
        feedback0.setMethodology((java.lang.Integer) 0);
        java.lang.Integer int13 = feedback0.getEvaluationSystem();
        feedback0.setIdStudent((java.lang.Long) 1L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.String str4 = student0.toString();
        student0.setNick("Teacher{id=null, name=  }");
        java.lang.String str7 = student0.toString();
        java.lang.String str8 = student0.getNick();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str4, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='Teacher{id=null, name=  }', isBanned=true, deletedComments=0}" + "'", str7, "Student{id=null, name='null', email='null', nick='Teacher{id=null, name=  }', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name=  }" + "'", str8, "Teacher{id=null, name=  }");
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setEvaluationSystem((java.lang.Integer) 100);
        feedback0.setIdStudent((java.lang.Long) 1L);
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedback0.getModality();
        java.lang.Integer int9 = feedback0.getWorkload();
        java.lang.Integer int10 = feedback0.getPlanning();
        java.lang.Integer int11 = feedback0.getCourseware();
        java.lang.String str12 = feedback0.toString();
        com.engSoft.DTO.FeedbackDTO feedbackDTO13 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int14 = feedbackDTO13.getWorkload();
        java.lang.Integer int15 = feedbackDTO13.getMethodology();
        com.engSoft.entities.Feedback feedback16 = new com.engSoft.entities.Feedback(feedbackDTO13);
        java.lang.Integer int17 = feedbackDTO13.getCourseware();
        java.lang.Integer int18 = feedbackDTO13.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum19 = feedbackDTO13.getModality();
        java.lang.Integer int20 = feedbackDTO13.getWorkload();
        com.engSoft.entities.Feedback feedback21 = new com.engSoft.entities.Feedback(feedbackDTO13);
        com.engSoft.entities.Feedback feedback22 = new com.engSoft.entities.Feedback();
        java.lang.Long long23 = feedback22.getIdStudent();
        feedback22.setIdCourse((java.lang.Long) 100L);
        java.lang.Integer int26 = feedback22.getMethodology();
        com.engSoft.entities.Feedback feedback27 = new com.engSoft.entities.Feedback();
        java.lang.Integer int28 = feedback27.getEvaluationSystem();
        feedback27.setIdCourse((java.lang.Long) 1L);
        feedback27.setIdCourse((java.lang.Long) 10L);
        com.engSoft.entities.Feedback feedback33 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum34 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback33.setModality(modalityEnum34);
        feedback33.setIdStudent((java.lang.Long) 1L);
        java.lang.String str38 = feedback33.toString();
        feedback33.setIdCourse((java.lang.Long) 0L);
        com.engSoft.entities.types.ModalityEnum modalityEnum41 = com.engSoft.entities.types.ModalityEnum.PRESENTIAL;
        feedback33.setModality(modalityEnum41);
        feedback27.setModality(modalityEnum41);
        feedback22.setModality(modalityEnum41);
        feedback21.setModality(modalityEnum41);
        feedback0.setModality(modalityEnum41);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}" + "'", str12, "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(modalityEnum19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(long23);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertTrue("'" + modalityEnum34 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum34.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str38, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + modalityEnum41 + "' != '" + com.engSoft.entities.types.ModalityEnum.PRESENTIAL + "'", modalityEnum41.equals(com.engSoft.entities.types.ModalityEnum.PRESENTIAL));
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.toString();
        java.lang.String str2 = student0.getName();
        java.lang.String str3 = student0.getName();
        java.lang.Boolean boolean4 = student0.getBanned();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str1, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}", "Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', nick='hi!', isBanned=null, deletedComments=0}");
        java.lang.String str3 = studentDTO2.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student4 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', nick='hi!', isBanned=null, deletedComments=0}" + "'", str3, "Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', nick='hi!', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getName();
        java.lang.String str10 = courseDTO5.getCode();
        java.lang.String str11 = courseDTO5.getCode();
        java.lang.String str12 = courseDTO5.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Teacher{id=null, name= Teacher{id=null, name= Teacher{id=null, name= null } } }", "Teacher{id=null, name= Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0} }");
        java.lang.String str3 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name= Teacher{id=null, name= null } } }" + "'", str3, "Teacher{id=null, name= Teacher{id=null, name= Teacher{id=null, name= null } } }");
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getPlanning();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int8 = feedbackDTO0.getCourseware();
        com.engSoft.entities.types.ModalityEnum modalityEnum9 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(modalityEnum9);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
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
        com.engSoft.entities.Feedback feedback38 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum39 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback38.setModality(modalityEnum39);
        feedback38.setIdStudent((java.lang.Long) 1L);
        java.lang.String str43 = feedback38.toString();
        java.lang.Long long44 = feedback38.getId();
        feedback38.setMethodology((java.lang.Integer) 100);
        feedback38.setPlanning((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum49 = feedback38.getModality();
        feedback0.setModality(modalityEnum49);
        java.lang.Integer int51 = feedback0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertTrue("'" + modalityEnum32 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum32.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertTrue("'" + modalityEnum39 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum39.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str43, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long44);
        org.junit.Assert.assertTrue("'" + modalityEnum49 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum49.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(int51);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        java.lang.Integer int9 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getInitialTime();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.toString();
        java.lang.String str5 = course0.toString();
        java.lang.String str6 = course0.getFinalTime();
        java.lang.Long long7 = course0.getIdTeacher();
        java.lang.Long long8 = course0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str4, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str5, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Long long2 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(modalityEnum3);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        feedback0.setCourseware((java.lang.Integer) 100);
        java.lang.Integer int3 = feedback0.getEvaluationSystem();
        feedback0.setWorkload((java.lang.Integer) 100);
        java.lang.Integer int6 = feedback0.getMethodology();
        java.lang.Long long7 = feedback0.getIdStudent();
        java.lang.Long long8 = feedback0.getIdCourse();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}', isBanned=true, deletedComments=10}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=1, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=100, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.String str6 = courseDTO5.getFinalTime();
        java.lang.String str7 = courseDTO5.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=100, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=100, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=1, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=1, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback7.setPlanning((java.lang.Integer) 1);
        java.lang.Integer int10 = feedback7.getWorkload();
        java.lang.Long long11 = feedback7.getId();
        java.lang.Long long12 = feedback7.getId();
        feedback7.setCourseware((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int5 = feedback4.getMethodology();
        java.lang.Integer int6 = feedback4.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
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
        java.lang.Integer int10 = feedbackDTO0.getWorkload();
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
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        java.lang.Boolean boolean6 = student0.getBanned();
        java.lang.String str7 = student0.toString();
        java.lang.String str8 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO9 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str7, "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str8, "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        java.lang.Boolean boolean2 = student0.getBanned();
        java.lang.String str3 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        java.lang.String str6 = student0.getEmail();
        java.lang.String str7 = student0.getNick();
        java.lang.String str8 = student0.getNick();
        java.lang.String str9 = student0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str8, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        int int6 = student0.getDeletedComments();
        student0.setDeletedComments(10);
        com.engSoft.DTO.StudentDTO studentDTO9 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str10 = student0.getNick();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int8 = feedbackDTO0.getMethodology();
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        java.lang.Integer int10 = feedbackDTO0.getWorkload();
        java.lang.Long long11 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        student0.setEmail("Teacher{id=null, name= hi! }");
        student0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}");
        student0.setEmail("Teacher{id=null, name= Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} } }");
        com.engSoft.DTO.StudentDTO studentDTO15 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str16 = student0.toString();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student{id=null, name='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}', email='Teacher{id=null, name= Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} } }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}" + "'", str16, "Student{id=null, name='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}', email='Teacher{id=null, name= Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} } }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        student0.setEmail("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str9 = student0.getNick();
        java.lang.Long long10 = student0.getId();
        int int11 = student0.getDeletedComments();
        student0.setDeletedComments(35);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}", "Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}", "Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=0}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=null}", "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = courseDTO5.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=null}" + "'", str6, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        feedback0.setIdStudent((java.lang.Long) 100L);
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedback0.getModality();
        feedback0.setIdStudent((java.lang.Long) 10L);
        java.lang.Integer int7 = feedback0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum4);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} } }");
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
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
        java.lang.Long long11 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=-1, courseware=1, modality=null}");
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
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
        java.lang.Long long12 = feedbackDTO0.getIdStudent();
        java.lang.Integer int13 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(modalityEnum11);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
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
        java.lang.Class<?> wildcardClass15 = studentDTO12.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str8, "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        java.lang.String str4 = student0.getNick();
        student0.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        int int7 = student0.getDeletedComments();
        java.lang.Boolean boolean8 = student0.getBanned();
        java.lang.Long long9 = student0.getId();
        java.lang.Long long10 = student0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setId((java.lang.Long) 100L);
        java.lang.Boolean boolean7 = student0.getBanned();
        java.lang.String str8 = student0.getNick();
        student0.setId((java.lang.Long) 0L);
        java.lang.String str11 = student0.getName();
        student0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str14 = student0.getEmail();
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setName("Teacher{id=null, name= null }");
        java.lang.String str7 = student0.getEmail();
        java.lang.String str8 = student0.getNick();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str11 = student0.toString();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}" + "'", str11, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str9 = student0.getEmail();
        int int10 = student0.getDeletedComments();
        student0.setDeletedComments((int) (short) 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
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
        java.lang.String str44 = courseDTO37.getInitialTime();
        java.lang.String str45 = courseDTO37.getName();
        java.lang.String str46 = courseDTO37.getCode();
        java.lang.String str47 = courseDTO37.getCode();
        java.lang.String str48 = courseDTO37.getNameTeacher();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str45, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str48, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        java.lang.Long long9 = feedbackDTO0.getIdCourse();
        java.lang.Long long10 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback11 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int12 = feedback11.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=-1, planning=100, evaluationSystem=0, courseware=null, modality=REMOTE}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedback0.getModality();
        feedback0.setEvaluationSystem((java.lang.Integer) 10);
        feedback0.setMethodology((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setCourseware((java.lang.Integer) 1);
        java.lang.Integer int4 = feedback0.getWorkload();
        java.lang.String str5 = feedback0.toString();
        java.lang.String str6 = feedback0.toString();
        java.lang.Long long7 = feedback0.getIdCourse();
        java.lang.Integer int8 = feedback0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setName("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.Boolean boolean5 = student0.getBanned();
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=0, modality=null}");
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='null', email='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}", "Student{id=10, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=false, deletedComments=0}", "Teacher{id=null, name= Teacher{id=null, name= null } }", "Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}", "Student{id=null, name='null', email='Teacher{id=null, name=  }', nick='Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }", "Student{id=null, name='null', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=true, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=-1, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.Class<?> wildcardClass7 = courseDTO5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        java.lang.Long long4 = feedback0.getIdStudent();
        java.lang.Integer int5 = feedback0.getWorkload();
        java.lang.Integer int6 = feedback0.getCourseware();
        feedback0.setMethodology((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        java.lang.String str5 = student0.toString();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = student0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='hi!', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}" + "'", str8, "Student{id=null, name='hi!', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=null, name='null', email='null', nick='', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setEvaluationSystem((java.lang.Integer) 100);
        java.lang.Integer int6 = feedback0.getPlanning();
        feedback0.setIdStudent((java.lang.Long) 100L);
        feedback0.setMethodology((java.lang.Integer) 10);
        feedback0.setPlanning((java.lang.Integer) 10);
        feedback0.setWorkload((java.lang.Integer) 97);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=0, evaluationSystem=10, courseware=1, modality=null}");
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(0);
        student0.setEmail("Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}");
        student0.setDeletedComments((int) (byte) 100);
        java.lang.String str13 = student0.getName();
        student0.setNick("Student{id=0, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Long long8 = feedbackDTO0.getIdCourse();
        java.lang.Integer int9 = feedbackDTO0.getPlanning();
        java.lang.Long long10 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setId((java.lang.Long) 100L);
        java.lang.Boolean boolean7 = student0.getBanned();
        java.lang.String str8 = student0.getNick();
        student0.setId((java.lang.Long) 0L);
        java.lang.String str11 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO12 = new com.engSoft.DTO.StudentDTO(student0);
        int int13 = student0.getDeletedComments();
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        java.lang.String str11 = courseDTO7.getCode();
        java.lang.String str12 = courseDTO7.getFinalTime();
        java.lang.String str13 = courseDTO7.getNameTeacher();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher6 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher7 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str8 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher9 = new com.engSoft.entities.Teacher(teacherDTO1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        int int5 = student0.getDeletedComments();
        student0.setEmail("Teacher{id=null, name=  }");
        java.lang.Long long8 = student0.getId();
        student0.setNick("Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str11 = student0.toString();
        java.lang.String str12 = student0.getNick();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=null, name='null', email='Teacher{id=null, name=  }', nick='Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}" + "'", str11, "Student{id=null, name='null', email='Teacher{id=null, name=  }', nick='Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str12, "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
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
        java.lang.Long long10 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("", "Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null}', isBanned=false, deletedComments=0}", "Student{id=100, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=10}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=-1, evaluationSystem=null, courseware=0, modality=PRESENTIAL}");
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        com.engSoft.entities.Course course10 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str11 = courseDTO5.getNameTeacher();
        java.lang.String str12 = courseDTO5.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
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
        java.lang.Long long43 = course0.getId();
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
        org.junit.Assert.assertNull(long43);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        student0.setName("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = student0.getNick();
        student0.setDeletedComments(35);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        student0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }");
        java.lang.Long long2 = teacher1.getId();
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("hi!");
        java.lang.String str2 = teacher1.getName();
        java.lang.Long long3 = teacher1.getId();
        java.lang.String str4 = teacher1.getName();
        teacher1.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long7 = teacher1.getId();
        java.lang.String str8 = teacher1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}" + "'", str8, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("");
        teacher0.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        teacher0.setName("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        java.lang.Long long8 = teacher0.getId();
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.String str4 = student0.toString();
        student0.setNick("Teacher{id=null, name=  }");
        student0.setDeletedComments(0);
        student0.setDeletedComments((int) (byte) 1);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str4, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Teacher{id=null, name= hi! }");
        student0.setId((java.lang.Long) 1L);
        java.lang.String str9 = student0.getName();
        student0.setName("Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }");
        student0.setDeletedComments(35);
        student0.setDeletedComments((-1));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str9, "Teacher{id=null, name= hi! }");
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("");
        teacher0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = teacher0.toString();
        java.lang.Long long7 = teacher0.getId();
        java.lang.String str8 = teacher0.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO9 = new com.engSoft.DTO.TeacherDTO(teacher0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }" + "'", str6, "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }");
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }" + "'", str8, "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }");
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=-1, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
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
        java.lang.String str24 = courseDTO18.getCode();
        com.engSoft.entities.Course course26 = new com.engSoft.entities.Course(courseDTO18, (java.lang.Long) 0L);
        com.engSoft.entities.Course course28 = new com.engSoft.entities.Course(courseDTO18, (java.lang.Long) 100L);
        java.lang.String str29 = course28.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str19, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str29, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
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
        java.lang.String str30 = course0.getFinalTime();
        java.lang.String str31 = course0.getFinalTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str30, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str31, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean9 = student0.getBanned();
        java.lang.Long long10 = student0.getId();
        java.lang.String str11 = student0.getName();
        student0.setEmail("");
        student0.setDeletedComments(0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 100);
        java.lang.Integer int8 = feedback0.getMethodology();
        feedback0.setCourseware((java.lang.Integer) 10);
        feedback0.setCourseware((java.lang.Integer) 0);
        feedback0.setCourseware((java.lang.Integer) (-1));
        java.lang.String str15 = feedback0.toString();
        feedback0.setEvaluationSystem((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=100, evaluationSystem=null, courseware=-1, modality=null}" + "'", str15, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=100, evaluationSystem=null, courseware=-1, modality=null}");
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
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
        java.lang.String str18 = course14.getInitialTime();
        java.lang.String str19 = course14.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str19, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        feedback0.setIdStudent((java.lang.Long) 1L);
        java.lang.String str5 = feedback0.toString();
        feedback0.setIdCourse((java.lang.Long) 0L);
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = com.engSoft.entities.types.ModalityEnum.PRESENTIAL;
        feedback0.setModality(modalityEnum8);
        java.lang.String str10 = feedback0.toString();
        java.lang.Integer int11 = feedback0.getMethodology();
        java.lang.String str12 = feedback0.toString();
        java.lang.Long long13 = feedback0.getId();
        feedback0.setCourseware((java.lang.Integer) 97);
        feedback0.setIdStudent((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + modalityEnum8 + "' != '" + com.engSoft.entities.types.ModalityEnum.PRESENTIAL + "'", modalityEnum8.equals(com.engSoft.entities.types.ModalityEnum.PRESENTIAL));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}" + "'", str10, "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}" + "'", str12, "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        org.junit.Assert.assertNull(long13);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Teacher{id=null, name= hi! }");
        java.lang.Long long7 = student0.getId();
        student0.setId((java.lang.Long) 0L);
        java.lang.String str10 = student0.getName();
        java.lang.Boolean boolean11 = student0.getBanned();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str10, "Teacher{id=null, name= hi! }");
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        java.lang.Long long2 = teacher1.getId();
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 1L);
        java.lang.String str9 = courseDTO5.getNameTeacher();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str12 = course11.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str7 = student0.toString();
        java.lang.String str8 = student0.getName();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=null}");
        java.lang.String str11 = student0.getEmail();
        java.lang.String str12 = student0.getNick();
        java.lang.String str13 = student0.getEmail();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str7, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=null}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=null}");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=null}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=null}");
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Long long2 = feedback0.getId();
        java.lang.String str3 = feedback0.toString();
        java.lang.Long long4 = feedback0.getId();
        java.lang.Integer int5 = feedback0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0} }");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.Long long2 = course0.getId();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str9 = courseDTO8.getCode();
        course0.update(courseDTO8, (java.lang.Long) 0L);
        java.lang.String str12 = courseDTO8.getName();
        com.engSoft.entities.Course course14 = new com.engSoft.entities.Course(courseDTO8, (java.lang.Long) (-1L));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str3 = studentDTO2.getEmail();
        java.lang.String str4 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str3, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}" + "'", str4, "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=REMOTE}");
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher1);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getCode();
        java.lang.String str5 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO11 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str12 = courseDTO11.getName();
        java.lang.String str13 = courseDTO11.getInitialTime();
        java.lang.String str14 = courseDTO11.getCode();
        java.lang.String str15 = courseDTO11.getName();
        com.engSoft.entities.Course course17 = new com.engSoft.entities.Course(courseDTO11, (java.lang.Long) 100L);
        java.lang.String str18 = courseDTO11.getCode();
        java.lang.String str19 = courseDTO11.getFinalTime();
        course0.update(courseDTO11, (java.lang.Long) (-1L));
        java.lang.String str22 = course0.getCode();
        java.lang.String str23 = course0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str19, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str23, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getNick();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments((int) (byte) 1);
        java.lang.String str10 = student0.getName();
        student0.setBanned((java.lang.Boolean) true);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        teacherDTO1.setName("");
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str6 = teacherDTO1.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
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
        java.lang.Long long10 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=0, modality=null}");
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setId((java.lang.Long) 100L);
        java.lang.Boolean boolean7 = student0.getBanned();
        java.lang.String str8 = student0.getNick();
        student0.setId((java.lang.Long) 0L);
        java.lang.String str11 = student0.getName();
        java.lang.String str12 = student0.getName();
        student0.setName("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}");
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher1);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO2);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO2);
        java.lang.String str5 = teacher4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0} }" + "'", str5, "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0} }");
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback3.setPlanning((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setEvaluationSystem((java.lang.Integer) (-1));
        java.lang.Integer int4 = feedback0.getMethodology();
        feedback0.setMethodology((java.lang.Integer) 0);
        feedback0.setPlanning((java.lang.Integer) 100);
        java.lang.Long long9 = feedback0.getId();
        java.lang.Long long10 = feedback0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getName();
        java.lang.String str8 = courseDTO5.getFinalTime();
        com.engSoft.entities.Course course10 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str11 = course10.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}'}" + "'", str11, "Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}'}");
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=PRESENTIAL}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=0, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        int int2 = student0.getDeletedComments();
        java.lang.Boolean boolean3 = student0.getBanned();
        student0.setNick("");
        java.lang.String str6 = student0.getName();
        student0.setId((java.lang.Long) 10L);
        com.engSoft.DTO.StudentDTO studentDTO9 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str10 = studentDTO9.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("hi!");
        java.lang.String str2 = teacher1.getName();
        java.lang.Long long3 = teacher1.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher1);
        java.lang.String str5 = teacherDTO4.getName();
        java.lang.String str6 = teacherDTO4.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        int int7 = student0.getDeletedComments();
        java.lang.String str8 = student0.toString();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}" + "'", str8, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        java.lang.String str5 = student0.toString();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str10 = student0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        feedback0.setCourseware((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedback0.getModality();
        java.lang.Integer int5 = feedback0.getPlanning();
        java.lang.Integer int6 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setMethodology((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
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
        java.lang.String str27 = courseDTO16.getInitialTime();
        com.engSoft.entities.Course course29 = new com.engSoft.entities.Course(courseDTO16, (java.lang.Long) 0L);
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
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=0, planning=1, evaluationSystem=null, courseware=null, modality=null}");
        teacher1.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.String str4 = teacher1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null} }" + "'", str4, "Teacher{id=null, name= Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null} }");
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Long long1 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(modalityEnum2);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        java.lang.Integer int8 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.Long long1 = course0.getId();
        java.lang.String str2 = course0.getCode();
        java.lang.Long long3 = course0.getId();
        java.lang.String str4 = course0.getName();
        java.lang.Long long5 = course0.getIdTeacher();
        java.lang.String str6 = course0.toString();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str6, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum6 = feedbackDTO0.getModality();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        java.lang.Integer int9 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}");
        java.lang.String str2 = customErrorType1.getErrorMessage();
        java.lang.String str3 = customErrorType1.getErrorMessage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}" + "'", str2, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}" + "'", str3, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
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
        student0.setNick("Student{id=null, name='hi!', email='null', nick='Teacher{id=null, name=  }', isBanned=null, deletedComments=0}");
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=100, planning=10, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}", "Teacher{id=null, name= Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0} }", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=null, name='null', email='Teacher{id=null, name=  }', nick='Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}", "Teacher{id=null, name= Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} } }");
        java.lang.String str6 = courseDTO5.getInitialTime();
        java.lang.String str7 = courseDTO5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='Teacher{id=null, name=  }', nick='Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}" + "'", str6, "Student{id=null, name='null', email='Teacher{id=null, name=  }', nick='Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}" + "'", str7, "Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long8 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getMethodology();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        java.lang.Integer int8 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback9 = new com.engSoft.entities.Feedback(feedbackDTO0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        java.lang.Long long4 = student0.getId();
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str7 = student0.getNick();
        student0.setDeletedComments((int) (byte) -1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        java.lang.String str3 = student0.getNick();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setName("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        java.lang.String str8 = student0.toString();
        student0.setNick("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=10, planning=null, evaluationSystem=null, courseware=1, modality=null} }");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str8, "Student{id=null, name='Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
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
        java.lang.String str25 = course0.getCode();
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
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long4 = teacher0.getId();
        java.lang.String str5 = teacher0.toString();
        java.lang.Long long6 = teacher0.getId();
        java.lang.String str7 = teacher0.getName();
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
        java.lang.Long long10 = teacher0.getId();
        java.lang.String str11 = teacher0.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO12 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.Class<?> wildcardClass13 = teacher0.getClass();
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE} }" + "'", str11, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE} }");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str3 = teacher0.toString();
        java.lang.Long long4 = teacher0.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO5 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str6 = teacherDTO5.getName();
        com.engSoft.entities.Teacher teacher7 = new com.engSoft.entities.Teacher(teacherDTO5);
        com.engSoft.entities.Teacher teacher8 = new com.engSoft.entities.Teacher(teacherDTO5);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name= null }" + "'", str3, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        java.lang.String str3 = student0.getNick();
        java.lang.String str4 = student0.getNick();
        java.lang.Long long5 = student0.getId();
        student0.setEmail("Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setEmail("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.String str7 = student0.getEmail();
        student0.setNick("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setNick("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=-1, planning=null, evaluationSystem=1, courseware=1, modality=REMOTE}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.Long long4 = student0.getId();
        student0.setDeletedComments(0);
        student0.setId((java.lang.Long) 0L);
        java.lang.String str9 = student0.getName();
        java.lang.String str10 = student0.getEmail();
        student0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}");
        student0.setDeletedComments(1);
        student0.setName("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
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
        com.engSoft.entities.Course course44 = new com.engSoft.entities.Course(courseDTO37, (java.lang.Long) 10L);
        com.engSoft.entities.Course course46 = new com.engSoft.entities.Course(courseDTO37, (java.lang.Long) 0L);
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
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setIdCourse((java.lang.Long) 0L);
        java.lang.Long long8 = feedback0.getId();
        java.lang.Long long9 = feedback0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
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
        java.lang.String str18 = course14.getInitialTime();
        java.lang.String str19 = course14.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str19, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        java.lang.String str3 = studentDTO2.getEmail();
        studentDTO2.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}");
        studentDTO2.setEmail("Student{id=10, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str8 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str3, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        student0.setName("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = student0.getNick();
        java.lang.String str7 = student0.getNick();
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        com.engSoft.DTO.StudentDTO studentDTO9 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=0, evaluationSystem=10, courseware=1, modality=null}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=null}");
        java.lang.String str3 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=0, evaluationSystem=10, courseware=1, modality=null}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=0, evaluationSystem=10, courseware=1, modality=null}");
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Student{id=null, name='Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=true, deletedComments=10}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', idTeacher='1', initialTime='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}', finalTime='Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}'}", "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=true, deletedComments=0} }", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        int int1 = student0.getDeletedComments();
        java.lang.String str2 = student0.getNick();
        student0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
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
        java.lang.String str20 = course19.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=100, modality=null}", "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=null, deletedComments=10} }");
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.toString();
        java.lang.String str2 = student0.toString();
        java.lang.String str3 = student0.getNick();
        java.lang.Boolean boolean4 = student0.getBanned();
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}'}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str1, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str2, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.String str6 = courseDTO5.getInitialTime();
        java.lang.String str7 = courseDTO5.getFinalTime();
        com.engSoft.entities.Course course9 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
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
        java.lang.Integer int13 = feedbackDTO0.getWorkload();
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
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("");
        java.lang.Long long9 = student0.getId();
        java.lang.String str10 = student0.getName();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
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
        java.lang.Long long12 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getWorkload();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum6 = feedbackDTO0.getModality();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='null', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', isBanned=true, deletedComments=97}", "Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}", "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=null, deletedComments=10}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='Teacher{id=null, name= hi! }', idTeacher='100', initialTime='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', finalTime='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}'}");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.String str5 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str5, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        java.lang.Long long9 = feedbackDTO0.getIdCourse();
        java.lang.Long long10 = feedbackDTO0.getIdStudent();
        java.lang.Long long11 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        java.lang.String str3 = student0.getNick();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setEmail("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO2);
        teacher3.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        java.lang.String str6 = teacher3.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher3);
        teacherDTO7.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}");
        com.engSoft.entities.Teacher teacher10 = new com.engSoft.entities.Teacher(teacherDTO7);
        java.lang.String str11 = teacher10.getName();
        teacher10.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }" + "'", str6, "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}" + "'", str11, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        java.lang.String str3 = studentDTO2.getName();
        studentDTO2.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}");
        studentDTO2.setName("Student{id=null, name='hi!', email='Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}', nick='', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = courseDTO5.getNameTeacher();
        java.lang.String str10 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long6 = feedback5.getIdCourse();
        java.lang.Integer int7 = feedback5.getPlanning();
        java.lang.Integer int8 = feedback5.getWorkload();
        java.lang.Long long9 = feedback5.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum10 = feedback5.getModality();
        feedback5.setIdStudent((java.lang.Long) 10L);
        java.lang.Integer int13 = feedback5.getEvaluationSystem();
        feedback5.setIdStudent((java.lang.Long) 10L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(modalityEnum10);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getName();
        java.lang.String str8 = courseDTO5.getFinalTime();
        com.engSoft.entities.Course course10 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str11 = courseDTO5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Teacher{id=null, name= hi! }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        com.engSoft.entities.Course course7 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        java.lang.String str8 = course7.getCode();
        java.lang.String str9 = course7.getCode();
        java.lang.String str10 = course7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str8, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}', idTeacher='100', initialTime='Teacher{id=null, name= hi! }', finalTime='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}'}" + "'", str10, "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}', idTeacher='100', initialTime='Teacher{id=null, name= hi! }', finalTime='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}'}");
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str3 = teacher0.getName();
        java.lang.Long long4 = teacher0.getId();
        java.lang.String str5 = teacher0.toString();
        java.lang.String str6 = teacher0.toString();
        teacher0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=null, deletedComments=35}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= null }" + "'", str6, "Teacher{id=null, name= null }");
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacher0.getName();
        java.lang.Long long5 = teacher0.getId();
        java.lang.String str6 = teacher0.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacherDTO7.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=-1, planning=null, evaluationSystem=1, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= hi! }");
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher1);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Student{id=null, name='Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
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
        student0.setBanned((java.lang.Boolean) true);
        student0.setEmail("Feedback{id=null, idCourse=10, idStudent=1, workload=null, methodology=0, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Long long18 = student0.getId();
        int int19 = student0.getDeletedComments();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        java.lang.String str4 = student0.getNick();
        int int5 = student0.getDeletedComments();
        student0.setDeletedComments((int) '#');
        student0.setNick("Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        com.engSoft.DTO.StudentDTO studentDTO10 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
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
        java.lang.Integer int14 = feedbackDTO0.getCourseware();
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
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setName("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        student0.setName("Teacher{id=null, name= Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null}', isBanned=false, deletedComments=0} }");
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str4 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher6 = new com.engSoft.entities.Teacher(teacherDTO1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }" + "'", str4, "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }");
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.Long long4 = student0.getId();
        student0.setDeletedComments(0);
        student0.setId((java.lang.Long) 0L);
        java.lang.String str9 = student0.getName();
        java.lang.String str10 = student0.getEmail();
        student0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}");
        java.lang.Boolean boolean13 = student0.getBanned();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        int int1 = student0.getDeletedComments();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.Long long3 = student0.getId();
        student0.setName("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.Long long4 = student0.getId();
        student0.setDeletedComments(0);
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO7.setName("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        studentDTO7.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("hi!");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str3 = teacher2.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher2);
        com.engSoft.DTO.TeacherDTO teacherDTO5 = new com.engSoft.DTO.TeacherDTO(teacher2);
        java.lang.String str6 = teacher2.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str6, "Teacher{id=null, name= hi! }");
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=1, name='Teacher{id=null, name= hi! }', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}', isBanned=null, deletedComments=0}", "Teacher{id=null, name= Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} } }", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }", "Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }");
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=0, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name=  }");
        java.lang.Long long2 = teacher1.getId();
        teacher1.setName("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.Long long5 = teacher1.getId();
        java.lang.Long long6 = teacher1.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher1);
        java.lang.String str8 = teacher1.toString();
        java.lang.Long long9 = teacher1.getId();
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0} }" + "'", str8, "Teacher{id=null, name= Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0} }");
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Long long2 = feedback0.getId();
        feedback0.setCourseware((java.lang.Integer) 1);
        feedback0.setMethodology((java.lang.Integer) 1);
        java.lang.Long long7 = feedback0.getId();
        feedback0.setCourseware((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
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
        java.lang.String str32 = course0.getInitialTime();
        java.lang.String str33 = course0.getCode();
        java.lang.String str34 = course0.getCode();
        java.lang.String str35 = course0.getFinalTime();
        java.lang.String str36 = course0.getInitialTime();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str35, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setName("Teacher{id=null, name= null }");
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
        java.lang.String str9 = student0.getNick();
        student0.setName("Teacher{id=null, name= Teacher{id=null, name=  } }");
        java.lang.String str12 = student0.getEmail();
        student0.setNick("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }");
        java.lang.String str15 = student0.getName();
        java.lang.String str16 = student0.getEmail();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name=  } }" + "'", str15, "Teacher{id=null, name= Teacher{id=null, name=  } }");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        java.lang.Integer int2 = feedback0.getPlanning();
        java.lang.String str3 = feedback0.toString();
        feedback0.setCourseware((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        studentDTO2.setEmail("Student{id=null, name='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}");
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
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
        java.lang.String str24 = courseDTO18.getName();
        java.lang.String str25 = courseDTO18.getName();
        com.engSoft.entities.Course course27 = new com.engSoft.entities.Course(courseDTO18, (java.lang.Long) 100L);
        java.lang.String str28 = course27.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str19, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str24, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str25, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str28, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments((int) (byte) -1);
        student0.setBanned((java.lang.Boolean) false);
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.Boolean boolean11 = student0.getBanned();
        student0.setDeletedComments((int) (byte) 10);
        student0.setEmail("Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0} }");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Integer int4 = feedbackDTO0.getWorkload();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        java.lang.Integer int9 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int10 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedback0.getModality();
        feedback0.setWorkload((java.lang.Integer) (-1));
        feedback0.setCourseware((java.lang.Integer) 1);
        java.lang.Long long8 = feedback0.getId();
        com.engSoft.entities.types.ModalityEnum modalityEnum9 = feedback0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(modalityEnum9);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum8);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }");
        java.lang.String str6 = courseDTO5.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str6, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
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
        com.engSoft.DTO.CourseDTO courseDTO49 = new com.engSoft.DTO.CourseDTO("Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        course0.update(courseDTO49, (java.lang.Long) (-1L));
        java.lang.String str52 = courseDTO49.getName();
        java.lang.String str53 = courseDTO49.getName();
        java.lang.String str54 = courseDTO49.getFinalTime();
        com.engSoft.entities.Course course56 = new com.engSoft.entities.Course(courseDTO49, (java.lang.Long) 1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}" + "'", str52, "Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}" + "'", str53, "Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str54, "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        com.engSoft.DTO.StudentDTO studentDTO9 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO9.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}");
        studentDTO9.setEmail("Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}");
        studentDTO9.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.String str5 = student0.toString();
        java.lang.String str6 = student0.getNick();
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
        com.engSoft.DTO.StudentDTO studentDTO9 = new com.engSoft.DTO.StudentDTO(student0);
        int int10 = student0.getDeletedComments();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}" + "'", str5, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
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
        java.lang.String str24 = courseDTO18.getCode();
        java.lang.String str25 = courseDTO18.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str19, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str25, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        int int1 = student0.getDeletedComments();
        java.lang.Long long2 = student0.getId();
        java.lang.String str3 = student0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str3, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Teacher{id=null, name=  }");
        java.lang.Boolean boolean9 = student0.getBanned();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=100, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=10}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}", "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=PRESENTIAL}", "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
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
        student0.setBanned((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.Boolean boolean2 = student0.getBanned();
        student0.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=100}");
        student0.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=-1, planning=null, evaluationSystem=1, courseware=null, modality=REMOTE}");
        student0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        java.lang.Integer int9 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.Long long4 = teacher3.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO5 = new com.engSoft.DTO.TeacherDTO(teacher3);
        java.lang.Long long6 = teacher3.getId();
        java.lang.Long long7 = teacher3.getId();
        java.lang.String str8 = teacher3.getName();
        java.lang.String str9 = teacher3.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Teacher{id=null, name= null }" + "'", str9, "Teacher{id=null, name= null }");
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("");
        java.lang.String str2 = teacher1.getName();
        teacher1.setName("");
        java.lang.String str5 = teacher1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Teacher{id=null, name=  }");
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        student0.setNick("Feedback{id=null, idCourse=1, idStudent=null, workload=0, methodology=10, planning=100, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.Boolean boolean2 = student0.getBanned();
        student0.setNick("Teacher{id=null, name= hi! }");
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        int int7 = student0.getDeletedComments();
        java.lang.Long long8 = student0.getId();
        java.lang.Long long9 = student0.getId();
        student0.setNick("Student{id=-1, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        feedback0.setMethodology((java.lang.Integer) 0);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
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
        java.lang.Class<?> wildcardClass14 = feedbackDTO0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int7);
    }
}

