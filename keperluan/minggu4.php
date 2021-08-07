<?php
    include 'koneksi.php';
    $query = "SELECT * from minggu4"; 
    $result = $con->query($query);

    // Fetch all
    $data_minggu4 = $result->fetch_all(MYSQLI_ASSOC);

    echo json_encode($data_minggu4);

?>