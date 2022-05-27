# Project Web Programming Group 17
## 1. Mô tả dự án
  Tạo ra một trang web bán đồ thú cưng có giao diện thân thiện với người dùng.
  
## 2.Đóng góp của các thành viên trong nhóm 
  - Nguyễn Văn Lộc - B19DCCN402 (nhóm trưởng)
```
  Thiết kế cơ sở dữ liệu
  Khởi tạo Project
  Code các Business lớn
  Code các API của Backend
```
  - Nguyễn Mạnh Cường - B19DCCN084
```
  Thiết kế cơ sở dữ liệu
  Code toàn bộ Frontend
  Code các API phụ cho Backend
```
  - Đỗ Như Phong - B19DCCN498
```
  Thiết kế cơ sở dữ liệu
  Code các API phụ cho Backend
```
## 3.Mô tả cơ bản về chức năng 
- Chủ cửa hàng: đăng xuất, đăng nhập, thêm sửa xóa sản phẩm, cập nhật số lượng sản phẩm, viết blog, theo dõi các đơn hàng, duyệt đơn hàng xem thông kê doanh thu, tạo các account cho nhân viên, chat với khách hàng, trả lời feedback.
- Nhân viên cửa hàng: đăng xuất, đăng nhập, viết blog, tư vấn với khách hàng, duyệt đơn hàng, theo dõi các đơn hàng, trả lời feedback.
- Khách hàng không đăng nhập:đăng kí, vào cửa hàng, xem chi tiết sản phầm, tìm kiếm sản phẩm, thêm sản phẩm vào giỏ hàng, đọc blog nói chuyện với nhân viên cửa hàng.
- Khách hàng có đăng nhập: đăng xuất, chỉnh sửa thông tin cá nhân, vào cửa hàng, xem chi tiết sản phầm, tìm kiếm sản phầm, thêm sản phẩm vào giỏ hàng, xem thông tin đơn hàng đã đặt, đọc blog, nói chuyên với nhân viên cửa hàng, đặt hàng và chọn hình thức thanh toán, viết feedback, rating.

## 4.Thiết kế của hệ thống
- Cơ sở dữ liệu
![image](https://user-images.githubusercontent.com/89693547/170550121-50915f1b-378a-4afc-b613-6ec9247ec13a.png)

- Kiến trúc hệ thống

```
- Kiến trúc REST client-server 
- Front-end client giao tiếp với Back-end server thông qua REST API 
- Spring data JPA làm nhiệm vụ lấy data hoặc update data trên Database
```
![image](https://user-images.githubusercontent.com/89693547/170550422-e2069f91-0139-434e-8008-f63ccc4ca794.png)

## 5.Màn hình demo 
-Giao diệndiện Register
![image](https://user-images.githubusercontent.com/89693547/170550757-d471caac-3976-459e-94ee-2ed97ca8fcd8.png)

-Giao diện Login
![image](https://user-images.githubusercontent.com/89693547/170550799-a3324294-04b7-46a1-96f3-fce6d4df2e9a.png)
- Giao diện đăng ký Profile thú cưng
![image](https://user-images.githubusercontent.com/89693547/170646496-270dfc7b-b62c-4b07-b35b-6abc70ae40fc.png)
- Giao diện trang chủ
![image](https://user-images.githubusercontent.com/89693547/170551006-7b5aa6b5-2d2a-48b0-9683-8c0ec63b19a2.png)
![image](https://user-images.githubusercontent.com/89693547/170551018-8a0b07c5-e192-4294-83ff-ebd712948324.png)
![image](https://user-images.githubusercontent.com/89693547/170551034-2d36a192-c4a5-4d3b-b0b5-20ce6ed01e8e.png)
- Giao diện chi tiết sản phẩm
![image](https://user-images.githubusercontent.com/89693547/170551790-d8dbc85b-e50f-42e3-8a10-0e771ea46b20.png)
- Giao diện giỏ hàng
![image](https://user-images.githubusercontent.com/89693547/170551581-b378aa11-89aa-4107-8bc8-235e272b4f4d.png)
- Giao diện đặt đơn hàng
![image](https://user-images.githubusercontent.com/89693547/170551346-dd90cfe2-3c1e-49a0-b0d5-b29e509c2f14.png)
- Giao diện xem thông tin các đơn hàng đã đặt
![image](https://user-images.githubusercontent.com/89693547/170552214-f4dac531-6ecf-41fd-a513-a65aa4dee39a.png)
- Giao diện xem chi tiết đơn
![image](https://user-images.githubusercontent.com/89693547/170552285-827cf0c7-4171-4fbf-b92d-67beeda68d5a.png)
- Giao diện duyệt đơn hàng của ADMIN
![image](https://user-images.githubusercontent.com/89693547/170552424-a3993269-ae58-4fd6-bf9d-1c590e41f82c.png)



























