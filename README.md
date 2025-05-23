# 🧪 Rest Assured ile API Test Otomasyonu

Bu proje, **Yazılım Test Mühendisliği** dersi kapsamında geliştirilen bir API test otomasyon projesidir. Java, Maven, JUnit4 ve Rest Assured kullanılarak online bir servise GET ve POST istekleri gönderilmiş; bu isteklerin sonuçları otomatik olarak test edilmiştir.

## 🚀 Kullanılan Teknolojiler

- Java 17  
- Maven  
- JUnit 4  
- Rest Assured 5.3.1  
- JSONPlaceholder API – https://jsonplaceholder.typicode.com  

## 🎯 Proje Amacı

Bu projede bir REST API'ye gönderilen HTTP isteklerinin:
- Doğru status kodu döndürüp döndürmediği,
- Gönderilen/verilen veriye karşılık doğru veri içerip içermediği,
- Yanıt süresinin yeterince hızlı olup olmadığı,
otomatik testlerle kontrol edilmiştir.

## ✅ Test Senaryoları

### 1. GET Testi – `getCommentById()`

- **Endpoint:** `GET /comments/1`
- **Beklenen Durum:** 
  - HTTP 200 OK
  - Yanıt süresi < 2000 ms
  - `email` alanı: `Eliseo@gardner.biz`


### 2. POST Testi – `getCommentById()`

- **Endpoint:** `postNewBlogEntry()`
- **Beklenen Durum:** 
  - HTTP 201 Created
  - Yanıt süresi < 2000 ms
  - `title` alanı: `Test Başlığı`


## SONUÇ
- Bu proje sayesinde bir REST API'nin işleyişi, doğruluğu ve hızı otomatik test senaryolarıyla başarılı bir şekilde test edilmiştir.
Rest Assured kütüphanesi sayesinde manuel test sürecine gerek kalmadan, hızlı ve güvenilir sonuçlar elde edilmiştir.

