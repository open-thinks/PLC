package com.openthinks.plc;

import com.openthinks.plc.core.common.Valueable;

/**
 * all constant field
 * 
 * @author dailey.yet@outlook.com
 *
 */
public interface BizConstant {

	/**
	 * 操作结果常量值
	 *
	 */
	public enum OperationResult implements Valueable<Integer> {
		SUCCESS {
			@Override
			public Integer value() {
				return 0;
			}
		},
		FAILED {
			@Override
			public Integer value() {
				return -1;
			}
		};

		public final static OperationResult valueOf(boolean isSuccess) {
			return isSuccess ? SUCCESS : FAILED;
		}
	}

	public enum YesNo {
		Y, N
	}

	public static String join(Enum<?>... enums) {
		if (enums == null || enums.length == 0) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (Enum<?> e : enums) {
			sb.append(e.name()).append(",");
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}

	public enum ShipStatus implements Valueable<Byte> {
		NOT_START(0), ONGOING(1), FINISHED(2), CANCELED(3), ALL(-1);

		private Byte code;

		private ShipStatus(int code) {
			this.code = (byte) code;
		}

		@Override
		public Byte value() {
			return code;
		}

		public static ShipStatus toShipStatus(int code) {
			for (ShipStatus status : ShipStatus.values()) {
				if (status.code == code) {
					return status;
				}
			}
			return null;
		}
	}

	public enum PackStatus implements Valueable<Byte> {
		AVAIABLE(0), LOST(1), DELIVERED(2), SHIPPING(3), ALL(-1);
		private Byte code;

		private PackStatus(int code) {
			this.code = (byte) code;
		}

		@Override
		public Byte value() {
			return code;
		}

		public static PackStatus toPackStatus(int code) {
			for (PackStatus status : PackStatus.values()) {
				if (status.code == code) {
					return status;
				}
			}
			return null;
		}

	}

	public enum CoordType implements Valueable<Byte> {
		GCJ_02(0), BD_09(1), WGS84(2), ALL(-1);
		private Byte code;

		private CoordType(int code) {
			this.code = (byte) code;
		}

		@Override
		public Byte value() {
			return code;
		}

		public static CoordType toCoordType(int code) {
			for (CoordType status : CoordType.values()) {
				if (status.code == code) {
					return status;
				}
			}
			return null;
		}
	}

}
