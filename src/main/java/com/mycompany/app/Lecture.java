package com.mycompany.app;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="Lectures")
public class Lecture {
@Id
@GeneratedValue
@Column(name = "ID")
private int id;
private String name;
private double credits;
//Getters and settings
}
