package com.engSoft.AvaliadorDisciplinas.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback8 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback8.setIdStudent((java.lang.Long) 0L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}", "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student5 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long4 = teacher0.getId();
        java.lang.Long long5 = teacher0.getId();
        java.lang.String str6 = teacher0.toString();
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str5 = teacher4.toString();
        teacher4.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        com.engSoft.DTO.TeacherDTO teacherDTO8 = new com.engSoft.DTO.TeacherDTO(teacher4);
        teacherDTO8.setName("Student{id=1, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        com.engSoft.entities.Course course48 = new com.engSoft.entities.Course(courseDTO37, (java.lang.Long) (-1L));
        java.lang.String str49 = courseDTO37.getInitialTime();
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        java.lang.Long long10 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.types.ModalityEnum modalityEnum11 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertNull(modalityEnum11);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.toString();
        java.lang.String str5 = student0.getEmail();
        java.lang.Boolean boolean6 = student0.getBanned();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str4, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str17 = courseDTO16.getInitialTime();
        course0.update(courseDTO16, (java.lang.Long) (-1L));
        java.lang.Long long20 = course0.getId();
        java.lang.String str21 = course0.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(long20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        java.lang.Long long3 = feedback0.getId();
        java.lang.Integer int4 = feedback0.getCourseware();
        feedback0.setWorkload((java.lang.Integer) 100);
        java.lang.Integer int7 = feedback0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.Long long2 = teacher1.getId();
        java.lang.Long long3 = teacher1.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher1);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO4);
        teacher5.setName("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getCode();
        java.lang.Long long5 = course0.getIdTeacher();
        java.lang.String str6 = course0.getInitialTime();
        java.lang.String str7 = course0.getInitialTime();
        java.lang.String str8 = course0.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacher0.getName();
        java.lang.String str5 = teacher0.toString();
        java.lang.String str6 = teacher0.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.entities.Teacher teacher8 = new com.engSoft.entities.Teacher(teacherDTO7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback4.setPlanning((java.lang.Integer) 35);
        feedback4.setEvaluationSystem((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        java.lang.String str23 = course0.getInitialTime();
        java.lang.String str24 = course0.getName();
        com.engSoft.entities.Course course25 = new com.engSoft.entities.Course();
        java.lang.String str26 = course25.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO32 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str33 = courseDTO32.getCode();
        course25.update(courseDTO32, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO41 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str42 = courseDTO41.getInitialTime();
        course25.update(courseDTO41, (java.lang.Long) (-1L));
        course0.update(courseDTO41, (java.lang.Long) 100L);
        java.lang.String str47 = courseDTO41.getNameTeacher();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str22, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str24, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str47, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        student0.setName("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = student0.getName();
        java.lang.String str7 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setId((java.lang.Long) (-1L));
        int int11 = student0.getDeletedComments();
        student0.setNick("Student{id=null, name='Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str6, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}");
        teacherDTO1.setName("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setBanned((java.lang.Boolean) true);
        student0.setId((java.lang.Long) 0L);
        java.lang.Boolean boolean7 = student0.getBanned();
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str9 = student0.getNick();
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str2 = teacher1.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=100, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}");
        java.lang.String str2 = teacherDTO1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str2, "Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setMethodology((java.lang.Integer) 1);
        java.lang.Integer int8 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) (-1L));
        feedback0.setWorkload((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.Boolean boolean9 = student0.getBanned();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        com.engSoft.entities.Course course24 = new com.engSoft.entities.Course();
        java.lang.String str25 = course24.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO31 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str32 = courseDTO31.getCode();
        course24.update(courseDTO31, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO40 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str41 = courseDTO40.getInitialTime();
        course24.update(courseDTO40, (java.lang.Long) (-1L));
        java.lang.String str44 = courseDTO40.getInitialTime();
        com.engSoft.entities.Course course46 = new com.engSoft.entities.Course(courseDTO40, (java.lang.Long) 10L);
        com.engSoft.entities.Course course48 = new com.engSoft.entities.Course(courseDTO40, (java.lang.Long) 100L);
        java.lang.String str49 = courseDTO40.getInitialTime();
        course0.update(courseDTO40, (java.lang.Long) (-1L));
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
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        java.lang.String str19 = course14.getCode();
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
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=PRESENTIAL}", "", "Student{id=null, name='null', email='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=1, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        com.engSoft.entities.Feedback feedback11 = new com.engSoft.entities.Feedback(feedbackDTO0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Teacher{id=null, name= hi! }");
        java.lang.Long long7 = student0.getId();
        student0.setName("Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
        student0.setId((java.lang.Long) 0L);
        java.lang.String str12 = student0.getNick();
        com.engSoft.DTO.StudentDTO studentDTO13 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setEmail("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.String str7 = student0.getEmail();
        student0.setNick("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str12 = student0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str12, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Integer int8 = feedbackDTO0.getMethodology();
        java.lang.Long long9 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedback0.getModality();
        feedback0.setCourseware((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum4);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Integer int2 = feedback0.getWorkload();
        java.lang.Integer int3 = feedback0.getWorkload();
        java.lang.Integer int4 = feedback0.getWorkload();
        feedback0.setPlanning((java.lang.Integer) 10);
        java.lang.Long long7 = feedback0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        java.lang.String str2 = course0.toString();
        java.lang.String str3 = course0.getInitialTime();
        java.lang.String str4 = course0.getInitialTime();
        com.engSoft.DTO.CourseDTO courseDTO10 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str11 = courseDTO10.getCode();
        com.engSoft.entities.Course course13 = new com.engSoft.entities.Course(courseDTO10, (java.lang.Long) 10L);
        java.lang.Long long14 = course13.getId();
        java.lang.Long long15 = course13.getId();
        com.engSoft.DTO.CourseDTO courseDTO21 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        course13.update(courseDTO21, (java.lang.Long) 100L);
        java.lang.String str24 = courseDTO21.getFinalTime();
        java.lang.String str25 = courseDTO21.getInitialTime();
        course0.update(courseDTO21, (java.lang.Long) 0L);
        java.lang.String str28 = course0.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str24, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str25, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str28, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        java.lang.Integer int10 = feedbackDTO0.getPlanning();
        java.lang.Integer int11 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        java.lang.String str3 = teacherDTO1.getName();
        teacherDTO1.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=-1, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=10, planning=null, evaluationSystem=35, courseware=10, modality=null}", "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments((int) (byte) -1);
        student0.setBanned((java.lang.Boolean) false);
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        student0.setEmail("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Integer int4 = feedbackDTO0.getWorkload();
        java.lang.Integer int5 = feedbackDTO0.getPlanning();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        java.lang.Integer int10 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        student0.setName("");
        java.lang.Boolean boolean7 = student0.getBanned();
        java.lang.String str8 = student0.toString();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Long long11 = student0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str8, "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        java.lang.Boolean boolean2 = student0.getBanned();
        java.lang.String str3 = student0.getName();
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        java.lang.String str6 = student0.getEmail();
        java.lang.String str7 = student0.getEmail();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(modalityEnum8);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Teacher{id=null, name= hi! }");
        java.lang.Long long7 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setId((java.lang.Long) 0L);
        java.lang.String str11 = student0.toString();
        java.lang.Boolean boolean12 = student0.getBanned();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}" + "'", str11, "Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
        java.lang.String str2 = customErrorType1.getErrorMessage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("");
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher1);
        teacherDTO2.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
        teacherDTO2.setName("Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        com.engSoft.entities.Teacher teacher7 = new com.engSoft.entities.Teacher(teacherDTO2);
        teacherDTO2.setName("Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=-1, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}", "Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        com.engSoft.entities.Course course7 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(0);
        java.lang.String str9 = student0.toString();
        student0.setId((java.lang.Long) (-1L));
        int int12 = student0.getDeletedComments();
        int int13 = student0.getDeletedComments();
        java.lang.String str14 = student0.getEmail();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        feedback0.setIdStudent((java.lang.Long) 1L);
        java.lang.String str5 = feedback0.toString();
        feedback0.setIdCourse((java.lang.Long) 0L);
        feedback0.setIdCourse((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setBanned((java.lang.Boolean) true);
        student0.setId((java.lang.Long) 0L);
        java.lang.Boolean boolean7 = student0.getBanned();
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str3 = studentDTO2.getName();
        java.lang.String str4 = studentDTO2.getEmail();
        studentDTO2.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
        java.lang.String str7 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str4, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        com.engSoft.DTO.StudentDTO studentDTO3 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setId((java.lang.Long) 100L);
        student0.setNick("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.String str2 = student0.toString();
        student0.setBanned((java.lang.Boolean) true);
        com.engSoft.DTO.StudentDTO studentDTO5 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str2, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.toString();
        java.lang.String str2 = teacher0.toString();
        java.lang.String str3 = teacher0.toString();
        java.lang.String str4 = teacher0.getName();
        java.lang.Long long5 = teacher0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Teacher{id=null, name= null }" + "'", str1, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= null }" + "'", str2, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name= null }" + "'", str3, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        java.lang.String str20 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str20, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        java.lang.Integer int10 = feedbackDTO0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum11 = feedbackDTO0.getModality();
        java.lang.Integer int12 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(modalityEnum11);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        int int7 = student0.getDeletedComments();
        student0.setDeletedComments((int) 'a');
        java.lang.String str10 = student0.getNick();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.Long long9 = course8.getId();
        java.lang.Long long10 = course8.getId();
        com.engSoft.DTO.CourseDTO courseDTO16 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        course8.update(courseDTO16, (java.lang.Long) 100L);
        java.lang.String str19 = courseDTO16.getFinalTime();
        com.engSoft.entities.Course course21 = new com.engSoft.entities.Course(courseDTO16, (java.lang.Long) (-1L));
        com.engSoft.DTO.CourseDTO courseDTO27 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str28 = courseDTO27.getName();
        java.lang.String str29 = courseDTO27.getInitialTime();
        java.lang.String str30 = courseDTO27.getCode();
        java.lang.String str31 = courseDTO27.getName();
        java.lang.String str32 = courseDTO27.getNameTeacher();
        java.lang.String str33 = courseDTO27.getName();
        java.lang.String str34 = courseDTO27.getInitialTime();
        com.engSoft.entities.Course course36 = new com.engSoft.entities.Course(courseDTO27, (java.lang.Long) (-1L));
        course21.update(courseDTO27, (java.lang.Long) 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str19, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str28, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str31, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str32, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str33, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        teacherDTO1.setName("Teacher{id=null, name= null }");
        java.lang.String str4 = teacherDTO1.getName();
        java.lang.String str5 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher6 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.Long long7 = teacher6.getId();
        java.lang.Long long8 = teacher6.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= null }" + "'", str4, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=null, name='hi!', email='null', nick='Teacher{id=null, name=  }', isBanned=null, deletedComments=0}");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=PRESENTIAL}");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO4.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
        java.lang.String str7 = studentDTO4.getEmail();
        java.lang.String str8 = studentDTO4.getEmail();
        studentDTO4.setEmail("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getMethodology();
        java.lang.Integer int2 = feedbackDTO0.getCourseware();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getMethodology();
        java.lang.Long long5 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int7 = feedback6.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
        java.lang.String str2 = customErrorType1.getErrorMessage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        java.lang.String str6 = student0.getName();
        student0.setId((java.lang.Long) 0L);
        int int9 = student0.getDeletedComments();
        student0.setName("Teacher{id=null, name=  }");
        com.engSoft.DTO.StudentDTO studentDTO12 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str13 = studentDTO12.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Teacher{id=null, name=  }" + "'", str13, "Teacher{id=null, name=  }");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 100);
        java.lang.Integer int8 = feedback0.getMethodology();
        feedback0.setMethodology((java.lang.Integer) (-1));
        feedback0.setIdCourse((java.lang.Long) 10L);
        com.engSoft.entities.types.ModalityEnum modalityEnum13 = feedback0.getModality();
        feedback0.setEvaluationSystem((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(modalityEnum13);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        feedback0.setIdStudent((java.lang.Long) 1L);
        java.lang.String str5 = feedback0.toString();
        java.lang.Long long6 = feedback0.getId();
        feedback0.setMethodology((java.lang.Integer) 100);
        java.lang.Long long9 = feedback0.getId();
        java.lang.Integer int10 = feedback0.getWorkload();
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        feedback0.setIdStudent((java.lang.Long) 100L);
        java.lang.Long long4 = feedback0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.Boolean boolean2 = student0.getBanned();
        student0.setNick("Teacher{id=null, name= hi! }");
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        int int7 = student0.getDeletedComments();
        java.lang.Long long8 = student0.getId();
        java.lang.Long long9 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO10 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Long long1 = feedback0.getIdStudent();
        feedback0.setIdCourse((java.lang.Long) 10L);
        java.lang.String str4 = feedback0.toString();
        feedback0.setEvaluationSystem((java.lang.Integer) 1);
        feedback0.setMethodology((java.lang.Integer) 0);
        feedback0.setWorkload((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setEvaluationSystem((java.lang.Integer) 100);
        feedback0.setIdStudent((java.lang.Long) 1L);
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedback0.getModality();
        feedback0.setCourseware((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum8);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        student0.setName("");
        student0.setName("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=-1, courseware=35, modality=null}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        teacherDTO1.setName("Teacher{id=null, name= null }");
        java.lang.String str4 = teacherDTO1.getName();
        java.lang.String str5 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher6 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str7 = teacher6.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= null }" + "'", str4, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= null }" + "'", str7, "Teacher{id=null, name= null }");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
        teacherDTO1.setName("Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        java.lang.String str22 = courseDTO11.getInitialTime();
        java.lang.String str23 = courseDTO11.getCode();
        java.lang.String str24 = courseDTO11.getName();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str24, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.Boolean boolean2 = student0.getBanned();
        student0.setNick("Teacher{id=null, name= hi! }");
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        int int7 = student0.getDeletedComments();
        java.lang.String str8 = student0.getEmail();
        java.lang.String str9 = student0.toString();
        student0.setEmail("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str8, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='null', email='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=null, name='null', email='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setDeletedComments(10);
        java.lang.String str6 = student0.getName();
        student0.setId((java.lang.Long) (-1L));
        student0.setNick("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=null, deletedComments=32}");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getMethodology();
        java.lang.Integer int2 = feedbackDTO0.getCourseware();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        java.lang.Integer int9 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        feedback6.setPlanning((java.lang.Integer) 10);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int16);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        java.lang.Long long6 = feedback0.getId();
        feedback0.setPlanning((java.lang.Integer) 10);
        feedback0.setEvaluationSystem((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getCode();
        java.lang.String str5 = course0.getInitialTime();
        java.lang.Long long6 = course0.getId();
        java.lang.String str7 = course0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Integer int3 = feedbackDTO0.getPlanning();
        java.lang.Integer int4 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 10);
        java.lang.Integer int8 = feedback0.getEvaluationSystem();
        java.lang.Integer int9 = feedback0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        com.engSoft.entities.types.ModalityEnum modalityEnum10 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(modalityEnum10);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str7 = student0.toString();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Long long10 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO11 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str7, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        teacherDTO1.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}");
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        teacherDTO1.setName("Student{id=null, name='null', email='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', nick='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}");
        com.engSoft.DTO.StudentDTO studentDTO11 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        java.lang.String str29 = course28.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str22, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str23, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str24, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        java.lang.Long long10 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        java.lang.Long long23 = course0.getId();
        java.lang.String str24 = course0.getName();
        java.lang.Long long25 = course0.getId();
        com.engSoft.entities.Course course26 = new com.engSoft.entities.Course();
        java.lang.String str27 = course26.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO33 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str34 = courseDTO33.getCode();
        course26.update(courseDTO33, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO42 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str43 = courseDTO42.getInitialTime();
        course26.update(courseDTO42, (java.lang.Long) (-1L));
        java.lang.String str46 = courseDTO42.getInitialTime();
        java.lang.String str47 = courseDTO42.getFinalTime();
        java.lang.String str48 = courseDTO42.getName();
        java.lang.String str49 = courseDTO42.getName();
        java.lang.String str50 = courseDTO42.getNameTeacher();
        java.lang.String str51 = courseDTO42.getFinalTime();
        com.engSoft.entities.Course course53 = new com.engSoft.entities.Course(courseDTO42, (java.lang.Long) 10L);
        course0.update(courseDTO42, (java.lang.Long) 0L);
        java.lang.String str56 = courseDTO42.getNameTeacher();
        java.lang.String str57 = courseDTO42.getNameTeacher();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str22, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str24, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str47, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str48, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str49, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str50, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str51, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str56, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str57, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=-1}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }", "Student{id=null, name='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}", "Feedback{id=null, idCourse=null, idStudent=10, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}", "");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Integer int4 = feedbackDTO0.getWorkload();
        java.lang.Integer int5 = feedbackDTO0.getPlanning();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        java.lang.Long long8 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.String str2 = student0.getName();
        java.lang.String str3 = student0.getEmail();
        java.lang.Long long4 = student0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        teacherDTO1.setName("");
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        teacherDTO1.setName("Course{id=null, name='Student{id=null, name='null', email='null', nick='Teacher{id=null, name=  }', isBanned=true, deletedComments=0}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='-1', initialTime='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', finalTime='Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}'}");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Teacher{id=null, name= hi! }");
        java.lang.Long long7 = student0.getId();
        student0.setName("Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
        student0.setId((java.lang.Long) 0L);
        java.lang.String str12 = student0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.Long long9 = course8.getId();
        java.lang.String str10 = course8.getInitialTime();
        java.lang.Class<?> wildcardClass11 = course8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getName();
        com.engSoft.entities.Course course12 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str13 = courseDTO5.getInitialTime();
        com.engSoft.entities.Course course15 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str16 = courseDTO5.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.String str4 = student0.toString();
        java.lang.Long long5 = student0.getId();
        int int6 = student0.getDeletedComments();
        java.lang.String str7 = student0.getNick();
        java.lang.String str8 = student0.toString();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str4, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str8, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        feedback0.setCourseware((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedback0.getModality();
        java.lang.Integer int5 = feedback0.getWorkload();
        feedback0.setCourseware((java.lang.Integer) 35);
        feedback0.setWorkload((java.lang.Integer) 0);
        java.lang.Integer int10 = feedback0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getCourseware();
        java.lang.Integer int2 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setEvaluationSystem((java.lang.Integer) 10);
        java.lang.Integer int8 = feedback0.getMethodology();
        feedback0.setIdCourse((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass11 = feedback0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        java.lang.Integer int12 = feedback0.getEvaluationSystem();
        feedback0.setPlanning((java.lang.Integer) 10);
        java.lang.Long long15 = feedback0.getId();
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + modalityEnum8 + "' != '" + com.engSoft.entities.types.ModalityEnum.PRESENTIAL + "'", modalityEnum8.equals(com.engSoft.entities.types.ModalityEnum.PRESENTIAL));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}" + "'", str10, "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(long15);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=0, planning=1, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Integer int8 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getName();
        com.engSoft.entities.Course course12 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str13 = courseDTO5.getCode();
        java.lang.String str14 = courseDTO5.getFinalTime();
        java.lang.String str15 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Integer int4 = feedbackDTO0.getWorkload();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        java.lang.Integer int8 = feedbackDTO0.getCourseware();
        java.lang.Long long9 = feedbackDTO0.getIdCourse();
        java.lang.Integer int10 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Integer int2 = feedback0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedback0.getModality();
        java.lang.String str4 = feedback0.toString();
        feedback0.setMethodology((java.lang.Integer) 1);
        feedback0.setIdCourse((java.lang.Long) 0L);
        feedback0.setMethodology((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback6.setEvaluationSystem((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        java.lang.String str3 = studentDTO2.getName();
        studentDTO2.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str6 = studentDTO2.getName();
        java.lang.String str7 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str6, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        student0.setName("");
        java.lang.Boolean boolean7 = student0.getBanned();
        student0.setBanned((java.lang.Boolean) true);
        student0.setNick("Student{id=100, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=10}");
        student0.setEmail("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        student0.setDeletedComments((int) '#');
        java.lang.Boolean boolean16 = student0.getBanned();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + true + "'", boolean16, true);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Teacher{id=null, name=  }");
        java.lang.String str2 = customErrorType1.getErrorMessage();
        java.lang.String str3 = customErrorType1.getErrorMessage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name=  }" + "'", str2, "Teacher{id=null, name=  }");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name=  }" + "'", str3, "Teacher{id=null, name=  }");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        java.lang.String str25 = courseDTO19.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 100);
        java.lang.Integer int8 = feedback0.getMethodology();
        feedback0.setMethodology((java.lang.Integer) (-1));
        feedback0.setIdCourse((java.lang.Long) 10L);
        java.lang.String str13 = feedback0.toString();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=-1, planning=100, evaluationSystem=null, courseware=null, modality=null}" + "'", str13, "Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=-1, planning=100, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
        java.lang.String str18 = course0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str18, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Boolean boolean5 = student0.getBanned();
        int int6 = student0.getDeletedComments();
        java.lang.Long long7 = student0.getId();
        student0.setEmail("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.String str10 = student0.getNick();
        java.lang.String str11 = student0.getEmail();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str11, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        java.lang.Long long8 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback9 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int10 = feedback9.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Long long2 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(modalityEnum5);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        java.lang.String str3 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        com.engSoft.entities.Course course2 = new com.engSoft.entities.Course();
        java.lang.String str3 = course2.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO9 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str10 = courseDTO9.getCode();
        course2.update(courseDTO9, (java.lang.Long) 1L);
        java.lang.Long long13 = course2.getId();
        java.lang.String str14 = course2.getName();
        java.lang.String str15 = course2.getCode();
        com.engSoft.entities.Course course16 = new com.engSoft.entities.Course();
        java.lang.String str17 = course16.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO23 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str24 = courseDTO23.getName();
        java.lang.String str25 = courseDTO23.getInitialTime();
        java.lang.String str26 = courseDTO23.getCode();
        java.lang.String str27 = courseDTO23.getFinalTime();
        java.lang.String str28 = courseDTO23.getInitialTime();
        course16.update(courseDTO23, (java.lang.Long) 10L);
        java.lang.String str31 = courseDTO23.getFinalTime();
        course2.update(courseDTO23, (java.lang.Long) 10L);
        course0.update(courseDTO23, (java.lang.Long) (-1L));
        com.engSoft.entities.Course course36 = new com.engSoft.entities.Course();
        java.lang.String str37 = course36.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO43 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str44 = courseDTO43.getCode();
        course36.update(courseDTO43, (java.lang.Long) 1L);
        java.lang.Long long47 = course36.getId();
        java.lang.String str48 = course36.getName();
        com.engSoft.DTO.CourseDTO courseDTO54 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str55 = courseDTO54.getName();
        java.lang.String str56 = courseDTO54.getInitialTime();
        java.lang.String str57 = courseDTO54.getCode();
        course36.update(courseDTO54, (java.lang.Long) 0L);
        course0.update(courseDTO54, (java.lang.Long) (-1L));
        com.engSoft.entities.Course course63 = new com.engSoft.entities.Course(courseDTO54, (java.lang.Long) 0L);
        java.lang.String str64 = course63.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str24, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str27, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str31, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(long47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str48, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str55, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str64, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        java.lang.Boolean boolean2 = student0.getBanned();
        java.lang.String str3 = student0.toString();
        student0.setId((java.lang.Long) 0L);
        student0.setNick("Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }");
        java.lang.String str8 = student0.getEmail();
        java.lang.String str9 = student0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str3, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str5 = studentDTO2.getName();
        studentDTO2.setName("hi!");
        studentDTO2.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str10 = studentDTO2.getEmail();
        studentDTO2.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str10, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        java.lang.String str16 = courseDTO8.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str16, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=0, modality=null}");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=10, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getCode();
        java.lang.Long long5 = course0.getIdTeacher();
        java.lang.Long long6 = course0.getIdTeacher();
        java.lang.String str7 = course0.toString();
        java.lang.String str8 = course0.toString();
        java.lang.String str9 = course0.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str8, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Integer int7 = feedbackDTO0.getPlanning();
        java.lang.Long long8 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.types.ModalityEnum modalityEnum9 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(modalityEnum9);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }", "Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}", "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=null}" + "'", str6, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.toString();
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getNick();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str4, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        feedback0.setEvaluationSystem((java.lang.Integer) 10);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertTrue("'" + modalityEnum27 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum27.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str34, "Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}", "Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}", "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = courseDTO5.getFinalTime();
        java.lang.String str7 = courseDTO5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str6, "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        java.lang.Long long8 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback9 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long10 = feedback9.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}", "Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}", "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = courseDTO5.getFinalTime();
        java.lang.String str7 = courseDTO5.getFinalTime();
        java.lang.String str8 = courseDTO5.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str6, "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str7, "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}" + "'", str8, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        java.lang.String str43 = course0.toString();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str43, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Student{id=0, name='null', email='null', nick='null', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}", "Teacher{id=null, name= Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0} }");
        java.lang.String str6 = courseDTO5.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=0, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str6, "Student{id=0, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setIdCourse((java.lang.Long) 0L);
        feedback0.setEvaluationSystem((java.lang.Integer) 100);
        java.lang.Integer int10 = feedback0.getMethodology();
        feedback0.setCourseware((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.Long long2 = teacher1.getId();
        java.lang.Long long3 = teacher1.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher1);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO4);
        com.engSoft.DTO.TeacherDTO teacherDTO6 = new com.engSoft.DTO.TeacherDTO(teacher5);
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher5);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Long long2 = feedback0.getId();
        feedback0.setWorkload((java.lang.Integer) 35);
        java.lang.Long long5 = feedback0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}", "Teacher{id=null, name= Teacher{id=null, name= null } }", "Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Teacher{id=null, name= hi! }', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=0, modality=null}");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        java.lang.Long long4 = student0.getId();
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str7 = student0.getNick();
        student0.setId((java.lang.Long) 1L);
        student0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 100);
        java.lang.Integer int8 = feedback0.getMethodology();
        java.lang.Integer int9 = feedback0.getCourseware();
        java.lang.Long long10 = feedback0.getId();
        feedback0.setCourseware((java.lang.Integer) 35);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedback3.getCourseware();
        feedback3.setMethodology((java.lang.Integer) 100);
        feedback3.setCourseware((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        int int6 = student0.getDeletedComments();
        student0.setId((java.lang.Long) (-1L));
        student0.setDeletedComments(0);
        student0.setNick("Student{id=null, name='Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("hi!");
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str4 = teacherDTO1.getName();
        teacherDTO1.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}");
        java.lang.String str2 = teacher1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}" + "'", str2, "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=PRESENTIAL}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=null, deletedComments=0}", "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }", "");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Long long2 = feedbackDTO0.getIdStudent();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
        com.engSoft.entities.Course course40 = new com.engSoft.entities.Course(courseDTO29, (java.lang.Long) 1L);
        java.lang.String str41 = courseDTO29.getName();
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str41, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Long long5 = feedbackDTO0.getIdStudent();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.types.ModalityEnum modalityEnum9 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(modalityEnum9);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        java.lang.String str4 = student0.getNick();
        java.lang.String str5 = student0.getNick();
        student0.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(0);
        student0.setDeletedComments(1);
        student0.setBanned((java.lang.Boolean) true);
        int int13 = student0.getDeletedComments();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
        teacher1.setName("Teacher{id=null, name= Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0} }");
        java.lang.String str4 = teacher1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name= Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0} } }" + "'", str4, "Teacher{id=null, name= Teacher{id=null, name= Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0} } }");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedback3.getCourseware();
        feedback3.setEvaluationSystem((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
        java.lang.String str24 = course0.getInitialTime();
        java.lang.String str25 = course0.getName();
        java.lang.String str26 = course0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str25, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str26, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=100, modality=null}");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Integer int3 = feedbackDTO0.getPlanning();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getPlanning();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        com.engSoft.DTO.CourseDTO courseDTO29 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str30 = courseDTO29.getName();
        java.lang.String str31 = courseDTO29.getInitialTime();
        java.lang.String str32 = courseDTO29.getCode();
        java.lang.String str33 = courseDTO29.getFinalTime();
        java.lang.String str34 = courseDTO29.getName();
        com.engSoft.entities.Course course36 = new com.engSoft.entities.Course(courseDTO29, (java.lang.Long) 10L);
        java.lang.String str37 = courseDTO29.getInitialTime();
        course0.update(courseDTO29, (java.lang.Long) 1L);
        java.lang.String str40 = courseDTO29.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str30, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str33, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str34, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("");
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher1);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO2);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        feedback0.setIdStudent((java.lang.Long) 1L);
        java.lang.String str5 = feedback0.toString();
        feedback0.setIdCourse((java.lang.Long) 0L);
        feedback0.setCourseware((java.lang.Integer) 0);
        java.lang.Integer int10 = feedback0.getWorkload();
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setId((java.lang.Long) 100L);
        java.lang.Boolean boolean7 = student0.getBanned();
        int int8 = student0.getDeletedComments();
        java.lang.String str9 = student0.getNick();
        student0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setDeletedComments(10);
        java.lang.String str6 = student0.getName();
        student0.setId((java.lang.Long) (-1L));
        student0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=-1}");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Long long2 = feedback0.getId();
        feedback0.setCourseware((java.lang.Integer) 1);
        feedback0.setMethodology((java.lang.Integer) 1);
        feedback0.setIdStudent((java.lang.Long) 10L);
        feedback0.setIdStudent((java.lang.Long) 0L);
        com.engSoft.entities.Feedback feedback11 = new com.engSoft.entities.Feedback();
        java.lang.Integer int12 = feedback11.getEvaluationSystem();
        feedback11.setIdCourse((java.lang.Long) 1L);
        feedback11.setPlanning((java.lang.Integer) 1);
        feedback11.setPlanning((java.lang.Integer) 100);
        java.lang.Integer int19 = feedback11.getMethodology();
        feedback11.setMethodology((java.lang.Integer) (-1));
        com.engSoft.entities.Feedback feedback22 = new com.engSoft.entities.Feedback();
        java.lang.Integer int23 = feedback22.getEvaluationSystem();
        feedback22.setIdCourse((java.lang.Long) 1L);
        feedback22.setEvaluationSystem((java.lang.Integer) 100);
        java.lang.Integer int28 = feedback22.getPlanning();
        feedback22.setIdStudent((java.lang.Long) 100L);
        feedback22.setMethodology((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum33 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback22.setModality(modalityEnum33);
        feedback11.setModality(modalityEnum33);
        feedback0.setModality(modalityEnum33);
        feedback0.setEvaluationSystem((java.lang.Integer) 10);
        feedback0.setIdCourse((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertTrue("'" + modalityEnum33 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum33.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}", "Teacher{id=null, name= Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0} }", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=null}", "Teacher{id=null, name= null }", "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getName();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        java.lang.String str12 = courseDTO5.getCode();
        java.lang.String str13 = courseDTO5.getFinalTime();
        java.lang.String str14 = courseDTO5.getNameTeacher();
        java.lang.String str15 = courseDTO5.getFinalTime();
        java.lang.String str16 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str16, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setMethodology((java.lang.Integer) 1);
        java.lang.Integer int8 = feedback0.getWorkload();
        java.lang.Long long9 = feedback0.getId();
        java.lang.Integer int10 = feedback0.getEvaluationSystem();
        feedback0.setCourseware((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass13 = feedback0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        java.lang.String str22 = course0.getCode();
        java.lang.String str23 = course0.getFinalTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str20, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str23, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        java.lang.String str11 = courseDTO7.getInitialTime();
        java.lang.String str12 = courseDTO7.getCode();
        java.lang.String str13 = courseDTO7.getNameTeacher();
        java.lang.String str14 = courseDTO7.getNameTeacher();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Integer int2 = feedback0.getWorkload();
        java.lang.String str3 = feedback0.toString();
        java.lang.Integer int4 = feedback0.getCourseware();
        java.lang.Long long5 = feedback0.getId();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = courseDTO5.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str6, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getNick();
        int int7 = student0.getDeletedComments();
        student0.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=-1}");
        student0.setDeletedComments(1);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        java.lang.Integer int10 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        java.lang.Long long9 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=PRESENTIAL}", "Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=10, courseware=null, modality=null}");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedback4.getModality();
        feedback4.setIdCourse((java.lang.Long) 1L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(modalityEnum5);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}", "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student3 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Teacher{id=null, name= null }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str3 = studentDTO2.getEmail();
        java.lang.String str4 = studentDTO2.getEmail();
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student5 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str3, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str4, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str6 = teacher5.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.Boolean boolean2 = student0.getBanned();
        student0.setNick("Teacher{id=null, name= hi! }");
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        int int7 = student0.getDeletedComments();
        java.lang.Long long8 = student0.getId();
        java.lang.Long long9 = student0.getId();
        java.lang.String str10 = student0.getEmail();
        student0.setName("Teacher{id=null, name= Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0} }");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str10, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}", "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        studentDTO2.setName("Student{id=null, name='hi!', email='null', nick='Teacher{id=null, name=  }', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name=  }");
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher1);
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher1);
        java.lang.String str4 = teacher1.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name=  }" + "'", str4, "Teacher{id=null, name=  }");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=0, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=0, planning=1, evaluationSystem=null, courseware=null, modality=null}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Teacher{id=null, name= Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0} }");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name=  }");
        java.lang.Long long2 = teacher1.getId();
        teacher1.setName("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.Long long5 = teacher1.getId();
        java.lang.Long long6 = teacher1.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher1);
        java.lang.Long long8 = teacher1.getId();
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getName();
        com.engSoft.entities.Course course12 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str13 = courseDTO5.getCode();
        java.lang.String str14 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getFinalTime();
        java.lang.String str5 = course0.getFinalTime();
        java.lang.String str6 = course0.getFinalTime();
        java.lang.Long long7 = course0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.Long long4 = teacher3.getId();
        java.lang.String str5 = teacher3.toString();
        java.lang.String str6 = teacher3.getName();
        teacher3.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
        teacher3.setName("Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}");
        teacher3.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}");
        java.lang.Long long13 = teacher3.getId();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str2, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }" + "'", str5, "Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertNull(long13);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        java.lang.Long long3 = feedback0.getIdStudent();
        java.lang.Long long4 = feedback0.getIdCourse();
        feedback0.setIdCourse((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Long long5 = feedbackDTO0.getIdStudent();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        com.engSoft.entities.Feedback feedback9 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Class<?> wildcardClass10 = feedbackDTO0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=null, deletedComments=10}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=null, deletedComments=32}", "Student{id=null, name='Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=true, deletedComments=10}", "Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=0, modality=null}");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        int int2 = student0.getDeletedComments();
        java.lang.Boolean boolean3 = student0.getBanned();
        java.lang.Boolean boolean4 = student0.getBanned();
        java.lang.String str5 = student0.getNick();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Teacher{id=null, name= null }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str3 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name= null }" + "'", str3, "Teacher{id=null, name= null }");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.Long long4 = student0.getId();
        student0.setDeletedComments(0);
        student0.setId((java.lang.Long) 0L);
        student0.setNick("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setName("");
        java.lang.Class<?> wildcardClass13 = student0.getClass();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        java.lang.Long long13 = feedback6.getIdStudent();
        feedback6.setMethodology((java.lang.Integer) (-1));
        feedback6.setPlanning((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(long13);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        feedback0.setIdStudent((java.lang.Long) 1L);
        java.lang.String str5 = feedback0.toString();
        feedback0.setIdCourse((java.lang.Long) 0L);
        java.lang.String str8 = feedback0.toString();
        feedback0.setCourseware((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(modalityEnum5);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long2 = teacher1.getId();
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        feedback0.setWorkload((java.lang.Integer) 1);
        java.lang.Long long3 = feedback0.getIdStudent();
        feedback0.setIdStudent((java.lang.Long) 100L);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.String str4 = student0.toString();
        java.lang.String str5 = student0.toString();
        student0.setEmail("Teacher{id=null, name= hi! }");
        java.lang.Boolean boolean8 = student0.getBanned();
        student0.setName("Teacher{id=null, name= Teacher{id=null, name= Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0} } }");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str4, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str5, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedback3.getModality();
        java.lang.Integer int5 = feedback3.getMethodology();
        java.lang.Integer int6 = feedback3.getEvaluationSystem();
        feedback3.setEvaluationSystem((java.lang.Integer) 10);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= null }");
        java.lang.String str2 = teacher1.getName();
        java.lang.String str3 = teacher1.getName();
        teacher1.setName("Teacher{id=null, name= Teacher{id=null, name=  } }");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= null }" + "'", str2, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name= null }" + "'", str3, "Teacher{id=null, name= null }");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 100);
        java.lang.Integer int8 = feedback0.getMethodology();
        feedback0.setMethodology((java.lang.Integer) (-1));
        feedback0.setIdCourse((java.lang.Long) 10L);
        feedback0.setMethodology((java.lang.Integer) 10);
        java.lang.Long long15 = feedback0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long15);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setIdCourse((java.lang.Long) 10L);
        java.lang.Long long6 = feedback0.getId();
        feedback0.setIdStudent((java.lang.Long) 0L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getName();
        java.lang.String str11 = courseDTO5.getFinalTime();
        java.lang.String str12 = courseDTO5.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        java.lang.Integer int8 = feedbackDTO0.getPlanning();
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        java.lang.Long long3 = feedback0.getIdStudent();
        java.lang.Long long4 = feedback0.getIdCourse();
        java.lang.Long long5 = feedback0.getIdStudent();
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        student0.setName("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str6 = student0.getName();
        java.lang.String str7 = student0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str6, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=null, name='Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}', email='null', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 10);
        java.lang.Integer int8 = feedback0.getEvaluationSystem();
        java.lang.String str9 = feedback0.toString();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}" + "'", str9, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str3 = studentDTO2.getName();
        java.lang.String str4 = studentDTO2.getName();
        studentDTO2.setEmail("Teacher{id=null, name= Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0} }");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getFinalTime();
        java.lang.String str5 = course0.getFinalTime();
        java.lang.String str6 = course0.getFinalTime();
        java.lang.String str7 = course0.getInitialTime();
        java.lang.Long long8 = course0.getIdTeacher();
        java.lang.String str9 = course0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Teacher{id=null, name= Teacher{id=null, name=  } }", "");
        studentDTO2.setName("Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=97}");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        studentDTO2.setName("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        studentDTO2.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str7 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getName();
        java.lang.String str10 = courseDTO5.getNameTeacher();
        java.lang.String str11 = courseDTO5.getName();
        java.lang.String str12 = courseDTO5.getInitialTime();
        com.engSoft.entities.Course course14 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) (-1L));
        java.lang.String str15 = course14.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.Long long1 = course0.getId();
        java.lang.String str2 = course0.getCode();
        java.lang.Long long3 = course0.getId();
        java.lang.String str4 = course0.toString();
        java.lang.String str5 = course0.getInitialTime();
        java.lang.Long long6 = course0.getIdTeacher();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str4, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = course8.getInitialTime();
        java.lang.String str10 = course8.getCode();
        java.lang.String str11 = course8.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 10);
        feedback0.setIdStudent((java.lang.Long) 0L);
        feedback0.setIdCourse((java.lang.Long) 100L);
        java.lang.Long long12 = feedback0.getId();
        java.lang.Integer int13 = feedback0.getCourseware();
        feedback0.setEvaluationSystem((java.lang.Integer) (-1));
        feedback0.setIdCourse((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean9 = student0.getBanned();
        java.lang.String str10 = student0.getEmail();
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str7 = student0.getEmail();
        student0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str2 = teacherDTO1.getName();
        teacherDTO1.setName("Teacher{id=null, name=  }");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Teacher{id=null, name=  }", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        java.lang.String str3 = studentDTO2.getEmail();
        java.lang.String str4 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str3, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name=  }" + "'", str4, "Teacher{id=null, name=  }");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        int int3 = student0.getDeletedComments();
        student0.setId((java.lang.Long) 10L);
        java.lang.Boolean boolean6 = student0.getBanned();
        java.lang.String str7 = student0.toString();
        java.lang.String str8 = student0.getEmail();
        student0.setDeletedComments((int) (byte) 10);
        java.lang.String str11 = student0.getNick();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str7, "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=10, planning=null, evaluationSystem=null, courseware=1, modality=null} }");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getMethodology();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        java.lang.String str4 = student0.getNick();
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long7 = student0.getId();
        student0.setEmail("Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (byte) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        student0.setName("");
        java.lang.Boolean boolean7 = student0.getBanned();
        student0.setBanned((java.lang.Boolean) true);
        student0.setDeletedComments(10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=35, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}", "Teacher{id=null, name= Teacher{id=null, name= null } }");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedback3.getCourseware();
        feedback3.setMethodology((java.lang.Integer) 100);
        java.lang.Integer int7 = feedback3.getPlanning();
        feedback3.setPlanning((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass10 = feedback3.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getWorkload();
        java.lang.Integer int3 = feedbackDTO0.getCourseware();
        java.lang.Integer int4 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        student0.setNick("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
        student0.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=-1}");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str2 = teacher1.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO3 = new com.engSoft.DTO.TeacherDTO(teacher1);
        java.lang.String str4 = teacherDTO3.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }" + "'", str2, "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str4, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Integer int3 = feedbackDTO0.getPlanning();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getPlanning();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str5 = studentDTO2.getEmail();
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str10 = studentDTO2.getEmail();
        studentDTO2.setEmail("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        studentDTO2.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.String str4 = student0.toString();
        java.lang.String str5 = student0.getEmail();
        java.lang.Boolean boolean6 = student0.getBanned();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}" + "'", str4, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Teacher{id=null, name= hi! }', email='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}', nick='hi!', isBanned=true, deletedComments=0}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}");
        java.lang.String str6 = courseDTO5.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        java.lang.Boolean boolean3 = student0.getBanned();
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedback0.getModality();
        feedback0.setWorkload((java.lang.Integer) (-1));
        feedback0.setCourseware((java.lang.Integer) 1);
        feedback0.setWorkload((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass10 = feedback0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getName();
        com.engSoft.entities.Course course12 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str13 = course12.toString();
        java.lang.String str14 = course12.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str13, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str14, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setName("Teacher{id=null, name= null }");
        java.lang.String str7 = student0.getEmail();
        java.lang.String str8 = student0.toString();
        student0.setNick("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        java.lang.String str11 = student0.getNick();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}" + "'", str8, "Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str11, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        java.lang.String str7 = student0.getNick();
        java.lang.Long long8 = student0.getId();
        student0.setEmail("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        student0.setName("Feedback{id=null, idCourse=null, idStudent=10, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        int int13 = student0.getDeletedComments();
        java.lang.Boolean boolean14 = student0.getBanned();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
        java.lang.Long long13 = feedback10.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long13);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
        java.lang.Integer int11 = feedbackDTO0.getMethodology();
        java.lang.Integer int12 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}", "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str3 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str3, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=null, idStudent=10, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}");
        java.lang.String str6 = courseDTO5.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}" + "'", str6, "Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Class<?> wildcardClass5 = feedbackDTO0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=35}");
        student0.setId((java.lang.Long) 10L);
        java.lang.String str13 = student0.getNick();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setEmail("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        java.lang.String str7 = student0.getEmail();
        student0.setNick("Teacher{id=null, name= Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL} }");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str7, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
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
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
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
        com.engSoft.entities.Feedback feedback11 = new com.engSoft.entities.Feedback();
        java.lang.Integer int12 = feedback11.getEvaluationSystem();
        java.lang.Long long13 = feedback11.getId();
        feedback11.setCourseware((java.lang.Integer) 1);
        feedback11.setWorkload((java.lang.Integer) (-1));
        java.lang.Integer int18 = feedback11.getPlanning();
        com.engSoft.DTO.FeedbackDTO feedbackDTO19 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int20 = feedbackDTO19.getWorkload();
        java.lang.Integer int21 = feedbackDTO19.getMethodology();
        com.engSoft.entities.Feedback feedback22 = new com.engSoft.entities.Feedback(feedbackDTO19);
        java.lang.Integer int23 = feedback22.getCourseware();
        feedback22.setMethodology((java.lang.Integer) 100);
        java.lang.Integer int26 = feedback22.getPlanning();
        java.lang.Integer int27 = feedback22.getEvaluationSystem();
        com.engSoft.entities.Feedback feedback28 = new com.engSoft.entities.Feedback();
        java.lang.Integer int29 = feedback28.getEvaluationSystem();
        feedback28.setIdCourse((java.lang.Long) 1L);
        feedback28.setIdCourse((java.lang.Long) 10L);
        feedback28.setEvaluationSystem((java.lang.Integer) 10);
        com.engSoft.entities.types.ModalityEnum modalityEnum36 = feedback28.getModality();
        feedback28.setMethodology((java.lang.Integer) 100);
        com.engSoft.entities.Feedback feedback39 = new com.engSoft.entities.Feedback();
        java.lang.Integer int40 = feedback39.getEvaluationSystem();
        java.lang.String str41 = feedback39.toString();
        java.lang.Long long42 = feedback39.getId();
        com.engSoft.entities.Feedback feedback43 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum44 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback43.setModality(modalityEnum44);
        feedback39.setModality(modalityEnum44);
        feedback28.setModality(modalityEnum44);
        feedback22.setModality(modalityEnum44);
        feedback11.setModality(modalityEnum44);
        feedback7.setModality(modalityEnum44);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(modalityEnum36);
        org.junit.Assert.assertNull(int40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str41, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long42);
        org.junit.Assert.assertTrue("'" + modalityEnum44 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum44.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Long long2 = feedback0.getId();
        feedback0.setCourseware((java.lang.Integer) 1);
        feedback0.setWorkload((java.lang.Integer) (-1));
        java.lang.Integer int7 = feedback0.getPlanning();
        java.lang.Long long8 = feedback0.getIdStudent();
        java.lang.Long long9 = feedback0.getIdStudent();
        feedback0.setEvaluationSystem((java.lang.Integer) 10);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setMethodology((java.lang.Integer) 1);
        java.lang.Integer int8 = feedback0.getWorkload();
        java.lang.Long long9 = feedback0.getId();
        java.lang.Integer int10 = feedback0.getEvaluationSystem();
        java.lang.Integer int11 = feedback0.getCourseware();
        java.lang.Integer int12 = feedback0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getPlanning();
        java.lang.Integer int2 = feedback0.getPlanning();
        java.lang.String str3 = feedback0.toString();
        java.lang.Long long4 = feedback0.getIdStudent();
        feedback0.setPlanning((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.toString();
        java.lang.String str2 = teacher0.toString();
        java.lang.String str3 = teacher0.toString();
        java.lang.String str4 = teacher0.toString();
        java.lang.String str5 = teacher0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Teacher{id=null, name= null }" + "'", str1, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= null }" + "'", str2, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name= null }" + "'", str3, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= null }" + "'", str4, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.Boolean boolean2 = student0.getBanned();
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        java.lang.String str5 = student0.getName();
        java.lang.String str6 = student0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str6, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Teacher{id=null, name= null }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str3 = studentDTO2.getEmail();
        java.lang.String str4 = studentDTO2.getEmail();
        java.lang.String str5 = studentDTO2.getName();
        studentDTO2.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str3, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str4, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        java.lang.String str38 = course0.getCode();
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
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Long long2 = feedbackDTO0.getIdStudent();
        java.lang.Long long3 = feedbackDTO0.getIdCourse();
        java.lang.Integer int4 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int7 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        java.lang.Long long4 = student0.getId();
        student0.setDeletedComments(0);
        student0.setId((java.lang.Long) 0L);
        java.lang.String str9 = student0.getName();
        java.lang.String str10 = student0.getEmail();
        java.lang.String str11 = student0.getName();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=10, planning=null, evaluationSystem=null, courseware=1, modality=null} }");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=10, modality=null}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback6.setCourseware((java.lang.Integer) 0);
        feedback6.setEvaluationSystem((java.lang.Integer) 10);
        feedback6.setPlanning((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        java.lang.String str6 = student0.getNick();
        student0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
        student0.setDeletedComments(100);
        student0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='null', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=false, deletedComments=-1}", "Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=10, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Feedback{id=null, idCourse=null, idStudent=-1, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=null, name='Teacher{id=null, name= hi! }', email='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}', nick='hi!', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Teacher{id=null, name= Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0} }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "", "Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}", "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        java.lang.Integer int8 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum9 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(modalityEnum9);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        java.lang.Integer int11 = feedback6.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        java.lang.String str7 = student0.getName();
        student0.setNick("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str7 = student0.getName();
        java.lang.Boolean boolean8 = student0.getBanned();
        student0.setDeletedComments((int) (short) -1);
        java.lang.String str11 = student0.getName();
        java.lang.String str12 = student0.getEmail();
        java.lang.String str13 = student0.getNick();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str16 = student0.getNick();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        student0.setBanned((java.lang.Boolean) false);
        student0.setDeletedComments((int) (short) 0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str7 = student0.getName();
        student0.setId((java.lang.Long) 100L);
        java.lang.String str10 = student0.getNick();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedback3.getModality();
        java.lang.Integer int5 = feedback3.getMethodology();
        java.lang.Long long6 = feedback3.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        java.lang.String str16 = courseDTO8.getCode();
        java.lang.String str17 = courseDTO8.getFinalTime();
        java.lang.String str18 = courseDTO8.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str17, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str18, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getInitialTime();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getName();
        java.lang.String str9 = courseDTO5.getNameTeacher();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setId((java.lang.Long) 0L);
        java.lang.String str5 = student0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0} }");
        teacherDTO1.setName("Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str2 = teacher1.toString();
        java.lang.String str3 = teacher1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }" + "'", str2, "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str3, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Long long2 = feedbackDTO0.getIdStudent();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Integer int4 = feedbackDTO0.getMethodology();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name=  }");
        java.lang.Long long2 = teacher1.getId();
        teacher1.setName("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.Long long5 = teacher1.getId();
        java.lang.Long long6 = teacher1.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher1);
        java.lang.String str8 = teacher1.toString();
        java.lang.String str9 = teacher1.getName();
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0} }" + "'", str8, "Teacher{id=null, name= Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0} }");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        feedback9.setCourseware((java.lang.Integer) 0);
        feedback9.setEvaluationSystem((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(modalityEnum8);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        student0.setName("Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}");
        student0.setBanned((java.lang.Boolean) false);
        int int6 = student0.getDeletedComments();
        java.lang.String str7 = student0.getNick();
        student0.setEmail("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE} }");
        student0.setNick("Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Long long1 = feedback0.getIdStudent();
        feedback0.setWorkload((java.lang.Integer) 1);
        java.lang.Long long4 = feedback0.getIdCourse();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setEvaluationSystem((java.lang.Integer) 10);
        java.lang.Integer int6 = feedback0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedback0.getModality();
        feedback0.setPlanning((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum4);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.Boolean boolean2 = student0.getBanned();
        student0.setNick("Teacher{id=null, name= hi! }");
        student0.setEmail("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        int int7 = student0.getDeletedComments();
        java.lang.Long long8 = student0.getId();
        java.lang.Long long9 = student0.getId();
        java.lang.String str10 = student0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student{id=null, name='null', email='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}" + "'", str10, "Student{id=null, name='null', email='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        student0.setEmail("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str9 = student0.getNick();
        java.lang.Long long10 = student0.getId();
        java.lang.String str11 = student0.toString();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}" + "'", str11, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacher0.getName();
        java.lang.Long long5 = teacher0.getId();
        java.lang.String str6 = teacher0.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO8 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str9 = teacherDTO8.getName();
        teacherDTO8.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        com.engSoft.entities.Teacher teacher12 = new com.engSoft.entities.Teacher(teacherDTO8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        teacherDTO1.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=35, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}");
        teacherDTO1.setName("Course{id=null, name='Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=0, courseware=null, modality=REMOTE}', code='Student{id=null, name='null', email='null', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}', idTeacher='0', initialTime='Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}', finalTime='Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}'}");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        java.lang.Integer int8 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback9 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback9.setCourseware((java.lang.Integer) 35);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}", "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}", "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
        java.lang.String str6 = courseDTO5.getInitialTime();
        java.lang.String str7 = courseDTO5.getName();
        java.lang.String str8 = courseDTO5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}" + "'", str6, "Feedback{id=null, idCourse=1, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}" + "'", str7, "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}" + "'", str8, "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Integer int4 = feedbackDTO0.getWorkload();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum6 = feedbackDTO0.getModality();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        java.lang.Long long9 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("hi!");
        java.lang.String str3 = student0.getNick();
        java.lang.String str4 = student0.getNick();
        java.lang.String str5 = student0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.String str2 = student0.toString();
        student0.setId((java.lang.Long) 1L);
        student0.setDeletedComments(0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str2, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        java.lang.String str28 = courseDTO19.getFinalTime();
        java.lang.String str29 = courseDTO19.getName();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str29, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
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
        java.lang.String str26 = courseDTO19.getName();
        java.lang.String str27 = courseDTO19.getFinalTime();
        java.lang.String str28 = courseDTO19.getFinalTime();
        java.lang.String str29 = courseDTO19.getInitialTime();
        java.lang.String str30 = courseDTO19.getNameTeacher();
        com.engSoft.entities.Course course32 = new com.engSoft.entities.Course(courseDTO19, (java.lang.Long) (-1L));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str20, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str26, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str27, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str28, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str30, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
        java.lang.String str17 = course0.toString();
        java.lang.String str18 = course0.getInitialTime();
        java.lang.String str19 = course0.getInitialTime();
        java.lang.String str20 = course0.getCode();
        java.lang.String str21 = course0.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str17, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedback6.getModality();
        feedback6.setCourseware((java.lang.Integer) 35);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        java.lang.String str28 = courseDTO19.getCode();
        java.lang.String str29 = courseDTO19.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str29, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student3 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO2);
        teacher3.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str6 = teacher3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }" + "'", str6, "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(0);
        java.lang.String str9 = student0.toString();
        java.lang.String str10 = student0.getEmail();
        java.lang.String str11 = student0.getEmail();
        java.lang.String str12 = student0.getNick();
        student0.setId((java.lang.Long) 10L);
        student0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setName("Teacher{id=null, name= null }");
        java.lang.String str7 = student0.getEmail();
        java.lang.String str8 = student0.getNick();
        java.lang.Boolean boolean9 = student0.getBanned();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("", "Feedback{id=null, idCourse=null, idStudent=10, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedback3.getModality();
        java.lang.Integer int5 = feedback3.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getCode();
        java.lang.Long long5 = course0.getIdTeacher();
        java.lang.String str6 = course0.getInitialTime();
        java.lang.String str7 = course0.getInitialTime();
        java.lang.String str8 = course0.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        teacherDTO1.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        com.engSoft.entities.Teacher teacher6 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str7 = teacher6.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        java.lang.Integer int10 = feedbackDTO0.getMethodology();
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
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Integer int3 = feedbackDTO0.getPlanning();
        java.lang.Integer int4 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedbackDTO0.getModality();
        java.lang.Integer int9 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getName();
        java.lang.String str3 = course0.getFinalTime();
        java.lang.String str4 = course0.getFinalTime();
        java.lang.String str5 = course0.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str7 = student0.getName();
        java.lang.Boolean boolean8 = student0.getBanned();
        student0.setName("Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }");
        com.engSoft.DTO.StudentDTO studentDTO11 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO11.setName("Student{id=null, name='Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=100, modality=null}', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO2);
        teacher3.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='10', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        com.engSoft.DTO.TeacherDTO teacherDTO6 = new com.engSoft.DTO.TeacherDTO(teacher3);
        teacherDTO6.setName("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int7 = feedbackDTO0.getPlanning();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        java.lang.Integer int9 = feedbackDTO0.getPlanning();
        com.engSoft.entities.Feedback feedback10 = new com.engSoft.entities.Feedback(feedbackDTO0);
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
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str3 = student0.getEmail();
        java.lang.String str4 = student0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str4, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        java.lang.Integer int7 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long9 = feedbackDTO0.getIdStudent();
        java.lang.Integer int10 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setEvaluationSystem((java.lang.Integer) 100);
        java.lang.Integer int6 = feedback0.getPlanning();
        feedback0.setIdStudent((java.lang.Long) 100L);
        feedback0.setMethodology((java.lang.Integer) 10);
        feedback0.setEvaluationSystem((java.lang.Integer) 35);
        feedback0.setPlanning((java.lang.Integer) 100);
        com.engSoft.entities.types.ModalityEnum modalityEnum15 = feedback0.getModality();
        feedback0.setIdStudent((java.lang.Long) 10L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum15);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
        java.lang.Integer int10 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        java.lang.String str3 = feedback0.toString();
        feedback0.setIdStudent((java.lang.Long) 100L);
        java.lang.Integer int6 = feedback0.getMethodology();
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Teacher{id=null, name= Student{id=10, name='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', email='null', nick='null', isBanned=null, deletedComments=0} }", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', nick='null', isBanned=null, deletedComments=10}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        java.lang.Integer int8 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str3 = studentDTO2.getName();
        java.lang.String str4 = studentDTO2.getName();
        studentDTO2.setName("Teacher{id=null, name= null }");
        java.lang.String str7 = studentDTO2.getName();
        java.lang.String str8 = studentDTO2.getName();
        studentDTO2.setName("Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=97}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= null }" + "'", str7, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= null }" + "'", str8, "Teacher{id=null, name= null }");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= Teacher{id=null, name= Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0} } }");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
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
        com.engSoft.entities.Course course17 = new com.engSoft.entities.Course();
        java.lang.String str18 = course17.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO24 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str25 = courseDTO24.getCode();
        course17.update(courseDTO24, (java.lang.Long) 1L);
        com.engSoft.DTO.CourseDTO courseDTO33 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str34 = courseDTO33.getInitialTime();
        course17.update(courseDTO33, (java.lang.Long) (-1L));
        java.lang.String str37 = courseDTO33.getInitialTime();
        java.lang.String str38 = courseDTO33.getFinalTime();
        java.lang.String str39 = courseDTO33.getName();
        java.lang.String str40 = courseDTO33.getFinalTime();
        course0.update(courseDTO33, (java.lang.Long) 100L);
        com.engSoft.DTO.CourseDTO courseDTO48 = new com.engSoft.DTO.CourseDTO("Teacher{id=null, name= Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0} }", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=0, planning=1, evaluationSystem=null, courseware=null, modality=null}");
        course0.update(courseDTO48, (java.lang.Long) (-1L));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str38, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str39, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str40, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        java.lang.Integer int3 = feedback0.getCourseware();
        feedback0.setIdStudent((java.lang.Long) 1L);
        java.lang.String str6 = feedback0.toString();
        java.lang.Integer int7 = feedback0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedback3.getCourseware();
        java.lang.Long long5 = feedback3.getIdCourse();
        feedback3.setIdStudent((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str7 = student0.toString();
        student0.setBanned((java.lang.Boolean) false);
        student0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
        java.lang.Long long12 = student0.getId();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str7, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
        com.engSoft.entities.Feedback feedback10 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long11 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.types.ModalityEnum modalityEnum12 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(modalityEnum12);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
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
        java.lang.Integer int11 = feedback6.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback4.setModality(modalityEnum5);
        feedback0.setModality(modalityEnum5);
        feedback0.setMethodology((java.lang.Integer) (-1));
        java.lang.Integer int10 = feedback0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertTrue("'" + modalityEnum5 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum5.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getEmail();
        java.lang.Boolean boolean2 = student0.getBanned();
        java.lang.String str3 = student0.toString();
        student0.setId((java.lang.Long) 0L);
        java.lang.String str6 = student0.getName();
        java.lang.String str7 = student0.toString();
        student0.setEmail("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str12 = student0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str3, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=0, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str7, "Student{id=0, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str12, "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        java.lang.String str5 = student0.toString();
        java.lang.Long long6 = student0.getId();
        student0.setName("Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long9 = student0.getId();
        student0.setBanned((java.lang.Boolean) true);
        student0.setNick("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=0, planning=1, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long14 = student0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getInitialTime();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "", "hi!", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Teacher{id=null, name= null }");
        java.lang.String str9 = courseDTO8.getName();
        course0.update(courseDTO8, (java.lang.Long) (-1L));
        java.lang.String str12 = course0.toString();
        java.lang.Long long13 = course0.getId();
        java.lang.String str14 = course0.getName();
        java.lang.Long long15 = course0.getId();
        java.lang.String str16 = course0.toString();
        com.engSoft.DTO.CourseDTO courseDTO17 = null;
        // The following exception was thrown during execution in test generation
        try {
            course0.update(courseDTO17, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str9, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}" + "'", str12, "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str14, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}" + "'", str16, "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Boolean boolean5 = student0.getBanned();
        java.lang.String str6 = student0.getName();
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.types.ModalityEnum modalityEnum4 = feedbackDTO0.getModality();
        java.lang.Integer int5 = feedbackDTO0.getPlanning();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = courseDTO5.getFinalTime();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        com.engSoft.entities.Course course13 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        java.lang.String str14 = course13.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        java.lang.Integer int6 = feedbackDTO0.getPlanning();
        java.lang.Long long7 = feedbackDTO0.getIdStudent();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        java.lang.Integer int9 = feedbackDTO0.getMethodology();
        java.lang.Integer int10 = feedbackDTO0.getCourseware();
        java.lang.Integer int11 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Integer int4 = feedbackDTO0.getPlanning();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        com.engSoft.entities.types.ModalityEnum modalityEnum6 = feedbackDTO0.getModality();
        java.lang.Integer int7 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= null }");
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str4 = teacher3.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= null }" + "'", str2, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name= null } }" + "'", str4, "Teacher{id=null, name= Teacher{id=null, name= null } }");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Long long2 = feedback0.getId();
        feedback0.setCourseware((java.lang.Integer) 1);
        feedback0.setMethodology((java.lang.Integer) 1);
        feedback0.setIdStudent((java.lang.Long) 10L);
        feedback0.setIdStudent((java.lang.Long) 0L);
        java.lang.String str11 = feedback0.toString();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
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
        java.lang.String str38 = courseDTO29.getNameTeacher();
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
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacher0.getName();
        java.lang.Long long5 = teacher0.getId();
        java.lang.String str6 = teacher0.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacherDTO7.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setNick("");
        java.lang.String str7 = student0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher5 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher6 = new com.engSoft.entities.Teacher(teacherDTO1);
        teacher6.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long9 = teacher6.getId();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        com.engSoft.DTO.TeacherDTO teacherDTO4 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str5 = teacher0.toString();
        java.lang.String str6 = teacher0.getName();
        java.lang.String str7 = teacher0.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
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
        java.lang.String str38 = course8.getFinalTime();
        java.lang.String str39 = course8.getInitialTime();
        java.lang.String str40 = course8.getName();
        java.lang.String str41 = course8.getCode();
        java.lang.String str42 = course8.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str22, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str35, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str38, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str40, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
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
        com.engSoft.DTO.CourseDTO courseDTO49 = new com.engSoft.DTO.CourseDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Teacher{id=null, name=  }", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        course0.update(courseDTO49, (java.lang.Long) 1L);
        java.lang.String str52 = courseDTO49.getNameTeacher();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str52, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback5 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback6.setIdStudent((java.lang.Long) 0L);
        java.lang.Integer int9 = feedback6.getCourseware();
        feedback6.setIdStudent((java.lang.Long) 0L);
        java.lang.Integer int12 = feedback6.getWorkload();
        java.lang.Long long13 = feedback6.getId();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(long13);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        com.engSoft.entities.Teacher teacher2 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str5 = teacherDTO1.getName();
        teacherDTO1.setName("Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=0, modality=null}");
        teacherDTO1.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}" + "'", str5, "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Teacher{id=null, name= hi! }", "hi!", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str6 = courseDTO5.getCode();
        java.lang.String str7 = courseDTO5.getNameTeacher();
        java.lang.Class<?> wildcardClass8 = courseDTO5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str6, "Teacher{id=null, name= hi! }");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getCourseware();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int5 = feedbackDTO0.getWorkload();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        java.lang.Integer int8 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
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
        java.lang.String str23 = courseDTO16.getNameTeacher();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str22, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str23, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE} }");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} }");
        teacher1.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=10, planning=null, evaluationSystem=null, courseware=1, modality=null}");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 100);
        java.lang.Integer int8 = feedback0.getMethodology();
        feedback0.setPlanning((java.lang.Integer) 0);
        java.lang.Integer int11 = feedback0.getMethodology();
        java.lang.Integer int12 = feedback0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Integer int4 = feedbackDTO0.getPlanning();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedbackDTO0.getModality();
        java.lang.Long long8 = feedbackDTO0.getIdCourse();
        java.lang.Integer int9 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Teacher{id=null, name= hi! }", "hi!", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Class<?> wildcardClass6 = courseDTO5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
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
        java.lang.String str88 = courseDTO84.getNameTeacher();
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
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}" + "'", str88, "Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.String str2 = student0.getName();
        java.lang.String str3 = student0.getName();
        student0.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        com.engSoft.entities.types.ModalityEnum modalityEnum12 = feedbackDTO0.getModality();
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
        org.junit.Assert.assertNull(modalityEnum12);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.Long long4 = teacher3.getId();
        com.engSoft.DTO.TeacherDTO teacherDTO5 = new com.engSoft.DTO.TeacherDTO(teacher3);
        teacher3.setName("Teacher{id=null, name= Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0} } }");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
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
        com.engSoft.entities.types.ModalityEnum modalityEnum11 = feedback7.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(modalityEnum11);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Integer int8 = feedbackDTO0.getPlanning();
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        java.lang.Integer int10 = feedbackDTO0.getWorkload();
        java.lang.Long long11 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        int int1 = student0.getDeletedComments();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str3 = studentDTO2.getName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(0);
        java.lang.String str9 = student0.toString();
        student0.setId((java.lang.Long) (-1L));
        student0.setId((java.lang.Long) (-1L));
        student0.setBanned((java.lang.Boolean) false);
        com.engSoft.DTO.StudentDTO studentDTO16 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        java.lang.String str2 = teacher1.toString();
        teacher1.setName("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=0, modality=null}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }" + "'", str2, "Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        java.lang.String str6 = student0.getName();
        student0.setId((java.lang.Long) 0L);
        student0.setName("Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=0}");
        int int11 = student0.getDeletedComments();
        java.lang.String str12 = student0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student{id=0, name='Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str12, "Student{id=0, name='Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=0}', email='null', nick='null', isBanned=false, deletedComments=0}");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacher0.getName();
        java.lang.String str5 = teacher0.toString();
        java.lang.String str6 = teacher0.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=0, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=0, modality=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        java.lang.String str4 = student0.getNick();
        int int5 = student0.getDeletedComments();
        student0.setDeletedComments((int) '#');
        student0.setNick("Student{id=null, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        java.lang.String str10 = student0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        java.lang.String str9 = courseDTO5.getName();
        java.lang.String str10 = courseDTO5.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback9 = new com.engSoft.entities.Feedback(feedbackDTO0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        java.lang.Integer int9 = feedbackDTO0.getWorkload();
        java.lang.Integer int10 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
        teacherDTO1.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setBanned((java.lang.Boolean) true);
        java.lang.String str7 = student0.getName();
        java.lang.Boolean boolean8 = student0.getBanned();
        student0.setDeletedComments((int) (short) -1);
        java.lang.String str11 = student0.getName();
        java.lang.String str12 = student0.getEmail();
        student0.setNick("Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments(0);
        java.lang.String str7 = student0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}" + "'", str7, "Student{id=null, name='null', email='null', nick='hi!', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Teacher{id=null, name= null }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        studentDTO2.setEmail("");
        java.lang.String str7 = studentDTO2.getName();
        java.lang.String str8 = studentDTO2.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Teacher{id=null, name= null }" + "'", str7, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= null }" + "'", str8, "Teacher{id=null, name= null }");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        com.engSoft.DTO.StudentDTO studentDTO9 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments((int) 'a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
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
        java.lang.String str35 = courseDTO27.getName();
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
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        java.lang.Long long6 = feedback0.getId();
        feedback0.setCourseware((java.lang.Integer) 100);
        feedback0.setPlanning((java.lang.Integer) 0);
        com.engSoft.entities.Feedback feedback11 = new com.engSoft.entities.Feedback();
        java.lang.Long long12 = feedback11.getIdStudent();
        feedback11.setIdCourse((java.lang.Long) 100L);
        java.lang.Integer int15 = feedback11.getMethodology();
        com.engSoft.entities.Feedback feedback16 = new com.engSoft.entities.Feedback();
        java.lang.Integer int17 = feedback16.getEvaluationSystem();
        feedback16.setIdCourse((java.lang.Long) 1L);
        feedback16.setIdCourse((java.lang.Long) 10L);
        com.engSoft.entities.Feedback feedback22 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum23 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback22.setModality(modalityEnum23);
        feedback22.setIdStudent((java.lang.Long) 1L);
        java.lang.String str27 = feedback22.toString();
        feedback22.setIdCourse((java.lang.Long) 0L);
        com.engSoft.entities.types.ModalityEnum modalityEnum30 = com.engSoft.entities.types.ModalityEnum.PRESENTIAL;
        feedback22.setModality(modalityEnum30);
        feedback16.setModality(modalityEnum30);
        feedback11.setModality(modalityEnum30);
        feedback0.setModality(modalityEnum30);
        feedback0.setWorkload((java.lang.Integer) 1);
        feedback0.setCourseware((java.lang.Integer) 35);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertTrue("'" + modalityEnum23 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum23.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str27, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + modalityEnum30 + "' != '" + com.engSoft.entities.types.ModalityEnum.PRESENTIAL + "'", modalityEnum30.equals(com.engSoft.entities.types.ModalityEnum.PRESENTIAL));
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        java.lang.Long long3 = feedback0.getIdStudent();
        java.lang.Long long4 = feedback0.getIdCourse();
        java.lang.Long long5 = feedback0.getIdStudent();
        java.lang.Integer int6 = feedback0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
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
        java.lang.String str45 = courseDTO37.getName();
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str45, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
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
        java.lang.Integer int10 = feedbackDTO0.getCourseware();
        java.lang.Integer int11 = feedbackDTO0.getPlanning();
        java.lang.Long long12 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setName("Teacher{id=null, name= hi! }");
        student0.setName("Student{id=null, name='null', email='null', nick='Teacher{id=null, name= hi! }', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', nick='null', isBanned=true, deletedComments=10}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}");
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student3 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int7 = feedbackDTO0.getMethodology();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        com.engSoft.entities.types.ModalityEnum modalityEnum9 = feedbackDTO0.getModality();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(modalityEnum9);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.Boolean boolean2 = student0.getBanned();
        student0.setNick("Teacher{id=null, name= hi! }");
        java.lang.Long long5 = student0.getId();
        int int6 = student0.getDeletedComments();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str4 = teacher0.getName();
        java.lang.String str5 = teacher0.toString();
        java.lang.String str6 = teacher0.toString();
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Long long9 = teacher0.getId();
        java.lang.Long long10 = teacher0.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str4, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str6, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        int int2 = student0.getDeletedComments();
        java.lang.Boolean boolean3 = student0.getBanned();
        java.lang.String str4 = student0.getName();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str7 = student0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
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
        java.lang.String str26 = course25.getFinalTime();
        java.lang.String str27 = course25.getCode();
        java.lang.String str28 = course25.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str22, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str26, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}", "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        java.lang.String str3 = studentDTO2.getName();
        studentDTO2.setName("hi!");
        java.lang.String str6 = studentDTO2.getName();
        studentDTO2.setEmail("Teacher{id=null, name= Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0} }");
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student9 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student3 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getCode();
        java.lang.String str9 = courseDTO5.getFinalTime();
        java.lang.String str10 = courseDTO5.getName();
        com.engSoft.entities.Course course12 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str13 = course12.getFinalTime();
        java.lang.String str14 = course12.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
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
        java.lang.Boolean boolean16 = student0.getBanned();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + false + "'", boolean16, false);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        int int5 = student0.getDeletedComments();
        student0.setEmail("Teacher{id=null, name=  }");
        java.lang.Long long8 = student0.getId();
        student0.setNick("Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str11 = student0.toString();
        java.lang.String str12 = student0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student{id=null, name='null', email='Teacher{id=null, name=  }', nick='Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}" + "'", str11, "Student{id=null, name='null', email='Teacher{id=null, name=  }', nick='Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum2 = feedbackDTO0.getModality();
        java.lang.Integer int3 = feedbackDTO0.getMethodology();
        java.lang.Integer int4 = feedbackDTO0.getPlanning();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        com.engSoft.entities.Feedback feedback8 = new com.engSoft.entities.Feedback(feedbackDTO0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        java.lang.Integer int8 = feedbackDTO0.getPlanning();
        java.lang.Long long9 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback10 = new com.engSoft.entities.Feedback(feedbackDTO0);
        feedback10.setPlanning((java.lang.Integer) 35);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=10, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student3 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
        java.lang.String str11 = teacher0.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO12 = new com.engSoft.DTO.TeacherDTO(teacher0);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str8, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.Long long2 = feedback0.getId();
        feedback0.setCourseware((java.lang.Integer) 1);
        feedback0.setIdCourse((java.lang.Long) 10L);
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = feedback0.getModality();
        feedback0.setWorkload((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(modalityEnum7);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        student0.setNick("");
        student0.setEmail("Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=false, deletedComments=0}");
        java.lang.Long long8 = student0.getId();
        java.lang.String str9 = student0.getNick();
        student0.setEmail("Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
        student0.setDeletedComments((int) (short) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        java.lang.String str5 = student0.toString();
        java.lang.String str6 = student0.getNick();
        student0.setNick("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
        java.lang.String str9 = student0.toString();
        student0.setName("hi!");
        java.lang.String str12 = student0.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}" + "'", str5, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}" + "'", str9, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}', isBanned=null, deletedComments=10}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Teacher{id=null, name= null }", "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str6 = courseDTO5.getFinalTime();
        java.lang.String str7 = courseDTO5.getInitialTime();
        java.lang.String str8 = courseDTO5.getFinalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str6, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str7, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str8, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        teacherDTO1.setName("Teacher{id=null, name= null }");
        java.lang.String str4 = teacherDTO1.getName();
        java.lang.String str5 = teacherDTO1.getName();
        java.lang.String str6 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher7 = new com.engSoft.entities.Teacher(teacherDTO1);
        java.lang.String str8 = teacherDTO1.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Teacher{id=null, name= null }" + "'", str4, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= null }" + "'", str6, "Teacher{id=null, name= null }");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Teacher{id=null, name= null }" + "'", str8, "Teacher{id=null, name= null }");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        feedback0.setIdCourse((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + modalityEnum8 + "' != '" + com.engSoft.entities.types.ModalityEnum.PRESENTIAL + "'", modalityEnum8.equals(com.engSoft.entities.types.ModalityEnum.PRESENTIAL));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}" + "'", str10, "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getInitialTime();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "", "hi!", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Teacher{id=null, name= null }");
        java.lang.String str9 = courseDTO8.getName();
        course0.update(courseDTO8, (java.lang.Long) (-1L));
        java.lang.String str12 = course0.toString();
        java.lang.Long long13 = course0.getId();
        java.lang.String str14 = course0.getName();
        java.lang.Long long15 = course0.getId();
        java.lang.String str16 = course0.toString();
        java.lang.String str17 = course0.getFinalTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str9, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}" + "'", str12, "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str14, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}" + "'", str16, "Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Teacher{id=null, name= null }" + "'", str17, "Teacher{id=null, name= null }");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setId((java.lang.Long) 100L);
        java.lang.Boolean boolean7 = student0.getBanned();
        java.lang.String str8 = student0.getNick();
        student0.setId((java.lang.Long) 0L);
        java.lang.String str11 = student0.getName();
        student0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}");
        java.lang.String str14 = student0.toString();
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student{id=0, name='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=null, deletedComments=10}" + "'", str14, "Student{id=0, name='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
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
        java.lang.String str20 = course19.getFinalTime();
        java.lang.String str21 = course19.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str20, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Course{id=null, name='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}', code='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', idTeacher='10', initialTime='Teacher{id=null, name=  }', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str21, "Course{id=null, name='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}', code='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', idTeacher='10', initialTime='Teacher{id=null, name=  }', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=100, planning=10, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=1, evaluationSystem=null, courseware=0, modality=null}", "", "Teacher{id=null, name= Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0} }", "Teacher{id=null, name= Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0} }");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str7 = student0.toString();
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Long long10 = student0.getId();
        student0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str7, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback7 = new com.engSoft.entities.Feedback(feedbackDTO0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
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
        java.lang.Integer int12 = feedback9.getPlanning();
        feedback9.setWorkload((java.lang.Integer) 0);
        feedback9.setPlanning((java.lang.Integer) 10);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(modalityEnum8);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        java.lang.Integer int10 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int11 = feedbackDTO0.getCourseware();
        java.lang.Integer int12 = feedbackDTO0.getWorkload();
        java.lang.Integer int13 = feedbackDTO0.getCourseware();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        feedback0.setPlanning((java.lang.Integer) 100);
        java.lang.Integer int8 = feedback0.getMethodology();
        feedback0.setPlanning((java.lang.Integer) 0);
        java.lang.Integer int11 = feedback0.getEvaluationSystem();
        feedback0.setWorkload((java.lang.Integer) 10);
        java.lang.Integer int14 = feedback0.getCourseware();
        feedback0.setPlanning((java.lang.Integer) 35);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
        java.lang.Integer int15 = feedback6.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
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
        java.lang.String str48 = course47.getCode();
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.Feedback feedback3 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int4 = feedbackDTO0.getCourseware();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        java.lang.Integer int8 = feedbackDTO0.getMethodology();
        java.lang.Integer int9 = feedbackDTO0.getPlanning();
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
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
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
        java.lang.String str14 = feedback0.toString();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=1, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=null}");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getInitialTime();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "", "hi!", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Teacher{id=null, name= null }");
        java.lang.String str9 = courseDTO8.getName();
        course0.update(courseDTO8, (java.lang.Long) (-1L));
        java.lang.String str12 = course0.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str9, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str12, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        teacher0.setName("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long4 = teacher0.getId();
        java.lang.String str5 = teacher0.toString();
        java.lang.Long long6 = teacher0.getId();
        java.lang.String str7 = teacher0.getName();
        java.lang.Long long8 = teacher0.getId();
        java.lang.String str9 = teacher0.getName();
        java.lang.String str10 = teacher0.toString();
        teacher0.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str5, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }" + "'", str10, "Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        java.lang.Integer int3 = feedback0.getCourseware();
        feedback0.setIdStudent((java.lang.Long) 1L);
        java.lang.String str6 = feedback0.toString();
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
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
        java.lang.Integer int12 = feedback0.getEvaluationSystem();
        feedback0.setPlanning((java.lang.Integer) 10);
        java.lang.Integer int15 = feedback0.getEvaluationSystem();
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertTrue("'" + modalityEnum8 + "' != '" + com.engSoft.entities.types.ModalityEnum.PRESENTIAL + "'", modalityEnum8.equals(com.engSoft.entities.types.ModalityEnum.PRESENTIAL));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}" + "'", str10, "Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getName();
        java.lang.String str7 = courseDTO5.getInitialTime();
        com.engSoft.entities.Course course9 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        java.lang.String str10 = courseDTO5.getCode();
        com.engSoft.entities.Course course12 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 1L);
        java.lang.String str13 = courseDTO5.getInitialTime();
        java.lang.String str14 = courseDTO5.getInitialTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setEvaluationSystem((java.lang.Integer) 100);
        feedback0.setIdStudent((java.lang.Long) 1L);
        com.engSoft.entities.types.ModalityEnum modalityEnum8 = feedback0.getModality();
        feedback0.setEvaluationSystem((java.lang.Integer) 100);
        feedback0.setMethodology((java.lang.Integer) 100);
        feedback0.setMethodology((java.lang.Integer) (-1));
        feedback0.setCourseware((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(modalityEnum8);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=1, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Teacher{id=null, name= Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10} }", "Course{id=null, name='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}', code='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', idTeacher='10', initialTime='Teacher{id=null, name=  }', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Student{id=null, name='Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}', email='null', nick='null', isBanned=null, deletedComments=0}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}', nick='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}', isBanned=null, deletedComments=10}', isBanned=null, deletedComments=32}");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Integer int3 = feedbackDTO0.getPlanning();
        java.lang.Integer int4 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Long long6 = feedbackDTO0.getIdCourse();
        java.lang.Integer int7 = feedbackDTO0.getCourseware();
        java.lang.Integer int8 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum9 = feedbackDTO0.getModality();
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
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        com.engSoft.util.CustomErrorType customErrorType1 = new com.engSoft.util.CustomErrorType("Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
        java.lang.String str2 = customErrorType1.getErrorMessage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}" + "'", str2, "Student{id=0, name='Teacher{id=null, name= hi! }', email='null', nick='hi!', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "");
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str5 = studentDTO2.getName();
        java.lang.String str6 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        java.lang.Long long7 = feedbackDTO0.getIdCourse();
        java.lang.Integer int8 = feedbackDTO0.getPlanning();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getFinalTime();
        com.engSoft.DTO.CourseDTO courseDTO7 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str8 = courseDTO7.getCode();
        course0.update(courseDTO7, (java.lang.Long) 1L);
        java.lang.String str11 = courseDTO7.getNameTeacher();
        java.lang.String str12 = courseDTO7.getName();
        java.lang.String str13 = courseDTO7.getFinalTime();
        java.lang.String str14 = courseDTO7.getFinalTime();
        java.lang.String str15 = courseDTO7.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str13, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        java.lang.String str5 = student0.toString();
        java.lang.Long long6 = student0.getId();
        student0.setName("Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Long long9 = student0.getId();
        student0.setBanned((java.lang.Boolean) true);
        student0.setNick("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=0, planning=1, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.String str14 = student0.getNick();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=0, planning=1, evaluationSystem=null, courseware=null, modality=null}" + "'", str14, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=0, planning=1, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
        java.lang.String str2 = teacherDTO1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum1 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback0.setModality(modalityEnum1);
        java.lang.Long long3 = feedback0.getIdStudent();
        java.lang.Integer int4 = feedback0.getPlanning();
        java.lang.Long long5 = feedback0.getId();
        org.junit.Assert.assertTrue("'" + modalityEnum1 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum1.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        int int5 = student0.getDeletedComments();
        student0.setEmail("Teacher{id=null, name=  }");
        java.lang.Long long8 = student0.getId();
        java.lang.Long long9 = student0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        com.engSoft.entities.Teacher teacher1 = new com.engSoft.entities.Teacher("Student{id=null, name='null', email='null', nick='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}', isBanned=true, deletedComments=0}");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        student0.setDeletedComments((int) 'a');
        java.lang.String str9 = student0.getEmail();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=10, courseware=0, modality=null}");
        java.lang.String str12 = student0.getName();
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        feedback6.setIdCourse((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
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
        feedback0.setIdCourse((java.lang.Long) (-1L));
        feedback0.setWorkload((java.lang.Integer) 35);
        java.lang.Integer int29 = feedback0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertTrue("'" + modalityEnum22 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum22.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
        org.junit.Assert.assertNull(int29);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        java.lang.String str4 = student0.getNick();
        student0.setEmail("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Long long7 = student0.getId();
        student0.setName("Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=null, planning=10, evaluationSystem=10, courseware=null, modality=null}");
        student0.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getPlanning();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.Long long1 = course0.getId();
        java.lang.String str2 = course0.getCode();
        java.lang.Long long3 = course0.getId();
        java.lang.String str4 = course0.getCode();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str3 = student0.getName();
        java.lang.Long long4 = student0.getId();
        java.lang.String str5 = student0.getName();
        student0.setDeletedComments((int) (short) 0);
        student0.setBanned((java.lang.Boolean) true);
        student0.setDeletedComments((int) (short) 100);
        java.lang.String str12 = student0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str3, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str5, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=100}" + "'", str12, "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=true, deletedComments=100}");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("hi!", "");
        java.lang.String str3 = studentDTO2.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student4 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        com.engSoft.DTO.StudentDTO studentDTO6 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str7 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO8 = new com.engSoft.DTO.StudentDTO(student0);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=1, planning=null, evaluationSystem=10, courseware=1, modality=REMOTE}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='100', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}', nick='null', isBanned=null, deletedComments=35}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=1, planning=1, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setName("hi!");
        java.lang.String str4 = student0.getName();
        student0.setName("");
        java.lang.Boolean boolean7 = student0.getBanned();
        java.lang.String str8 = student0.toString();
        java.lang.String str9 = student0.getEmail();
        java.lang.Boolean boolean10 = student0.getBanned();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str8, "Student{id=null, name='', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setId((java.lang.Long) 100L);
        student0.setBanned((java.lang.Boolean) true);
        com.engSoft.DTO.StudentDTO studentDTO9 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.String str10 = studentDTO9.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.String str2 = student0.toString();
        student0.setId((java.lang.Long) 1L);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.String str7 = student0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str2, "Student{id=null, name='null', email='null', nick='null', isBanned=null, deletedComments=0}");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        student0.setNick("hi!");
        com.engSoft.DTO.StudentDTO studentDTO4 = new com.engSoft.DTO.StudentDTO(student0);
        studentDTO4.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}");
        java.lang.String str7 = studentDTO4.getEmail();
        studentDTO4.setName("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}");
        java.lang.String str10 = studentDTO4.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
        java.lang.String str37 = course0.toString();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str37, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        com.engSoft.entities.types.ModalityEnum modalityEnum3 = feedbackDTO0.getModality();
        java.lang.Long long4 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = feedbackDTO0.getModality();
        java.lang.Integer int6 = feedbackDTO0.getWorkload();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "Student{id=null, name='null', email='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', nick='null', isBanned=false, deletedComments=0}", "Feedback{id=null, idCourse=null, idStudent=10, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        com.engSoft.entities.Course course7 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 100L);
        com.engSoft.entities.Course course9 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        java.lang.String str10 = courseDTO5.getCode();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str10, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='0', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Student{id=null, name='Teacher{id=null, name= null }', email='null', nick='null', isBanned=null, deletedComments=10}");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        java.lang.Boolean boolean2 = student0.getBanned();
        student0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.Class<?> wildcardClass3 = student0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Teacher{id=null, name=  }");
        studentDTO2.setEmail("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        java.lang.String str5 = studentDTO2.getName();
        studentDTO2.setEmail("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', email='null', nick='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}', isBanned=true, deletedComments=0}");
        // The following exception was thrown during execution in test generation
        try {
            com.engSoft.entities.Student student8 = new com.engSoft.entities.Student(studentDTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}" + "'", str5, "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        java.lang.String str3 = studentDTO2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}" + "'", str3, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        int int7 = student0.getDeletedComments();
        java.lang.String str8 = student0.getNick();
        student0.setBanned((java.lang.Boolean) false);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str8, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        int int1 = student0.getDeletedComments();
        java.lang.String str2 = student0.getNick();
        java.lang.String str3 = student0.getEmail();
        java.lang.String str4 = student0.getEmail();
        student0.setNick("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='1', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        student0.setEmail("Course{id=null, name='Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=false, deletedComments=0}', code='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', idTeacher='10', initialTime='Teacher{id=null, name=  }', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getEvaluationSystem();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int5 = feedback4.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getInitialTime();
        java.lang.String str7 = courseDTO5.getName();
        java.lang.String str8 = courseDTO5.getCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str7, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        java.lang.String str2 = feedback0.toString();
        java.lang.Long long3 = feedback0.getIdStudent();
        java.lang.Long long4 = feedback0.getIdCourse();
        java.lang.Integer int5 = feedback0.getMethodology();
        feedback0.setPlanning((java.lang.Integer) 0);
        java.lang.Integer int8 = feedback0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str2, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
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
        feedback0.setIdStudent((java.lang.Long) 0L);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        java.lang.String str7 = student0.getNick();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Boolean boolean10 = student0.getBanned();
        java.lang.String str11 = student0.getName();
        student0.setDeletedComments((int) (byte) 100);
        com.engSoft.DTO.StudentDTO studentDTO14 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setDeletedComments((int) '#');
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Integer int3 = feedbackDTO0.getPlanning();
        java.lang.Integer int4 = feedbackDTO0.getWorkload();
        java.lang.Integer int5 = feedbackDTO0.getMethodology();
        java.lang.Long long6 = feedbackDTO0.getIdStudent();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Integer int8 = feedbackDTO0.getWorkload();
        java.lang.Integer int9 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        java.lang.String str1 = student0.getName();
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO(student0);
        student0.setBanned((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = student0.getBanned();
        java.lang.Boolean boolean6 = student0.getBanned();
        java.lang.String str7 = student0.getNick();
        java.lang.Boolean boolean8 = student0.getBanned();
        java.lang.String str9 = student0.getNick();
        java.lang.String str10 = student0.toString();
        java.lang.String str11 = student0.getNick();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}" + "'", str10, "Student{id=null, name='null', email='null', nick='null', isBanned=false, deletedComments=0}");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setIdCourse((java.lang.Long) 1L);
        feedback0.setPlanning((java.lang.Integer) 1);
        java.lang.Long long6 = feedback0.getId();
        com.engSoft.entities.types.ModalityEnum modalityEnum7 = null;
        feedback0.setModality(modalityEnum7);
        java.lang.Long long9 = feedback0.getId();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.Boolean boolean3 = student0.getBanned();
        int int4 = student0.getDeletedComments();
        java.lang.Long long5 = student0.getId();
        java.lang.Boolean boolean6 = student0.getBanned();
        student0.setName("Teacher{id=null, name= null }");
        java.lang.String str9 = student0.getEmail();
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        java.lang.String str44 = course0.getFinalTime();
        java.lang.String str45 = course0.getFinalTime();
        java.lang.String str46 = course0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str44, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str45, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str46, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
        teacherDTO1.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=0, methodology=null, planning=null, evaluationSystem=null, courseware=0, modality=null}");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO2);
        teacher3.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        java.lang.String str6 = teacher3.toString();
        com.engSoft.DTO.TeacherDTO teacherDTO7 = new com.engSoft.DTO.TeacherDTO(teacher3);
        java.lang.String str8 = teacherDTO7.getName();
        java.lang.String str9 = teacherDTO7.getName();
        teacherDTO7.setName("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }" + "'", str6, "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str8, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}" + "'", str9, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        java.lang.String str17 = course14.toString();
        java.lang.Long long18 = course14.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str10, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(long16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str17, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long18);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        java.lang.Integer int1 = feedback0.getEvaluationSystem();
        feedback0.setCourseware((java.lang.Integer) 1);
        java.lang.Integer int4 = feedback0.getWorkload();
        java.lang.Integer int5 = feedback0.getEvaluationSystem();
        feedback0.setIdStudent((java.lang.Long) 0L);
        java.lang.Integer int8 = feedback0.getPlanning();
        feedback0.setMethodology((java.lang.Integer) 1);
        java.lang.Integer int11 = feedback0.getEvaluationSystem();
        feedback0.setMethodology((java.lang.Integer) 35);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        com.engSoft.entities.Course course0 = new com.engSoft.entities.Course();
        java.lang.String str1 = course0.getInitialTime();
        java.lang.String str2 = course0.getInitialTime();
        com.engSoft.DTO.CourseDTO courseDTO8 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "", "hi!", "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}", "Teacher{id=null, name= null }");
        java.lang.String str9 = courseDTO8.getName();
        course0.update(courseDTO8, (java.lang.Long) (-1L));
        java.lang.String str12 = course0.getName();
        java.lang.String str13 = course0.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str9, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str12, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}" + "'", str13, "Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
        java.lang.Integer int11 = feedbackDTO0.getEvaluationSystem();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getWorkload();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Long long3 = feedbackDTO0.getIdStudent();
        java.lang.Long long4 = feedbackDTO0.getIdStudent();
        java.lang.Long long5 = feedbackDTO0.getIdCourse();
        com.engSoft.entities.Feedback feedback6 = new com.engSoft.entities.Feedback(feedbackDTO0);
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        java.lang.Long long8 = feedbackDTO0.getIdStudent();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=10}", "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        studentDTO2.setName("Teacher{id=null, name=  }");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
        feedback11.setPlanning((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass14 = feedback11.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(modalityEnum3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(modalityEnum9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Teacher{id=null, name= null }", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        studentDTO2.setName("Teacher{id=null, name= null }");
        studentDTO2.setEmail("Teacher{id=null, name= Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} } }");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        java.lang.String str1 = teacher0.getName();
        com.engSoft.DTO.TeacherDTO teacherDTO2 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str3 = teacher0.toString();
        java.lang.Long long4 = teacher0.getId();
        java.lang.String str5 = teacher0.toString();
        teacher0.setName("Student{id=0, name='null', email='null', nick='null', isBanned=true, deletedComments=0}");
        teacher0.setName("Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'} }");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Teacher{id=null, name= null }" + "'", str3, "Teacher{id=null, name= null }");
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Teacher{id=null, name= null }" + "'", str5, "Teacher{id=null, name= null }");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
        java.lang.String str31 = course0.getName();
        java.lang.String str32 = course0.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str30, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str31, "Feedback{id=null, idCourse=1, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Teacher{id=null, name= hi! }" + "'", str32, "Teacher{id=null, name= hi! }");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setName("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        student0.setDeletedComments((int) (short) 10);
        student0.setDeletedComments((int) '#');
        java.lang.String str7 = student0.getNick();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
        java.lang.Boolean boolean10 = student0.getBanned();
        java.lang.String str11 = student0.getName();
        student0.setDeletedComments((int) (byte) 100);
        com.engSoft.DTO.StudentDTO studentDTO14 = new com.engSoft.DTO.StudentDTO(student0);
        java.lang.Class<?> wildcardClass15 = studentDTO14.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str11, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setDeletedComments(10);
        student0.setEmail("Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}");
        student0.setBanned((java.lang.Boolean) true);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        com.engSoft.entities.Teacher teacher0 = new com.engSoft.entities.Teacher();
        com.engSoft.DTO.TeacherDTO teacherDTO1 = new com.engSoft.DTO.TeacherDTO(teacher0);
        java.lang.String str2 = teacherDTO1.getName();
        com.engSoft.entities.Teacher teacher3 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.entities.Teacher teacher4 = new com.engSoft.entities.Teacher(teacherDTO1);
        com.engSoft.DTO.TeacherDTO teacherDTO5 = new com.engSoft.DTO.TeacherDTO(teacher4);
        java.lang.String str6 = teacherDTO5.getName();
        com.engSoft.entities.Teacher teacher7 = new com.engSoft.entities.Teacher(teacherDTO5);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        com.engSoft.entities.Feedback feedback0 = new com.engSoft.entities.Feedback();
        feedback0.setWorkload((java.lang.Integer) 1);
        java.lang.Long long3 = feedback0.getIdStudent();
        com.engSoft.entities.Feedback feedback4 = new com.engSoft.entities.Feedback();
        com.engSoft.entities.types.ModalityEnum modalityEnum5 = com.engSoft.entities.types.ModalityEnum.REMOTE;
        feedback4.setModality(modalityEnum5);
        feedback0.setModality(modalityEnum5);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertTrue("'" + modalityEnum5 + "' != '" + com.engSoft.entities.types.ModalityEnum.REMOTE + "'", modalityEnum5.equals(com.engSoft.entities.types.ModalityEnum.REMOTE));
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        com.engSoft.entities.Student student0 = new com.engSoft.entities.Student();
        student0.setBanned((java.lang.Boolean) true);
        java.lang.Long long3 = student0.getId();
        student0.setNick("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        java.lang.Long long6 = student0.getId();
        java.lang.String str7 = student0.getNick();
        java.lang.Long long8 = student0.getId();
        student0.setEmail("Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        student0.setName("Feedback{id=null, idCourse=null, idStudent=10, workload=null, methodology=1, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        int int13 = student0.getDeletedComments();
        student0.setEmail("Feedback{id=null, idCourse=null, idStudent=0, workload=null, methodology=1, planning=null, evaluationSystem=10, courseware=1, modality=REMOTE}");
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str7, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}", "Feedback{id=null, idCourse=100, idStudent=0, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Student{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=0}", "Teacher{id=null, name= Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='0', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'} }");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}", "Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}', code='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', idTeacher='100', initialTime='Teacher{id=null, name= Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null} }', finalTime='Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}'}", "", "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        java.lang.String str6 = courseDTO5.getName();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}" + "'", str6, "Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=null}");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        java.lang.String str16 = courseDTO8.getInitialTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}" + "'", str2, "Course{id=null, name='null', code='null', idTeacher='null', initialTime='null', finalTime='null'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str12, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        com.engSoft.DTO.StudentDTO studentDTO2 = new com.engSoft.DTO.StudentDTO("Student{id=10, name='hi!', email='null', nick='null', isBanned=null, deletedComments=0}", "Teacher{id=null, name=  }");
        studentDTO2.setEmail("Feedback{id=null, idCourse=0, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=PRESENTIAL}");
        studentDTO2.setName("Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        studentDTO2.setEmail("Feedback{id=null, idCourse=1, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=100, courseware=null, modality=null}");
        java.lang.String str9 = studentDTO2.getName();
        studentDTO2.setEmail("Feedback{id=null, idCourse=null, idStudent=null, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=1, modality=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str9, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        com.engSoft.DTO.FeedbackDTO feedbackDTO0 = new com.engSoft.DTO.FeedbackDTO();
        java.lang.Integer int1 = feedbackDTO0.getPlanning();
        java.lang.Integer int2 = feedbackDTO0.getMethodology();
        java.lang.Integer int3 = feedbackDTO0.getPlanning();
        java.lang.Integer int4 = feedbackDTO0.getEvaluationSystem();
        java.lang.Integer int5 = feedbackDTO0.getCourseware();
        java.lang.Integer int6 = feedbackDTO0.getCourseware();
        java.lang.Integer int7 = feedbackDTO0.getWorkload();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Course{id=null, name='Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}', code='', idTeacher='-1', initialTime='Student{id=null, name='null', email='null', nick='null', isBanned=true, deletedComments=10}', finalTime='Teacher{id=null, name= null }'}", "", "Feedback{id=null, idCourse=10, idStudent=null, workload=null, methodology=-1, planning=100, evaluationSystem=null, courseware=null, modality=null}", "Feedback{id=null, idCourse=null, idStudent=100, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "Student{id=10, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', email='null', nick='null', isBanned=null, deletedComments=97}");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        com.engSoft.DTO.CourseDTO courseDTO5 = new com.engSoft.DTO.CourseDTO("Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}", "", "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        java.lang.String str6 = courseDTO5.getCode();
        com.engSoft.entities.Course course8 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 10L);
        java.lang.String str9 = courseDTO5.getFinalTime();
        com.engSoft.entities.Course course11 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        com.engSoft.entities.Course course13 = new com.engSoft.entities.Course(courseDTO5, (java.lang.Long) 0L);
        java.lang.String str14 = course13.getFinalTime();
        java.lang.String str15 = course13.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str9, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str14, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str15, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
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
        com.engSoft.entities.Feedback feedback10 = new com.engSoft.entities.Feedback(feedbackDTO0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(modalityEnum5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
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
        java.lang.Long long14 = feedback6.getId();
        feedback6.setEvaluationSystem((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(modalityEnum7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
        java.lang.String str22 = course0.toString();
        java.lang.Long long23 = course0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str20, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}" + "'", str21, "Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}" + "'", str22, "Course{id=null, name='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}', code='', idTeacher='-1', initialTime='', finalTime='Feedback{id=null, idCourse=null, idStudent=1, workload=null, methodology=null, planning=null, evaluationSystem=null, courseware=null, modality=REMOTE}'}");
        org.junit.Assert.assertNull(long23);
    }
}

