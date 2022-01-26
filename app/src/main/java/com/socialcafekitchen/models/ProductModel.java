package com.socialcafekitchen.models;

import java.io.Serializable;

public class ProductModel implements Serializable {
    private int id;
    private String name;
    private String code;
    private String type;
    private String barcode_symbology;
    private int brand_id;
    private int category_id;
    private int unit_id;
    private int purchase_unit_id;
    private int sale_unit_id;
    private double cost;
    private double price;
    private double qty;
    private int alert_quantity;
    private String promotion;
    private String promotion_price;
    private String starting_date;
    private String last_date;
    private int tax_id;
    private int branch_id;
    private int tax_method;
    private String image;
    private String file;
    private String is_variant;
    private String is_batch;
    private int is_diffPrice;
    private int featured;
    private String product_list;
    private String qty_list;
    private String price_list;
    private String product_details;
    private int is_active;
    private String is_sale;
    private int times;
    private String created_at;
    private String updated_at;
    public Stock first_stock;
    private int count;
    private int selection;
    private TaxModel tax;
    private Unit unit;

    public ProductModel(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public String getBarcode_symbology() {
        return barcode_symbology;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public int getUnit_id() {
        return unit_id;
    }

    public int getPurchase_unit_id() {
        return purchase_unit_id;
    }

    public int getSale_unit_id() {
        return sale_unit_id;
    }

    public double getCost() {
        return cost;
    }

    public double getPrice() {
        return price;
    }

    public double getQty() {
        return qty;
    }

    public int getAlert_quantity() {
        return alert_quantity;
    }

    public String getPromotion() {
        return promotion;
    }

    public String getPromotion_price() {
        return promotion_price;
    }

    public String getStarting_date() {
        return starting_date;
    }

    public String getLast_date() {
        return last_date;
    }

    public int getTax_id() {
        return tax_id;
    }

    public int getBranch_id() {
        return branch_id;
    }

    public int getTax_method() {
        return tax_method;
    }

    public String getImage() {
        return image;
    }

    public String getFile() {
        return file;
    }

    public String getIs_variant() {
        return is_variant;
    }

    public String getIs_batch() {
        return is_batch;
    }

    public int getIs_diffPrice() {
        return is_diffPrice;
    }

    public int getFeatured() {
        return featured;
    }

    public String getProduct_list() {
        return product_list;
    }

    public String getQty_list() {
        return qty_list;
    }

    public String getPrice_list() {
        return price_list;
    }

    public String getProduct_details() {
        return product_details;
    }

    public int getIs_active() {
        return is_active;
    }

    public String getIs_sale() {
        return is_sale;
    }

    public int getTimes() {
        return times;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public Stock getFirst_stock() {
        return first_stock;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSelection() {
        return selection;
    }

    public void setSelection(int selection) {
        this.selection = selection;
    }

    public TaxModel getTax() {
        return tax;
    }

    public Unit getUnit() {
        return unit;
    }

    public class Stock implements Serializable {
        private int id;
        private int product_id;
        private String product_batch_id;
        private int branch_id;
        private String variant_id;
        private int warehouse_id;
        private double qty;
        private String price;
        private String created_at;
        private String updated_at;

        public int getId() {
            return id;
        }

        public int getProduct_id() {
            return product_id;
        }

        public String getProduct_batch_id() {
            return product_batch_id;
        }

        public int getBranch_id() {
            return branch_id;
        }

        public String getVariant_id() {
            return variant_id;
        }

        public int getWarehouse_id() {
            return warehouse_id;
        }

        public double getQty() {
            return qty;
        }

        public String getPrice() {
            return price;
        }

        public String getCreated_at() {
            return created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

    }


    public class Unit implements Serializable {
        private int id;
        private String unit_code;
        private String unit_name;
        private String base_unit;
        private String operator;
        private int operation_value;
        private int is_active;
        private String created_at;
        private String updated_at;

        public int getId() {
            return id;
        }

        public String getUnit_code() {
            return unit_code;
        }

        public String getUnit_name() {
            return unit_name;
        }

        public String getBase_unit() {
            return base_unit;
        }

        public String getOperator() {
            return operator;
        }

        public int getOperation_value() {
            return operation_value;
        }

        public int getIs_active() {
            return is_active;
        }

        public String getCreated_at() {
            return created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }
    }

}


