package com.example.springdemo.util;

import com.example.springdemo.bean.User;

import java.io.Serializable;

// 实体类, po (dao),vo(service)
public class UserModel implements Serializable{
    //vo
        private String Key;
        private String id;
        private String account;
        private String pass;
        private String name;
        private String head;
        private String phone;
        private String email;
        private String sex;
        private String birthday;
        private String register_time;
        private String department_id;
        private String salt;
        public UserModel(){ }
        public UserModel(User user){
            this.setId(user.getId().toString());
            this.setName(user.getName());
            this.setPhone(user.getPhone());
            this.setEmail(user.getEmail());
            this.setSex(user.getSex()+"");
        }
        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getRegister_time() {
            return register_time;
        }

        public void setRegister_time(String register_time) {
            this.register_time = register_time;
        }

        public String getDepartment_id() {
            return department_id;
        }

        public void setDepartment_id(String department_id) {
            this.department_id = department_id;
        }

        public String getSalt() {
            return salt;
        }

        public void setSalt(String salt) {
            this.salt = salt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public String getPass() {
            return pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHead() {
            return head;
        }

        public void setHead(String head) {
            this.head = head;
        }
        public String getKey() {
            return Key;
        }

        public void setKey(String key) {
            Key = key;
        }


}
