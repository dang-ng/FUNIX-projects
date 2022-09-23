let numNeighbours = prompt('How many neighbor countries does your country have?');

if (Number(numNeighbours) === 1) {
    console.log('Only 1 border!');
} else if (numNeighbours > 1) {
    console.log('More than 1 border');
} else {
    console.log('No borders');
}

// So sánh bằng ===  được các lập trình viên khuyên dùng ngay cả khi ta phải thực hiện ép kiểu, trước khi so sánh, tốt hơn nên chuyển đổi kiểu một cách thủ công thay vì dùng ==. Vì code càng rõ ràng càng tốt, đỡ sai sót
