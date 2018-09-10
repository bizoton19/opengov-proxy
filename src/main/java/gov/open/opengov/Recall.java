package gov.open.opengov;

import java.io.Serializable;
import org.springframework.core.serializer.Serializer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "RecallID", "RecallNumber", "RecallDate", "Description", "URL", "Title", "ConsumerContact",
        "LastPublishDate", "Products", "Inconjunctions", "Images", "Injuries", "Manufacturers", "Retailers",
        "Importers", "Distributors", "SoldAtLabel", "ManufacturerCountries", "ProductUPCs", "Hazards", "Remedies",
        "RemedyOptions" })

public class Recall {

    @JsonProperty("Recallid")
    private Integer recallID;
    @JsonProperty("RecallNumber")
    private String recallNumber;
    @JsonProperty("RecallDate")
    private String recallDate;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("URL")
    private String uRL;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("ConsumerContact")
    private String consumerContact;
    @JsonProperty("LastPublishDate")
    private String lastPublishDate;
    @JsonProperty("Products")
    private List<Product> products;
    @JsonProperty("Inconjunctions")
    private List<Inconjunction> inconjunctions = null;
    @JsonProperty("Images")
    private List<Image> images = null;
    @JsonProperty("Injuries")
    private List<Injury> injuries = null;
    @JsonProperty("Manufacturers")
    private List<Manufacturer> manufacturers = null;
    @JsonProperty("Retailers")
    private List<Retailer> retailers = null;
    // @JsonProperty("Importers")
    private List<Object> importers = null;
    // @JsonProperty("Distributors")
    private List<Object> distributors = null;
    // @JsonProperty("SoldAtLabel")
    private Object soldAtLabel;
    @JsonProperty("ManufacturerCountries")
    private List<ManufacturerCountry> manufacturerCountries = null;
    @JsonProperty("ProductUPCs")
    private List<ProductUPC> productUPCs = null;
    @JsonProperty("Hazards")
    private List<Hazard> hazards = null;
    @JsonProperty("Remedies")
    private List<Remedy> remedies = null;
    @JsonProperty("RemedyOptions")
    private List<RemedyOption> remedyOptions = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getRecallID() {
        return recallID;
    }

    public void setRecallID(Integer recallID) {
        this.recallID = recallID;
    }

    public String getRecallNumber() {
        return recallNumber;
    }

    public void setRecallNumber(String recallNumber) {
        this.recallNumber = recallNumber;
    }

    public String getRecallDate() {
        return recallDate;
    }

