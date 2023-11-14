package com.csc340.main;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "writer_requests")
public class WriterRequests {

    @Id
    private Long id;

    private String requestType;
    private String requestText;

    // Constructors, getters, setters, and other methods

    public WriterRequests() {
        // Default constructor
    }

    public WriterRequests(String requestType, String requestText) {
        this.requestType = requestType;
        this.requestText = requestText;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestText() {
        return requestText;
    }

    public void setRequestText(String requestText) {
        this.requestText = requestText;
    }

}

