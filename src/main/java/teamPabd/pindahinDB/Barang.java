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
@Table(name = "barang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Barang.findAll", query = "SELECT b FROM Barang b"),
    @NamedQuery(name = "Barang.findByIdBarang", query = "SELECT b FROM Barang b WHERE b.idBarang = :idBarang"),
    @NamedQuery(name = "Barang.findByNmBarang", query = "SELECT b FROM Barang b WHERE b.nmBarang = :nmBarang"),
    @NamedQuery(name = "Barang.findByStok", query = "SELECT b FROM Barang b WHERE b.stok = :stok")})
public class Barang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idBarang")
    private String idBarang;
    @Basic(optional = false)
    @Column(name = "nm_Barang")
    private String nmBarang;
    @Basic(optional = false)
    @Column(name = "stok")
    private String stok;

    public Barang() {
    }

    public Barang(String idBarang) {
        this.idBarang = idBarang;
    }

    public Barang(String idBarang, String nmBarang, String stok) {
        this.idBarang = idBarang;
        this.nmBarang = nmBarang;
        this.stok = stok;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getNmBarang() {
        return nmBarang;
    }

    public void setNmBarang(String nmBarang) {
        this.nmBarang = nmBarang;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBarang != null ? idBarang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Barang)) {
            return false;
        }
        Barang other = (Barang) object;
        if ((this.idBarang == null && other.idBarang != null) || (this.idBarang != null && !this.idBarang.equals(other.idBarang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "teamPabd.pindahinDB.Barang[ idBarang=" + idBarang + " ]";
    }
    
}
