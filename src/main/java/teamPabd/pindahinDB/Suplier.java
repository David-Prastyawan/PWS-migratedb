/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamPabd.pindahinDB;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "suplier")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Suplier.findAll", query = "SELECT s FROM Suplier s"),
    @NamedQuery(name = "Suplier.findByIdSuplier", query = "SELECT s FROM Suplier s WHERE s.idSuplier = :idSuplier"),
    @NamedQuery(name = "Suplier.findByNmSuplier", query = "SELECT s FROM Suplier s WHERE s.nmSuplier = :nmSuplier"),
    @NamedQuery(name = "Suplier.findByAlamatSp", query = "SELECT s FROM Suplier s WHERE s.alamatSp = :alamatSp"),
    @NamedQuery(name = "Suplier.findByNoTlpSp", query = "SELECT s FROM Suplier s WHERE s.noTlpSp = :noTlpSp")})
public class Suplier implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idSuplier")
    private String idSuplier;
    @Basic(optional = false)
    @Column(name = "nmSuplier")
    private String nmSuplier;
    @Basic(optional = false)
    @Column(name = "AlamatSp")
    private String alamatSp;
    @Basic(optional = false)
    @Column(name = "noTlpSp")
    private String noTlpSp;

    public Suplier() {
    }

    public Suplier(String idSuplier) {
        this.idSuplier = idSuplier;
    }

    public Suplier(String idSuplier, String nmSuplier, String alamatSp, String noTlpSp) {
        this.idSuplier = idSuplier;
        this.nmSuplier = nmSuplier;
        this.alamatSp = alamatSp;
        this.noTlpSp = noTlpSp;
    }

    public String getIdSuplier() {
        return idSuplier;
    }

    public void setIdSuplier(String idSuplier) {
        this.idSuplier = idSuplier;
    }

    public String getNmSuplier() {
        return nmSuplier;
    }

    public void setNmSuplier(String nmSuplier) {
        this.nmSuplier = nmSuplier;
    }

    public String getAlamatSp() {
        return alamatSp;
    }

    public void setAlamatSp(String alamatSp) {
        this.alamatSp = alamatSp;
    }

    public String getNoTlpSp() {
        return noTlpSp;
    }

    public void setNoTlpSp(String noTlpSp) {
        this.noTlpSp = noTlpSp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSuplier != null ? idSuplier.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Suplier)) {
            return false;
        }
        Suplier other = (Suplier) object;
        if ((this.idSuplier == null && other.idSuplier != null) || (this.idSuplier != null && !this.idSuplier.equals(other.idSuplier))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "teamPabd.pindahinDB.Suplier[ idSuplier=" + idSuplier + " ]";
    }
    
}
