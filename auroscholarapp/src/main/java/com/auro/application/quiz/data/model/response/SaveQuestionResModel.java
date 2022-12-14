package com.auro.application.quiz.data.model.response;

import com.auro.application.quiz.data.model.submitQuestionModel.SubmitExamAPIResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SaveQuestionResModel {

    @SerializedName("QuestionID")
    @Expose
    private String QuestionID;

    @SerializedName("AnswerID")
    @Expose
    private String AnswerID;

    @SerializedName("QuestionSerialNo")
    @Expose
    private String QuestionSerialNo;

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("error")
    @Expose
    private Boolean error;

    @SerializedName("ExamAssignmentID")
    @Expose
    private String ExamAssignmentID;

    @SerializedName("SubmitExamAPIResult")
    @Expose
    private SubmitExamAPIResult submitExamAPIResult;


    @SerializedName("SaveAnswerApiResult")
    @Expose
    private SaveAnswerResModel SaveAnswerResModel;

    @SerializedName("SuccessFlag")
    @Expose
    private Boolean successFlag;

    @SerializedName("complete_by")
    @Expose
    private String complete_by;


    @SerializedName("user_prefered_language_id")
    @Expose
    private Integer userPreferedLanguage_id;



    byte[] imageBytes;

    private String examId;

    public byte[] getImageBytes() {
        return imageBytes;
    }

    public void setImageBytes(byte[] imageBytes) {
        this.imageBytes = imageBytes;
    }

    public String getQuestionID() {
        return QuestionID;
    }

    public void setQuestionID(String questionID) {
        QuestionID = questionID;
    }

    public String getAnswerID() {
        return AnswerID;
    }

    public void setAnswerID(String answerID) {
        AnswerID = answerID;
    }

    public String getQuestionSerialNo() {
        return QuestionSerialNo;
    }

    public void setQuestionSerialNo(String questionSerialNo) {
        QuestionSerialNo = questionSerialNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public String getExamAssignmentID() {
        return ExamAssignmentID;
    }

    public void setExamAssignmentID(String examAssignmentID) {
        ExamAssignmentID = examAssignmentID;
    }

    public SubmitExamAPIResult getSubmitExamAPIResult() {
        return submitExamAPIResult;
    }

    public void setSubmitExamAPIResult(SubmitExamAPIResult submitExamAPIResult) {
        this.submitExamAPIResult = submitExamAPIResult;
    }

    public com.auro.application.quiz.data.model.response.SaveAnswerResModel getSaveAnswerResModel() {
        return SaveAnswerResModel;
    }

    public void setSaveAnswerResModel(com.auro.application.quiz.data.model.response.SaveAnswerResModel saveAnswerResModel) {
        SaveAnswerResModel = saveAnswerResModel;
    }

    public Boolean getSuccessFlag() {
        return successFlag;
    }

    public void setSuccessFlag(Boolean successFlag) {
        this.successFlag = successFlag;
    }

    public String getComplete_by() {
        return complete_by;
    }

    public void setComplete_by(String complete_by) {
        this.complete_by = complete_by;
    }
    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public Integer getUserPreferedLanguage_id() {
        return userPreferedLanguage_id;
    }

    public void setUserPreferedLanguage_id(Integer userPreferedLanguage_id) {
        this.userPreferedLanguage_id = userPreferedLanguage_id;
    }
}
