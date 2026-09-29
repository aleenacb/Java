while (left < right) {

    if (arr[left] % 2 == 0) {
        // left already has an even number
        left++;
    }

    else if (arr[right] % 2 != 0) {
        // right already has an odd number
        right--;
    }

    else {
        // left has odd AND right has even
        // NOW we need to swap
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;
    }
}
