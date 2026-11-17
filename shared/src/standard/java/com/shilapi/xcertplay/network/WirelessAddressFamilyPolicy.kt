package com.shilapi.xcertplay.network

/** The standard edition keeps the upstream address-family behaviour. */
internal object WirelessAddressFamilyPolicy {
    /** Upstream does not wait for an IPv4 address before publishing the hotspot endpoint. */
    const val WAIT_FOR_IPV4 = false

    /** Upstream publishes the IPv4 endpoint whenever the hotspot interface offers one. */
    const val PREFER_IPV4 = false

    /** Upstream treats a disabled Wi-Fi radio as a hard stop for Wi-Fi Direct. */
    const val TRUST_WIFI_ENABLED_FLAG = true

    /** Upstream does not fall back to the car hotspot when Wi-Fi Direct cannot start. */
    const val CAR_HOTSPOT_FALLBACK = false
}
