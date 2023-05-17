package com.example.mobilprogramlamaproje;

public class Food {
        String ad;
        String kalori;

        int image;

        public Food(String ad, String kalori, int image) {
            this.ad = ad;
            this.kalori = kalori;
            this.image = image;
        }

        public int getImage() {
            return image;
        }

        public void setImage(int image) {
            this.image = image;
        }

        public String getAd() {
            return ad;
        }

        public void setAd(String ad) {
            this.ad = ad;
        }

        public String getKalori() {
            return kalori;
        }

        public void setKalori(String kalori) {
            this.kalori = kalori;
        }
    }

