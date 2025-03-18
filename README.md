# BookingPriceCalculator
## Đặc tả yêu cầu
Đây là chương trình với mục đích tính giá vé máy bay của 1 booking dựa trên 4 tham số đầu vào:
- `infants`: số lượng trẻ sơ sinh (dưới 2 tuổi), giá vé bằng 20% giá vé cơ bản
- `children`: số lượng trẻ em (từ 2-16 tuổi), giá vé bằng 80% giá vé cơ bản
- `adults`: số lượng người lớn (trên 16 tuổi), giá vé ngang với giá vé cơ bản
- `basePrice`: giá vé cơ bản của 1 chỗ ngồi trên máy bay, đơn vị VNĐ, kiểu dữ liệu double

Để là một booking hợp lệ thì cần thỏa mãn đồng thời các điều kiện sau:
- Các tham số đầu vào không có tham số nào có giá trị âm
- Số lượng hành khách trong một booking phải là số dương và không vượt quá 10
- Trong mỗi booking phải có ít nhất một người lớn
- Số lượng trẻ sơ sinh không vượt quá số lượng người lớn (do trẻ sơ sinh sẽ ngồi cùng chỗ với người lớn)
  
*Nếu có bất kỳ điều kiện nào không thỏa mãn tức là booking đó không hợp lệ, hàm sẽ trả về -1*    

Bên cạnh đó thì sẽ có những điều kiện sẽ làm thay đổi giá vé của 1 booking:
- Nếu tổng giá vé của booking khi chưa áp dụng discount lớn hơn 7 lần giá vé cơ bản, booking đó sẽ được giảm 10%
- Nếu tổng giá vé của booking khi chưa áp dụng discount lớn hơn 5 lần giá vé cơ bản, booking đó sẽ được giảm 5%
- Nếu số lượng trẻ em lớn hơn 3 thì giá vé của mỗi trẻ em sẽ tăng thêm 5% giá vé cơ bản

*Kết quả trả về của hàm là một số có kiểu dữ liệu double*

## Lưu ý
**Ở mã nguồn trong repo này, có một lỗi được cấy vào với mục đích xem các phương pháp kiểm thử có phát hiện ra lỗi đó hay không (lỗi ở đây là chưa xét trường hợp booking không có người lớn nhưng vẫn tính ra giá vé)**
