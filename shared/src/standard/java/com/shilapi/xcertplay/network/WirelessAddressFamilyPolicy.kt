package com.shilapi.xcertplay.network

/** The standard edition keeps the upstream address-family behaviour. */
internal object WirelessAddressFamilyPolicy {
    /** Upstream does not wait for an IPv4 address before publishing the hotspot endpoint. */
    const val WAIT_FOR_IPV4 = false

    /** Upstream publishes the IPv4 endpoint whenever the hotspot interface offers one. */
    const val PREFER_IPV4 = false
}
