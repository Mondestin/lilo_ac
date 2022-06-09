/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liloac;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Mondestin
 */
@Entity
@Table(name = "LECTURERS", catalog = "", schema = "SYDNEY")
@NamedQueries({
    @NamedQuery(name = "Lecturers.findAll", query = "SELECT l FROM Lecturers l"),
    @NamedQuery(name = "Lecturers.findById", query = "SELECT l FROM Lecturers l WHERE l.id = :id"),
    @NamedQuery(name = "Lecturers.findByName", query = "SELECT l FROM Lecturers l WHERE l.name = :name"),
    @NamedQuery(name = "Lecturers.findBySurname", query = "SELECT l FROM Lecturers l WHERE l.surname = :surname"),
    @NamedQuery(name = "Lecturers.findByContact", query = "SELECT l FROM Lecturers l WHERE l.contact = :contact"),
    @NamedQuery(name = "Lecturers.findByEmail", query = "SELECT l FROM Lecturers l WHERE l.email = :email")})
public class Lecturers implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "SURNAME")
    private String surname;
    @Basic(optional = false)
    @Column(name = "CONTACT")
    private int contact;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;

    public Lecturers() {
    }

    public Lecturers(Integer id) {
        this.id = id;
    }

    public Lecturers(Integer id, String name, String surname, int contact, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.contact = contact;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        String oldSurname = this.surname;
        this.surname = surname;
        changeSupport.firePropertyChange("surname", oldSurname, surname);
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        int oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lecturers)) {
            return false;
        }
        Lecturers other = (Lecturers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "liloac.Lecturers[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
