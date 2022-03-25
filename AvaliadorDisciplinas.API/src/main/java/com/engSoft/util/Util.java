package com.engSoft.util;

public class Util {
    public enum ModalityEnum {
        PRESENTIAL, REMOTE
    }

    public enum FilterEnum {
        NAME, GRADE, TEACHER
    }
    public enum ReactionTypeEnum {
        LIKE, DISLIKE, COMPLAINT
    }
    public static boolean isNullOrEmpty(String s) {
        return (s == null || s.trim().isEmpty());
    }
}
