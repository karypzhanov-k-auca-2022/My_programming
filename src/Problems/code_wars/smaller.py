def smaller(arr):
    n = len(arr)
    result = [0] * n

    for i in range(n):
        count = 0
        for j in range(i + 1, n):
            if arr[j] < arr[i]:
                count += 1
        result[i] = count

    return result