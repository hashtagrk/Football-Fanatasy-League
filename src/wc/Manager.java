/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wc;

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
 * @author Mahe
 */
@Entity
@Table(name = "MANAGER", catalog = "", schema = "RAJ")
@NamedQueries({
    @NamedQuery(name = "Manager.findAll", query = "SELECT m FROM Manager m")
    , @NamedQuery(name = "Manager.findByLicenseId", query = "SELECT m FROM Manager m WHERE m.licenseId = :licenseId")
    , @NamedQuery(name = "Manager.findByName", query = "SELECT m FROM Manager m WHERE m.name = :name")
    , @NamedQuery(name = "Manager.findByCountry", query = "SELECT m FROM Manager m WHERE m.country = :country")
    , @NamedQuery(name = "Manager.findByClubName", query = "SELECT m FROM Manager m WHERE m.clubName = :clubName")})
public class Manager implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LICENSE_ID")
    private String licenseId;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "COUNTRY")
    private String country;
    @Basic(optional = false)
    @Column(name = "CLUB_NAME")
    private String clubName;

    public Manager() {
    }

    public Manager(String licenseId) {
        this.licenseId = licenseId;
    }

    public Manager(String licenseId, String name, String country, String clubName) {
        this.licenseId = licenseId;
        this.name = name;
        this.country = country;
        this.clubName = clubName;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        String oldLicenseId = this.licenseId;
        this.licenseId = licenseId;
        changeSupport.firePropertyChange("licenseId", oldLicenseId, licenseId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        String oldCountry = this.country;
        this.country = country;
        changeSupport.firePropertyChange("country", oldCountry, country);
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        String oldClubName = this.clubName;
        this.clubName = clubName;
        changeSupport.firePropertyChange("clubName", oldClubName, clubName);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (licenseId != null ? licenseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Manager)) {
            return false;
        }
        Manager other = (Manager) object;
        if ((this.licenseId == null && other.licenseId != null) || (this.licenseId != null && !this.licenseId.equals(other.licenseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "wc.Manager[ licenseId=" + licenseId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
