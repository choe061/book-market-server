package com.bk.bm.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by choi on 2017. 9. 25. PM 4:01.
 */

@Data
@AllArgsConstructor
public class Sale {

    private int id;
    private int uid;
    private String isbn10;
    private String isbn13;
    private String title;
    private int price;
    private ArrayList<SaleArea> area;
    private ArrayList<SaleImage> images;
    private int status;
    private String comment;
    private Date created_at;
    private Date updated_at;

}
