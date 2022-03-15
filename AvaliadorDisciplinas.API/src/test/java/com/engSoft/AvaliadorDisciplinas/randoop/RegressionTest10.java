package com.engSoft.AvaliadorDisciplinas.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getFinalTime();
        java.lang.String str8 = courseDTO5.getName();
        com.engSoft.entities.Course course10 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        java.lang.String str11 = courseDTO5.getCode();
        java.lang.String str12 = courseDTO5.getFinalTime();
        java.lang.String str13 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        java.lang.String str6 = student0.getName();
        student0.setId((java.lang.Long) 0L);
        student0.setName("Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=0}");
        java.lang.Boolean boolean11 = student0.getBanned();
        student0.setEmail("Teacher{id=null, name= Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0} }");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getPlanning();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int8 = feedbackDTO0.getCourseware();
        java.lang.Integer int9 = feedbackDTO0.getMethodology();
        java.lang.Integer int10 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        java.lang.Integer int8 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("hi!");
        java.lang.String str2 = teacher1.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher1);
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str2, "Teacher{id=null, name= hi! }");
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        studentDTO2.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str5 = studentDTO2.getName();
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
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
        java.lang.String str26 = course25.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str22, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str7 = student0.toString();
        java.lang.String str8 = student0.getName();
        student0.setDeletedComments((int) (byte) 10);
        com.engSoft.DTO.StudentDTO studentDTO11 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str7, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
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
        java.lang.Integer int12 = feedback6.getPlanning();
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
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}", "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=100, modality=null}");
        java.lang.String str6 = courseDTO5.getFinalTime();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        java.lang.String str9 = course8.getFinalTime();
        java.lang.String str10 = course8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=100, modality=null}" + "'", str6, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=100, modality=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=100, modality=null}" + "'", str9, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=100, modality=null}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str10, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}", "Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}", "Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=0}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=null}", "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}");
        com.engSoft.entities.Course course7 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        com.engSoft.DTO.CourseDTO courseDTO13 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "", "hi!", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Teacher{id=null, name= null }");
        java.lang.String str14 = courseDTO13.getName();
        java.lang.String str15 = courseDTO13.getCode();
        course7.update(courseDTO13, (java.lang.Long) 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str14, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        java.lang.Boolean boolean2 = student0.getBanned();
        java.lang.String str3 = student0.toString();
        student0.setBanned((java.lang.Boolean) false);
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        int int7 = student0.getDeletedComments();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str3, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getInitialTime();
        course0.update(courseDTO16, (java.lang.Long) (-1L));
        java.lang.String str20 = course0.getFinalTime();
        java.lang.String str21 = course0.getName();
        java.lang.Long long22 = course0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str20, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long22);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=1, idStudent=-1, workload=null, methodology=1, planning=0, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=null, deletedComments=10} }");
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        java.lang.Integer int7 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setDeletedComments(100);
        java.lang.String str9 = student0.getNick();
        student0.setBanned((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum6 = feedbackDTO0.getModality();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        java.lang.Integer int8 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback9 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum10 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(modalityEnum10);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
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
        com.engSoft.entities.Course course24 = new com.engSoft.entities.Course(courseDTO15, (java.lang.Long) (-1L));
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
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        com.engSoft.entities.Course course10 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        java.lang.Long long11 = course10.getId();
        com.engSoft.DTO.CourseDTO courseDTO17 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str18 = courseDTO17.getName();
        java.lang.String str19 = courseDTO17.getInitialTime();
        java.lang.String str20 = courseDTO17.getCode();
        java.lang.String str21 = courseDTO17.getName();
        com.engSoft.entities.Course course23 = new com.engSoft.entities.Course(courseDTO17, (java.lang.Long) 100L);
        java.lang.String str24 = courseDTO17.getCode();
        java.lang.String str25 = courseDTO17.getFinalTime();
        course10.update(courseDTO17, (java.lang.Long) (-1L));
        java.lang.String str28 = courseDTO17.getCode();
        java.lang.String str29 = courseDTO17.getName();
        java.lang.String str30 = courseDTO17.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str18, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str25, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str29, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
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
        com.engSoft.entities.Feedback feedback12 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int13 = feedbackDTO0.getWorkload();
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
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.Boolean boolean2 = student0.getBanned();
        student0.setNick("Teacher{id=null, name= hi! }");
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str7 = student0.getNick();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=10, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.Boolean boolean10 = student0.getBanned();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str7, "Teacher{id=null, name= hi! }");
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedback3.getCourseware();
        feedback3.setMethodology((java.lang.Integer) 100);
        java.lang.Integer int7 = feedback3.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedback3.getModality();
        java.lang.Integer int9 = feedback3.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback8 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int9 = feedback8.getEvaluationSystem();
        java.lang.Long long10 = feedback8.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Boolean boolean3 = student0.getBanned();
        java.lang.Boolean boolean4 = student0.getBanned();
        java.lang.String str5 = student0.toString();
        java.lang.String str6 = student0.toString();
        java.lang.String str7 = student0.getName();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str5, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str6, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(0);
        student0.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
        java.lang.String str11 = student0.toString();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}', nick='null', isBanned=null, deletedComments=0}" + "'", str11, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long4 = teacher0.getId();
        java.lang.String str5 = teacher0.toString();
        java.lang.String str6 = teacher0.toString();
        java.lang.Long long7 = teacher0.getId();
        java.lang.Long long8 = teacher0.getId();
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO2);
        teacher3.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        java.lang.String str6 = teacher3.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher3);
        java.lang.String str8 = teacherDTO7.getName();
        teacherDTO7.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
        java.lang.String str11 = teacherDTO7.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }" + "'", str6, "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str8, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str11, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        java.lang.Long long11 = course0.getId();
        java.lang.String str12 = course0.getName();
        java.lang.String str13 = course0.toString();
        com.engSoft.entities.Course course14 = new com.engSoft.entities.Course();
        java.lang.String str15 = course14.getInitialTime();
        java.lang.String str16 = course14.getInitialTime();
        com.engSoft.DTO.CourseDTO courseDTO22 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "", "hi!", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Teacher{id=null, name= null }");
        java.lang.String str23 = courseDTO22.getName();
        course14.update(courseDTO22, (java.lang.Long) (-1L));
        java.lang.String str26 = course14.toString();
        com.engSoft.DTO.CourseDTO courseDTO32 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str33 = courseDTO32.getCode();
        com.engSoft.entities.Course course35 = new com.engSoft.entities.Course(courseDTO32, (java.lang.Long) 10L);
        com.engSoft.entities.Course course37 = new com.engSoft.entities.Course(courseDTO32, (java.lang.Long) 10L);
        java.lang.String str38 = courseDTO32.getName();
        course14.update(courseDTO32, (java.lang.Long) 0L);
        java.lang.String str41 = courseDTO32.getName();
        java.lang.String str42 = courseDTO32.getNameTeacher();
        java.lang.String str43 = courseDTO32.getFinalTime();
        course0.update(courseDTO32, (java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str13, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str23, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}" + "'", str26, "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str38, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str41, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str42, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str43, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        java.lang.String str2 = teacher1.getName();
        java.lang.String str3 = teacher1.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str2, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str3, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        java.lang.String str5 = student0.getEmail();
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setNick("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        student0.setEmail("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        student0.setName("Teacher{id=null, name= Teacher{id=null, name=  } }");
        student0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
        student0.setDeletedComments((int) (short) 0);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        java.lang.Boolean boolean2 = student0.getBanned();
        java.lang.String str3 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback8 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.toString();
        student0.setName("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str4, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        int int6 = student0.getDeletedComments();
        student0.setDeletedComments(10);
        com.engSoft.DTO.StudentDTO studentDTO9 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        int int12 = student0.getDeletedComments();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        com.engSoft.DTO.StudentDTO studentDTO1 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.Long long2 = student0.getId();
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setName("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.Boolean boolean5 = student0.getBanned();
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=REMOTE}");
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Teacher{id=null, name= Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0} }", "Teacher{id=null, name= Teacher{id=null, name= Teacher{id=null, name= null } } }", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=null, deletedComments=35}", "Student{id=-1, name='null', email='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        int int5 = student0.getDeletedComments();
        int int6 = student0.getDeletedComments();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str8 = student0.getName();
        student0.setName("Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
        student0.setBanned((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null}', isBanned=false, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=PRESENTIAL}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=100, planning=10, evaluationSystem=null, courseware=null, modality=REMOTE}", "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=null, deletedComments=32} }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str6 = courseDTO5.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str6, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str7 = student0.toString();
        java.lang.String str8 = student0.getNick();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setEvaluationSystem((java.lang.Integer) 100);
        java.lang.Integer int6 = feedback0.getPlanning();
        feedback0.setIdStudent((java.lang.Long) 100L);
        feedback0.setIdStudent((java.lang.Long) 100L);
        java.lang.Long long11 = feedback0.getId();
        com.engSoft.entities.types.ModalityEnum modalityEnum12 = feedback0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(modalityEnum12);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=0, modality=null}");
        java.lang.String str2 = teacher1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=0, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=0, modality=null}");
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
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
        com.engSoft.DTO.CourseDTO courseDTO35 = new com.engSoft.DTO.CourseDTO("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=10, planning=null, evaluationSystem=null, courseware=1, modality=null} }", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}", "Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}", "Student{id=null, name='Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=true, deletedComments=10}");
        course14.update(courseDTO35, (java.lang.Long) 100L);
        com.engSoft.DTO.CourseDTO courseDTO43 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        course14.update(courseDTO43, (java.lang.Long) 100L);
        java.lang.String str46 = course14.getCode();
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str46, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=-1, courseware=null, modality=REMOTE}");
        java.lang.String str2 = customErrorType1.getErrorMessage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=-1, courseware=null, modality=REMOTE}" + "'", str2, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=-1, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getInitialTime();
        java.lang.String str4 = course0.getCode();
        java.lang.String str5 = course0.toString();
        java.lang.Long long6 = course0.getIdTeacher();
        java.lang.String str7 = course0.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str5, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Integer int4 = feedbackDTO0.getPlanning();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.types.ModalityEnum modalityEnum6 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.String str8 = feedback7.toString();
        java.lang.Integer int9 = feedback7.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("hi!");
        java.lang.String str2 = teacher1.getName();
        java.lang.Long long3 = teacher1.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher1);
        teacherDTO4.setName("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
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
        feedback0.setPlanning((java.lang.Integer) 0);
        com.engSoft.entities.Feedback feedback42 = new com.engSoft.entities.Feedback();
        java.lang.Long long43 = feedback42.getIdStudent();
        feedback42.setIdCourse((java.lang.Long) 100L);
        java.lang.Integer int46 = feedback42.getMethodology();
        com.engSoft.entities.Feedback feedback47 = new com.engSoft.entities.Feedback();
        java.lang.Integer int48 = feedback47.getEvaluationSystem();
        feedback47.setIdCourse((java.lang.Long) 1L);
        feedback47.setIdCourse((java.lang.Long) 10L);
        com.engSoft.entities.Feedback feedback53 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum54 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback53.setModality(modalityEnum54);
        feedback53.setIdStudent((java.lang.Long) 1L);
        java.lang.String str58 = feedback53.toString();
        feedback53.setIdCourse((java.lang.Long) 0L);
        com.engSoft.entities.types.ModalityEnum modalityEnum61 = com.engSoft.entities.types.ModalityEnum.PRESENTIAL;
        feedback53.setModality(modalityEnum61);
        feedback47.setModality(modalityEnum61);
        feedback42.setModality(modalityEnum61);
        feedback0.setModality(modalityEnum61);
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
        org.junit.Assert.assertNull(long43);
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNull(int48);
        org.junit.Assert.assertTrue("'" + modalityEnum54 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum54.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str58, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + modalityEnum61 + "' != '" + com.engSoft.entities.types.ModalityEnum.PRESENTIAL + "'", modalityEnum61.equals(com.engSoft.entities.types.ModalityEnum.PRESENTIAL));
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.String str2 = student0.toString();
        student0.setId((java.lang.Long) 1L);
        java.lang.String str5 = student0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str2, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=1, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=1, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Boolean boolean3 = student0.getBanned();
        java.lang.Boolean boolean4 = student0.getBanned();
        java.lang.String str5 = student0.toString();
        java.lang.String str6 = student0.getEmail();
        java.lang.Long long7 = student0.getId();
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str5, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        java.lang.String str5 = student0.toString();
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        int int8 = student0.getDeletedComments();
        student0.setDeletedComments((-1));
        student0.setBanned((java.lang.Boolean) true);
        student0.setBanned((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
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
        com.engSoft.entities.Course course30 = new com.engSoft.entities.Course(courseDTO19, (java.lang.Long) 100L);
        java.lang.String str31 = courseDTO19.getNameTeacher();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str31, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
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
        java.lang.Long long10 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(modalityEnum9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("hi!", "");
        java.lang.String str3 = studentDTO2.getName();
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        studentDTO2.setEmail("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student8 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        java.lang.Boolean boolean6 = student0.getBanned();
        java.lang.String str7 = student0.getNick();
        java.lang.String str8 = student0.getName();
        int int9 = student0.getDeletedComments();
        student0.setNick("Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
        student0.setId((java.lang.Long) 100L);
        student0.setEmail("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Long long2 = feedback0.getId();
        feedback0.setCourseware((java.lang.Integer) 1);
        feedback0.setMethodology((java.lang.Integer) 1);
        feedback0.setEvaluationSystem((java.lang.Integer) 97);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
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
        java.lang.String str23 = courseDTO15.getNameTeacher();
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
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str3 = student0.getEmail();
        java.lang.Boolean boolean4 = student0.getBanned();
        student0.setBanned((java.lang.Boolean) false);
        student0.setNick("Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedback0.getModality();
        feedback0.setWorkload((java.lang.Integer) (-1));
        com.engSoft.entities.types.ModalityEnum modalityEnum6 = feedback0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(modalityEnum6);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
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
        java.lang.String str39 = course0.getName();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str39, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=PRESENTIAL}", "");
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        teacherDTO1.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}");
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        teacherDTO1.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=35, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        int int1 = student0.getDeletedComments();
        student0.setDeletedComments(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        java.lang.String str7 = student0.getNick();
        student0.setDeletedComments((int) 'a');
        student0.setId((java.lang.Long) 10L);
        com.engSoft.DTO.StudentDTO studentDTO12 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str13 = student0.toString();
        java.lang.String str14 = student0.getName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}" + "'", str13, "Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='null', email='null', nick='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}', isBanned=true, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}'}");
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str3 = student0.getEmail();
        student0.setBanned((java.lang.Boolean) false);
        student0.setNick("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}");
        student0.setDeletedComments((int) (byte) 0);
        java.lang.String str10 = student0.getNick();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}" + "'", str10, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}");
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        int int5 = student0.getDeletedComments();
        java.lang.String str6 = student0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getName();
        java.lang.String str8 = courseDTO5.getFinalTime();
        com.engSoft.entities.Course course10 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str11 = course10.getName();
        java.lang.Long long12 = course10.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Integer int4 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(modalityEnum5);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getPlanning();
        java.lang.Integer int3 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.toString();
        java.lang.String str2 = teacher0.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacherDTO3.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        com.engSoft.entities.Teacher teacher6 = new com.engSoft.entities.Teacher(teacherDTO3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Teacher{id=null, name= null }" + "'", str1, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        java.lang.String str11 = courseDTO7.getName();
        com.engSoft.entities.Course course13 = new com.engSoft.entities.Course(courseDTO7, (java.lang.Long) 100L);
        java.lang.String str14 = courseDTO7.getCode();
        java.lang.String str15 = courseDTO7.getNameTeacher();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.String str6 = courseDTO5.getInitialTime();
        java.lang.String str7 = courseDTO5.getFinalTime();
        java.lang.String str8 = courseDTO5.getNameTeacher();
        java.lang.String str9 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long5 = feedback4.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Teacher{id=null, name= null }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str3 = studentDTO2.getEmail();
        java.lang.String str4 = studentDTO2.getEmail();
        java.lang.String str5 = studentDTO2.getName();
        java.lang.String str6 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str3, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str4, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str6, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.toString();
        java.lang.String str2 = teacher0.getName();
        teacher0.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Teacher{id=null, name= null }" + "'", str1, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=1, courseware=null, modality=REMOTE}", "Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}', code='Student{id=null, name='null', email='null', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}', idTeacher='0', initialTime='Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}', finalTime='Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}'}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=PRESENTIAL}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.String str6 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}', code='Student{id=null, name='null', email='null', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}', idTeacher='0', initialTime='Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}', finalTime='Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}'}" + "'", str6, "Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}', code='Student{id=null, name='null', email='null', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}', idTeacher='0', initialTime='Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}', finalTime='Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}'}");
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=1, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments((int) (byte) -1);
        student0.setBanned((java.lang.Boolean) false);
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.Long long11 = student0.getId();
        student0.setBanned((java.lang.Boolean) false);
        student0.setDeletedComments((int) '#');
        java.lang.String str16 = student0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student{id=null, name='null', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=false, deletedComments=35}" + "'", str16, "Student{id=null, name='null', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=false, deletedComments=35}");
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.Feedback feedback2 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int3 = feedback2.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        feedback0.setCourseware((java.lang.Integer) 100);
        java.lang.Integer int3 = feedback0.getEvaluationSystem();
        java.lang.Long long4 = feedback0.getIdCourse();
        feedback0.setPlanning((java.lang.Integer) 10);
        feedback0.setEvaluationSystem((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str9 = student0.getEmail();
        java.lang.String str10 = student0.toString();
        student0.setEmail("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        int int13 = student0.getDeletedComments();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}" + "'", str10, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        java.lang.String str7 = student0.getNick();
        java.lang.Long long8 = student0.getId();
        java.lang.String str9 = student0.getName();
        int int10 = student0.getDeletedComments();
        java.lang.Long long11 = student0.getId();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
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
        java.lang.Integer int10 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        studentDTO2.setEmail("Teacher{id=null, name=  }");
        java.lang.String str5 = studentDTO2.getName();
        java.lang.String str6 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str5, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name=  }" + "'", str6, "Teacher{id=null, name=  }");
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
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
        java.lang.Integer int12 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback13 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum14 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(modalityEnum11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(modalityEnum14);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getFinalTime();
        java.lang.String str5 = course0.getFinalTime();
        java.lang.Long long6 = course0.getId();
        java.lang.Long long7 = course0.getIdTeacher();
        java.lang.String str8 = course0.getCode();
        java.lang.String str9 = course0.getInitialTime();
        com.engSoft.entities.Course course10 = new com.engSoft.entities.Course();
        java.lang.String str11 = course10.getFinalTime();
        java.lang.String str12 = course10.toString();
        java.lang.String str13 = course10.getInitialTime();
        java.lang.Long long14 = course10.getIdTeacher();
        com.engSoft.DTO.CourseDTO courseDTO20 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str21 = courseDTO20.getName();
        java.lang.String str22 = courseDTO20.getInitialTime();
        java.lang.String str23 = courseDTO20.getCode();
        java.lang.String str24 = courseDTO20.getName();
        course10.update(courseDTO20, (java.lang.Long) 0L);
        java.lang.String str27 = courseDTO20.getCode();
        java.lang.String str28 = courseDTO20.getFinalTime();
        java.lang.String str29 = courseDTO20.getName();
        course0.update(courseDTO20, (java.lang.Long) 100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str12, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str24, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str28, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str29, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setDeletedComments(10);
        java.lang.String str6 = student0.toString();
        com.engSoft.DTO.StudentDTO studentDTO7 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str10 = student0.getName();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str6, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long4 = teacher0.getId();
        java.lang.String str5 = teacher0.toString();
        java.lang.Long long6 = teacher0.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher0);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getName();
        java.lang.String str8 = courseDTO5.getName();
        java.lang.String str9 = courseDTO5.getCode();
        java.lang.String str10 = courseDTO5.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
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
        java.lang.Boolean boolean14 = student0.getBanned();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + false + "'", boolean14, false);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getWorkload();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Integer int2 = feedback0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedback0.getModality();
        java.lang.String str4 = feedback0.toString();
        feedback0.setMethodology((java.lang.Integer) 1);
        java.lang.Long long7 = feedback0.getId();
        feedback0.setIdStudent((java.lang.Long) 0L);
        java.lang.Long long10 = feedback0.getId();
        java.lang.Integer int11 = feedback0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.Long long2 = teacher1.getId();
        java.lang.String str3 = teacher1.toString();
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }" + "'", str3, "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Student{id=100, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.toString();
        java.lang.String str2 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO3 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments((int) (short) 1);
        student0.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}");
        java.lang.Boolean boolean8 = student0.getBanned();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str1, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.Long long2 = course0.getId();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str9 = courseDTO8.getCode();
        course0.update(courseDTO8, (java.lang.Long) 0L);
        java.lang.String str12 = course0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getPlanning();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getName();
        com.engSoft.entities.Course course12 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str13 = course12.toString();
        java.lang.String str14 = course12.getCode();
        java.lang.String str15 = course12.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str13, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        java.lang.Integer int9 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
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
        java.lang.String str53 = courseDTO49.getCode();
        java.lang.String str54 = courseDTO49.getNameTeacher();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}" + "'", str52, "Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str53, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str54, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Teacher{id=null, name= hi! }");
        java.lang.Long long7 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setId((java.lang.Long) 0L);
        student0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        teacherDTO1.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher7 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.DTO.TeacherDTO teacherDTO8 = new com.engSoft.DTO.TeacherDTO(teacher7);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getFinalTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getNameTeacher();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str9, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}", "Student{id=null, name='Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}");
        java.lang.String str3 = studentDTO2.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student4 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}" + "'", str3, "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        feedback0.setIdStudent((java.lang.Long) 1L);
        java.lang.String str5 = feedback0.toString();
        feedback0.setIdCourse((java.lang.Long) 0L);
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = com.engSoft.entities.types.ModalityEnum.PRESENTIAL;
        feedback0.setModality(modalityEnum8);
        java.lang.String str10 = feedback0.toString();
        java.lang.Integer int11 = feedback0.getEvaluationSystem();
        feedback0.setEvaluationSystem((java.lang.Integer) 100);
        java.lang.String str14 = feedback0.toString();
        feedback0.setIdStudent((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + modalityEnum8 + "' != '" + com.engSoft.entities.types.ModalityEnum.PRESENTIAL + "'", modalityEnum8.equals(com.engSoft.entities.types.ModalityEnum.PRESENTIAL));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}" + "'", str10, "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=PRESENTIAL}" + "'", str14, "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=PRESENTIAL}");
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Boolean boolean5 = student0.getBanned();
        int int6 = student0.getDeletedComments();
        java.lang.Long long7 = student0.getId();
        student0.setBanned((java.lang.Boolean) true);
        student0.setDeletedComments((int) '#');
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=1, methodology=100, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }");
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
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
        com.engSoft.entities.Feedback feedback10 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int11 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=REMOTE}");
        studentDTO2.setEmail("Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0} }");
        studentDTO2.setName("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = courseDTO5.getName();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        java.lang.String str12 = courseDTO5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        java.lang.String str9 = course8.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        student0.setEmail("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        student0.setName("Teacher{id=null, name= Teacher{id=null, name=  } }");
        student0.setEmail("Student{id=null, name='hi!', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=true, deletedComments=0}");
        student0.setDeletedComments((int) (short) 0);
        student0.setDeletedComments(35);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str7 = student0.toString();
        java.lang.Long long8 = student0.getId();
        student0.setDeletedComments((int) ' ');
        java.lang.String str11 = student0.getEmail();
        java.lang.String str12 = student0.getName();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str7, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
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
        java.lang.String str32 = courseDTO27.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str30, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str31, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str32, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Integer int4 = feedbackDTO0.getWorkload();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=null, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getMethodology();
        java.lang.Integer int2 = feedbackDTO0.getCourseware();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
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
        java.lang.String str30 = course28.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str20, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(long29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
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
        java.lang.String str43 = courseDTO37.getNameTeacher();
        java.lang.String str44 = courseDTO37.getInitialTime();
        java.lang.String str45 = courseDTO37.getName();
        com.engSoft.entities.Course course47 = new com.engSoft.entities.Course(courseDTO37, (java.lang.Long) 0L);
        java.lang.String str48 = course47.getName();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str43, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str45, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str48, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 100);
        java.lang.Integer int8 = feedback0.getMethodology();
        java.lang.Long long9 = feedback0.getIdStudent();
        feedback0.setMethodology((java.lang.Integer) 10);
        feedback0.setCourseware((java.lang.Integer) 1);
        feedback0.setEvaluationSystem((java.lang.Integer) 35);
        feedback0.setPlanning((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getPlanning();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name=  }");
        java.lang.String str2 = teacher1.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher1);
        java.lang.String str4 = teacher1.toString();
        java.lang.String str5 = teacher1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name=  } }" + "'", str2, "Teacher{id=null, name= Teacher{id=null, name=  } }");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name=  } }" + "'", str4, "Teacher{id=null, name= Teacher{id=null, name=  } }");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name=  } }" + "'", str5, "Teacher{id=null, name= Teacher{id=null, name=  } }");
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Long long1 = feedback0.getIdStudent();
        feedback0.setIdCourse((java.lang.Long) 10L);
        java.lang.String str4 = feedback0.toString();
        feedback0.setEvaluationSystem((java.lang.Integer) (-1));
        feedback0.setIdCourse((java.lang.Long) 0L);
        java.lang.Long long9 = feedback0.getIdStudent();
        feedback0.setEvaluationSystem((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        teacher4.setName("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null}");
        java.lang.String str7 = teacher4.toString();
        teacher4.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null} }" + "'", str7, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null} }");
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        java.lang.Integer int9 = feedbackDTO0.getPlanning();
        java.lang.Long long10 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.Long long6 = teacher5.getId();
        teacher5.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=0, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str2 = teacherDTO1.getName();
        java.lang.String str3 = teacherDTO1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=0, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=0, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=0, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=0, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        java.lang.String str3 = studentDTO2.getName();
        studentDTO2.setEmail("Student{id=null, name='null', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', isBanned=true, deletedComments=97}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str3, "Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Long long2 = feedback0.getId();
        feedback0.setCourseware((java.lang.Integer) 1);
        feedback0.setIdCourse((java.lang.Long) 10L);
        java.lang.Integer int7 = feedback0.getMethodology();
        com.engSoft.entities.Feedback feedback8 = new com.engSoft.entities.Feedback();
        java.lang.Integer int9 = feedback8.getEvaluationSystem();
        feedback8.setIdCourse((java.lang.Long) 1L);
        feedback8.setEvaluationSystem((java.lang.Integer) 10);
        java.lang.Long long14 = feedback8.getIdStudent();
        com.engSoft.entities.Feedback feedback15 = new com.engSoft.entities.Feedback();
        java.lang.Integer int16 = feedback15.getEvaluationSystem();
        feedback15.setIdCourse((java.lang.Long) 1L);
        feedback15.setIdCourse((java.lang.Long) 10L);
        com.engSoft.entities.Feedback feedback21 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum22 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback21.setModality(modalityEnum22);
        feedback21.setIdStudent((java.lang.Long) 1L);
        java.lang.String str26 = feedback21.toString();
        feedback21.setIdCourse((java.lang.Long) 0L);
        com.engSoft.entities.types.ModalityEnum modalityEnum29 = com.engSoft.entities.types.ModalityEnum.PRESENTIAL;
        feedback21.setModality(modalityEnum29);
        feedback15.setModality(modalityEnum29);
        feedback8.setModality(modalityEnum29);
        feedback0.setModality(modalityEnum29);
        feedback0.setPlanning((java.lang.Integer) 35);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertTrue("'" + modalityEnum22 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum22.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str26, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + modalityEnum29 + "' != '" + com.engSoft.entities.types.ModalityEnum.PRESENTIAL + "'", modalityEnum29.equals(com.engSoft.entities.types.ModalityEnum.PRESENTIAL));
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
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
        java.lang.String str15 = studentDTO12.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str8, "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student{id=null, name='Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str15, "Student{id=null, name='Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getWorkload();
        java.lang.Integer int3 = feedbackDTO0.getPlanning();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        java.lang.String str3 = studentDTO2.getName();
        studentDTO2.setName("hi!");
        java.lang.String str6 = studentDTO2.getName();
        java.lang.String str7 = studentDTO2.getName();
        studentDTO2.setName("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str10 = studentDTO2.getEmail();
        studentDTO2.setName("Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=-1, courseware=1, modality=null}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        java.lang.Boolean boolean2 = student0.getBanned();
        java.lang.String str3 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str5 = student0.getNick();
        java.lang.Boolean boolean6 = student0.getBanned();
        java.lang.String str7 = student0.getEmail();
        java.lang.String str8 = student0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str8, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=0, evaluationSystem=1, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher2);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("");
        teacher0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = teacher0.toString();
        java.lang.String str7 = teacher0.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO8 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO9 = new com.engSoft.DTO.TeacherDTO(teacher0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }" + "'", str6, "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }" + "'", str7, "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }");
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Teacher{id=null, name= Student{id=null, name='null', email='null', nick='', isBanned=null, deletedComments=0} }", "Student{id=0, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        com.engSoft.DTO.StudentDTO studentDTO1 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str2 = student0.getNick();
        student0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        int int2 = student0.getDeletedComments();
        java.lang.Boolean boolean3 = student0.getBanned();
        student0.setNick("");
        java.lang.String str6 = student0.getName();
        student0.setId((java.lang.Long) 10L);
        int int9 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Teacher{id=null, name= Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0} }", "Student{id=100, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=10}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=97}");
        com.engSoft.entities.Course course7 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 1L);
        java.lang.String str8 = course7.getInitialTime();
        java.lang.String str9 = course7.getName();
        com.engSoft.DTO.CourseDTO courseDTO15 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str16 = courseDTO15.getCode();
        com.engSoft.entities.Course course18 = new com.engSoft.entities.Course(courseDTO15, (java.lang.Long) 100L);
        course7.update(courseDTO15, (java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0} }" + "'", str9, "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0} }");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        java.lang.Integer int3 = feedback0.getCourseware();
        feedback0.setIdStudent((java.lang.Long) 1L);
        feedback0.setEvaluationSystem((java.lang.Integer) 1);
        feedback0.setEvaluationSystem((java.lang.Integer) 10);
        feedback0.setPlanning((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
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
        java.lang.Integer int10 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Integer int8 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        java.lang.Integer int8 = feedbackDTO0.getPlanning();
        java.lang.Integer int9 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int10 = feedbackDTO0.getMethodology();
        java.lang.Long long11 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=0, name='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=0, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=0, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=0, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.toString();
        java.lang.Long long5 = course0.getIdTeacher();
        java.lang.Long long6 = course0.getId();
        com.engSoft.DTO.CourseDTO courseDTO12 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Teacher{id=null, name=  }", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str13 = courseDTO12.getCode();
        java.lang.String str14 = courseDTO12.getNameTeacher();
        java.lang.String str15 = courseDTO12.getFinalTime();
        java.lang.String str16 = courseDTO12.getFinalTime();
        course0.update(courseDTO12, (java.lang.Long) (-1L));
        java.lang.String str19 = course0.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str4, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str14, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str16, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Teacher{id=null, name=  }" + "'", str19, "Teacher{id=null, name=  }");
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        int int6 = student0.getDeletedComments();
        java.lang.Boolean boolean7 = student0.getBanned();
        java.lang.String str8 = student0.getEmail();
        int int9 = student0.getDeletedComments();
        com.engSoft.DTO.StudentDTO studentDTO10 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='null', email='null', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student3 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=-1, planning=10, evaluationSystem=null, courseware=100, modality=null}");
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Teacher{id=null, name= hi! }");
        java.lang.Long long7 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setId((java.lang.Long) 0L);
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.String str8 = feedback7.toString();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
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
        feedback6.setCourseware((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 100);
        java.lang.Integer int8 = feedback0.getMethodology();
        feedback0.setMethodology((java.lang.Integer) 100);
        feedback0.setMethodology((java.lang.Integer) 10);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(0);
        java.lang.String str9 = student0.toString();
        student0.setId((java.lang.Long) (-1L));
        int int12 = student0.getDeletedComments();
        student0.setEmail("Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        student0.setDeletedComments(0);
        java.lang.String str17 = student0.toString();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student{id=-1, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=null, deletedComments=0}" + "'", str17, "Student{id=-1, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        student0.setEmail("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        student0.setName("Teacher{id=null, name= Teacher{id=null, name=  } }");
        student0.setEmail("Student{id=null, name='hi!', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=true, deletedComments=0}");
        student0.setDeletedComments(1);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
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
        java.lang.String str27 = courseDTO16.getName();
        java.lang.String str28 = courseDTO16.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str7, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str10, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str17, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str27, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str28, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
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
        studentDTO2.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        java.lang.String str4 = student0.getNick();
        int int5 = student0.getDeletedComments();
        student0.setDeletedComments((int) '#');
        int int8 = student0.getDeletedComments();
        int int9 = student0.getDeletedComments();
        student0.setEmail("Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
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
        com.engSoft.entities.types.ModalityEnum modalityEnum11 = feedbackDTO0.getModality();
        java.lang.Integer int12 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(modalityEnum11);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Teacher{id=null, name= null }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        studentDTO2.setName("");
        java.lang.String str5 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str5, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Long long2 = feedback0.getId();
        feedback0.setMethodology((java.lang.Integer) 10);
        java.lang.Integer int5 = feedback0.getEvaluationSystem();
        java.lang.Integer int6 = feedback0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Long long5 = feedbackDTO0.getIdStudent();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        java.lang.Long long9 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str2 = customErrorType1.getErrorMessage();
        java.lang.String str3 = customErrorType1.getErrorMessage();
        java.lang.String str4 = customErrorType1.getErrorMessage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str2, "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str3, "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str4, "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setBanned((java.lang.Boolean) true);
        student0.setId((java.lang.Long) 0L);
        java.lang.Boolean boolean7 = student0.getBanned();
        student0.setName("");
        int int10 = student0.getDeletedComments();
        com.engSoft.DTO.StudentDTO studentDTO11 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str12 = student0.getNick();
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}", "Teacher{id=null, name=  }");
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student3 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.Long long5 = teacher4.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO6 = new com.engSoft.DTO.TeacherDTO(teacher4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        java.lang.Boolean boolean2 = student0.getBanned();
        java.lang.String str3 = student0.toString();
        student0.setId((java.lang.Long) 0L);
        student0.setNick("Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }");
        java.lang.String str8 = student0.getEmail();
        java.lang.Boolean boolean9 = student0.getBanned();
        java.lang.Boolean boolean10 = student0.getBanned();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str3, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        teacherDTO1.setName("Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        teacherDTO1.setName("Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='Teacher{id=null, name= hi! }', idTeacher='1', initialTime='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', finalTime='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}'}");
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str5 = teacher4.toString();
        teacher4.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        com.engSoft.DTO.TeacherDTO teacherDTO8 = new com.engSoft.DTO.TeacherDTO(teacher4);
        com.engSoft.DTO.TeacherDTO teacherDTO9 = new com.engSoft.DTO.TeacherDTO(teacher4);
        java.lang.String str10 = teacher4.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }" + "'", str10, "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
    }
}

