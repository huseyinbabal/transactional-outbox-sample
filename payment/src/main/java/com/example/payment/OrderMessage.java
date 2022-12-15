package com.example.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderMessage {

    private Payload payload;
    private Schema schema;

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class After{
        public int id;
        public Object create_time;
        public int customer_id;
        public String price;
        public String product_id;
        public Object update_time;
    }


    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Payload{
        public Object before;
        public After after;
        public Source source;
        public String op;
        public long ts_ms;
        public Object transaction;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Source{
        public String version;
        public String connector;
        public String name;
        public long ts_ms;
        public String snapshot;
        public String db;
        public Object sequence;
        public String table;
        public int server_id;
        public Object gtid;
        public String file;
        public int pos;
        public int row;
        public int thread;
        public Object query;
    }
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Schema{
        public String type;
        public ArrayList<Field> fields;
        public boolean optional;
        public String name;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Field{
        public String type;
        public ArrayList<Field> fields;
        public boolean optional;
        public String name;
        public String field;
        public int version;
        public Parameters parameters;
        @JsonProperty("default")
        public String mydefault;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Parameters{
        public String scale;
        @JsonProperty("connect.decimal.precision")
        public String connectDecimalPrecision;
        public String allowed;
    }
}
