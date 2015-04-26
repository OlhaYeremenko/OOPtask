package Task0_variant10_Train;


import java.util.Date;


public class Train {

	private String destination;
	private String trainNumber;
	private Date departureTime;
	private int luxeCount;
	private int cupeCount;
	private int reservedCount;
	private int commonCount;

	public Train(String destination, String trainNumber, Date departureTime,
			int commonCount, int luxeCount, int cupeCount, int reservedCount) {
		try {
			setDestination(destination);
			setTrainNumber(trainNumber);
			setDepartureTime(departureTime);
			setCommonCount(commonCount);
			setCupeCount(cupeCount);
			setLuxeCount(luxeCount);
			setReservedCount(reservedCount);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void setCupeCount(int cupeCount) {

		if (cupeCount >= 0)
			this.cupeCount = cupeCount;
		else
			throw new IllegalArgumentException("Illegal cupe count");

	}

	public void setReservedCount(int reservedCount) {

		if (reservedCount >= 0)
			this.reservedCount = reservedCount;
		else
			throw new IllegalArgumentException("Illegal reserved count");

	}
	
	public void setCommonCount(int commonCount) {
		if (commonCount >= 0)
		this.commonCount = commonCount;
		else
			throw new IllegalArgumentException("Illegal common count");
	}

	public void setLuxeCount(int luxeCount) {

		if (luxeCount >= 0)
			this.luxeCount = luxeCount;
		else
			throw new IllegalArgumentException("Illegal luxe count");

	}

	public void setDestination(String destination) {

		if (destination != null)
			this.destination = destination;
		else
			throw new IllegalArgumentException("Illegal destination");

	}

	public void setTrainNumber(String trainNumber) {

		if (trainNumber != null)
			this.trainNumber = trainNumber;
		else
			throw new IllegalArgumentException("Illegal  train number");

	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public int getCupeCount() {
		return cupeCount;
	}

	public int getReservedCount() {
		return reservedCount;
	}

	public String getDestination() {
		return destination;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public int getCommonCount() {
		return commonCount;
	}



	public int getLuxeCount() {
		return luxeCount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nTrain: ");
		builder.append("[ TrainNumber=");
		builder.append(getTrainNumber());
		builder.append(", Destination=");
		builder.append(getDestination());
		builder.append(", Time=");
		builder.append(getDepartureTime());
		builder.append(", Common seats=");
		builder.append(getCommonCount());
		builder.append(", Luxe seats=");
		builder.append(getLuxeCount());
		builder.append(", Reserved seats=");
		builder.append(getReservedCount());
		builder.append("]");
		return builder.toString();

	}

}
