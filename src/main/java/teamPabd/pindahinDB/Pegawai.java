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
@Table(name = "pegawai")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pegawai.findAll", query = "SELECT p FROM Pegawai p"),
    @NamedQuery(name = "Pegawai.findByIdPegawai", query = "SELECT p FROM Pegawai p WHERE p.idPegawai = :idPegawai"),
    @NamedQuery(name = "Pegawai.findByNama", query = "SELECT p FROM Pegawai p WHERE p.nama = :nama"),
    @NamedQuery(name = "Pegawai.findByAlamat", query = "SELECT p FROM Pegawai p WHERE p.alamat = :alamat"),
    @NamedQuery(name = "Pegawai.findByNoTlp", query = "SELECT p FROM Pegawai p WHERE p.noTlp = :noTlp")})
public class Pegawai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idPegawai")
    private String idPegawai;
    @Basic(optional = false)
    @Column(name = "Nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "Alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "noTlp")
    private String noTlp;

    public Pegawai() {
    }

    public Pegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public Pegawai(String idPegawai, String nama, String alamat, String noTlp) {
        this.idPegawai = idPegawai;
        this.nama = nama;
        this.alamat = alamat;
        this.noTlp = noTlp;
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTlp() {
        return noTlp;
    }

    public void setNoTlp(String noTlp) {
        this.noTlp = noTlp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPegawai != null ? idPegawai.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pegawai)) {
            return false;
        }
        Pegawai other = (Pegawai) object;
        if ((this.idPegawai == null && other.idPegawai != null) || (this.idPegawai != null && !this.idPegawai.equals(other.idPegawai))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "teamPabd.pindahinDB.Pegawai[ idPegawai=" + idPegawai + " ]";
    }
    
}
