package pl.edu.wat.wcy.isi.hd.sourcehd.pojo;

import javax.persistence.*;

@Entity
@Table(name = "TMP_CUSTOMERS", schema = "stage")
public class Customer {

  @GeneratedValue(generator = "stage.S_TMP_CUSTOMERS")
  @SequenceGenerator(name="stage.S_TMP_CUSTOMERS", sequenceName="stage.S_TMP_CUSTOMERS", allocationSize=1)
  @Id
  @Column(name = "TCUST_SRC_ID")
  private Long tcustSrcId;
  @Column(name = "TCUST_TYPE")
  private String tcustType;
  @Column(name = "TCUST_EMAIL")
  private String tcustEmail;
  @Column(name = "TCUST_FIRST_NAME")
  private String tcustFirstName;
  @Column(name = "TCUST_LAST_NAME")
  private String tcustLastName;
  @Column(name = "TCUST_COMPANY")
  private String tcustCompany;
  @Column(name = "TCUST_PHONE_NO")
  private String tcustPhoneNo;
  @Column(name = "TCUST_PESEL")
  private String tcustPesel;
  @Column(name = "TCUST_REGON")
  private String tcustRegon;
  @Column(name = "TCUST_STATUS")
  private String tcustStatus;
  @Column(name = "TCUST_ZIP")
  private String tcustZip;
  @Column(name = "TCUST_CITY")
  private String tcustCity;
  @Column(name = "TCUST_STREET")
  private String tcustStreet;
  @Column(name = "TCUST_APARTMENT")
  private String tcustApartment;

  public Customer(String tcustType, String tcustEmail, String tcustFirstName, String tcustLastName, String tcustCompany, String tcustPhoneNo, String tcustPesel, String tcustRegon, String tcustStatus, String tcustZip, String tcustCity, String tcustStreet, String tcustApartment) {
    this.tcustType = tcustType;
    this.tcustEmail = tcustEmail;
    this.tcustFirstName = tcustFirstName;
    this.tcustLastName = tcustLastName;
    this.tcustCompany = tcustCompany;
    this.tcustPhoneNo = tcustPhoneNo;
    this.tcustPesel = tcustPesel;
    this.tcustRegon = tcustRegon;
    this.tcustStatus = tcustStatus;
    this.tcustZip = tcustZip;
    this.tcustCity = tcustCity;
    this.tcustStreet = tcustStreet;
    this.tcustApartment = tcustApartment;
  }

  public Long getTcustSrcId() {
    return tcustSrcId;
  }

  public void setTcustSrcId(Long tcustSrcId) {
    this.tcustSrcId = tcustSrcId;
  }


  public String getTcustType() {
    return tcustType;
  }

  public void setTcustType(String tcustType) {
    this.tcustType = tcustType;
  }


  public String getTcustEmail() {
    return tcustEmail;
  }

  public void setTcustEmail(String tcustEmail) {
    this.tcustEmail = tcustEmail;
  }


  public String getTcustFirstName() {
    return tcustFirstName;
  }

  public void setTcustFirstName(String tcustFirstName) {
    this.tcustFirstName = tcustFirstName;
  }


  public String getTcustLastName() {
    return tcustLastName;
  }

  public void setTcustLastName(String tcustLastName) {
    this.tcustLastName = tcustLastName;
  }


  public String getTcustCompany() {
    return tcustCompany;
  }

  public void setTcustCompany(String tcustCompany) {
    this.tcustCompany = tcustCompany;
  }


  public String getTcustPhoneNo() {
    return tcustPhoneNo;
  }

  public void setTcustPhoneNo(String tcustPhoneNo) {
    this.tcustPhoneNo = tcustPhoneNo;
  }


  public String getTcustPesel() {
    return tcustPesel;
  }

  public void setTcustPesel(String tcustPesel) {
    this.tcustPesel = tcustPesel;
  }


  public String getTcustRegon() {
    return tcustRegon;
  }

  public void setTcustRegon(String tcustRegon) {
    this.tcustRegon = tcustRegon;
  }


  public String getTcustStatus() {
    return tcustStatus;
  }

  public void setTcustStatus(String tcustStatus) {
    this.tcustStatus = tcustStatus;
  }


  public String getTcustZip() {
    return tcustZip;
  }

  public void setTcustZip(String tcustZip) {
    this.tcustZip = tcustZip;
  }


  public String getTcustCity() {
    return tcustCity;
  }

  public void setTcustCity(String tcustCity) {
    this.tcustCity = tcustCity;
  }


  public String getTcustStreet() {
    return tcustStreet;
  }

  public void setTcustStreet(String tcustStreet) {
    this.tcustStreet = tcustStreet;
  }


  public String getTcustApartment() {
    return tcustApartment;
  }

  public void setTcustApartment(String tcustApartment) {
    this.tcustApartment = tcustApartment;
  }

}