    public void setRecallDate(String recallDate) {
        this.recallDate = recallDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getURL() {
        return uRL;
    }

    public void setURL(String uRL) {
        this.uRL = uRL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConsumerContact() {
        return consumerContact;
    }

    public void setConsumerContact(String consumerContact) {
        this.consumerContact = consumerContact;
    }

    public String getLastPublishDate() {
        return lastPublishDate;
    }

    public void setLastPublishDate(String lastPublishDate) {
        this.lastPublishDate = lastPublishDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Inconjunction> getInconjunctions() {
        return inconjunctions;
    }

    public void setInconjunctions(List<Inconjunction> inconjunctions) {
        this.inconjunctions = inconjunctions;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Injury> getInjuries() {
        return injuries;
    }

    public void setInjuries(List<Injury> injuries) {
        this.injuries = injuries;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(List<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public List<Retailer> getRetailers() {
        return retailers;
    }

    public void setRetailers(List<Retailer> retailers) {
        this.retailers = retailers;
    }

    public List<Object> getImporters() {
        return importers;
    }

    public void setImporters(List<Object> importers) {
        this.importers = importers;
    }

    public List<Object> getDistributors() {
        return distributors;
    }

    public void setDistributors(List<Object> distributors) {
        this.distributors = distributors;
    }

    public Object getSoldAtLabel() {
        return soldAtLabel;
    }

    public void setSoldAtLabel(Object soldAtLabel) {
        this.soldAtLabel = soldAtLabel;
    }

    public List<ManufacturerCountry> getManufacturerCountries() {
        return manufacturerCountries;
    }

    public void setManufacturerCountries(List<ManufacturerCountry> manufacturerCountries) {
        this.manufacturerCountries = manufacturerCountries;
    }

    public List<ProductUPC> getProductUPCs() {
        return productUPCs;
    }

    public void setProductUPCs(List<ProductUPC> productUPCs) {
        this.productUPCs = productUPCs;
    }

    public List<Hazard> getHazards() {
        return hazards;
    }

    public void setHazards(List<Hazard> hazards) {
        this.hazards = hazards;
    }

    public List<Remedy> getRemedies() {
        return remedies;
    }

    public void setRemedies(List<Remedy> remedies) {
        this.remedies = remedies;
    }

    public List<RemedyOption> getRemedyOptions() {
        return remedyOptions;
    }

    public void setRemedyOptions(List<RemedyOption> remedyOptions) {
        this.remedyOptions = remedyOptions;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public static class Manufacturer {

        @JsonProperty("Name")
        private String name;
        @JsonProperty("CompanyID")
        private String companyID;

        @JsonProperty("Name")
        public String getName() {
            return name;
        }

        @JsonProperty("Name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("CompanyID")
        public String getCompanyID() {
            return companyID;
        }

        @JsonProperty("CompanyID")
        public void setCompanyID(String companyID) {
            this.companyID = companyID;
        }

    }

    public static class Product {

        @JsonProperty("Name")
        private String name;
        @JsonProperty("Description")
        private String description;
        @JsonProperty("Model")
        private String model;
        @JsonProperty("Type")
        private String type;
        @JsonProperty("CategoryID")
        private String categoryID;
        @JsonProperty("NumberOfUnits")
        private String numberOfUnits;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("Name")
        public String getName() {
            return name;
        }

        @JsonProperty("Name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("Description")
        public String getDescription() {
            return description;
        }

        @JsonProperty("Description")
        public void setDescription(String description) {
            this.description = description;
        }

        @JsonProperty("Model")
        public String getModel() {
            return model;
        }

        @JsonProperty("Model")
        public void setModel(String model) {
            this.model = model;
        }

        @JsonProperty("Type")
        public String getType() {
            return type;
        }

        @JsonProperty("Type")
        public void setType(String type) {
            this.type = type;
        }

        @JsonProperty("CategoryID")
        public String getCategoryID() {
            return categoryID;
        }

        @JsonProperty("CategoryID")
        public void setCategoryID(String categoryID) {
            this.categoryID = categoryID;
        }

        @JsonProperty("NumberOfUnits")
        public String getNumberOfUnits() {
            return numberOfUnits;
        }

        @JsonProperty("NumberOfUnits")
        public void setNumberOfUnits(String numberOfUnits) {
            this.numberOfUnits = numberOfUnits;
        }
    }

    public static class Hazard {

        @JsonProperty("Name")
        private String name;
        @JsonProperty("HazardType")
        private String hazardType;
        @JsonProperty("HazardTypeID")
        private String hazardTypeID;

        @JsonProperty("Name")
        public String getName() {
            return name;
        }

        @JsonProperty("Name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("HazardType")
        public String getHazardType() {
            return hazardType;
        }

        @JsonProperty("HazardType")
        public void setHazardType(String hazardType) {
            this.hazardType = hazardType;
        }

        @JsonProperty("HazardTypeID")
        public String getHazardTypeID() {
            return hazardTypeID;
        }

        @JsonProperty("HazardTypeID")
        public void setHazardTypeID(String hazardTypeID) {
            this.hazardTypeID = hazardTypeID;
        }

    }

    public static class Inconjunction {
        @JsonProperty("Country")
        private String country;

        @JsonProperty("Country")
        public String getCountry() {
            return country;
        }

        @JsonProperty("Country")
        public void setCountry(String country) {
            this.country = country;
        }
    }

    public static class Retailer {

        @JsonProperty("Name")
        private String name;
        @JsonProperty("CompanyID")
        private String companyID;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("Name")
        public String getName() {
            return name;
        }

        @JsonProperty("Name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("CompanyID")
        public String getCompanyID() {
            return companyID;
        }

        @JsonProperty("CompanyID")
        public void setCompanyID(String companyID) {
            this.companyID = companyID;
        }
    }

    public static class ManufacturerCountry {
        @JsonProperty("Country")
        private String country;

        @JsonProperty("Country")
        public String getCountry() {
            return country;
        }

        @JsonProperty("Country")
        public void setCountry(String country) {
            this.country = country;
        }

    }

    public static class ProductUPC {
        @JsonProperty("UPC")
        private String uPC;

        public String getUpc() {
            return uPC;
        }

        public void setUpc(String uPC) {
            this.uPC = uPC;
        }
    }

    public static class Injury {

        @JsonProperty("Name")
        private String name;

        @JsonProperty("Name")
        public String getName() {
            return name;
        }

        @JsonProperty("Name")
        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Image {

        private String uRL;

        @JsonProperty("URL")
        public String getURL() {
            return uRL;
        }

        @JsonProperty("URL")
        public void setURL(String uRL) {
            this.uRL = uRL;
        }

    }

    public static class RemedyOption {

        @JsonProperty("Option")
        private String option;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("Option")
        public String getOption() {
            return option;
        }

        @JsonProperty("Option")
        public void setOption(String option) {
            this.option = option;
        }

    }

    public static class Remedy {

        @JsonProperty("Name")
        private String name;

        @JsonProperty("Name")
        public String getName() {
            return name;
        }

        @JsonProperty("Name")
        public void setName(String name) {
            this.name = name;
        }

    }

}