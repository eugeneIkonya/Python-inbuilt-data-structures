from dronekit import connect

class connection:
    def connect_drone(self):
        my_drone=connect('')#ip address comes here for connection
        is_connected = False;#value for connection status
        if (my_drone.wait_ready is True): #to check if the drone connection was succesful
            is_connected=True
        return is_connected


